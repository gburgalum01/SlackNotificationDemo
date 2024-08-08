package com.brm;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class specifies the methods for executing logic to communicate with Slack.
 */
public class SlackService {
    
    private String botToken;

    public SlackService(String botToken) {
        this.botToken = botToken;
    }

    /**
     * This method triggers the sending of a message to a user with the given e-mail address.
     * 
     * @param userEmailAddress the e-mail address of the Slack user to whom the message is to be sent
     * @param message the message to be sent to the Slack user
     */
    public void sendNotification(String userEmailAddress, String message) {

        try {
            //Find the identifier of the Slack user by e-mail address.
            String userId = findSlackUserIdByEmail(userEmailAddress);

            //Open a direct message channel to the Slack user.
            String channelId = openDirectMessageChannelToSlackUser(userId);

            //Send the notification message to the Slack user.
            sendDirectMessageToSlackChannel(channelId, message);
        }
        catch (Exception e) {
            System.err.println("The Slack notification was not able to be sent.  Error: " + e.getMessage());
        }
    }

    /**
     * This method looks up the identifier of a Slack user using the e-mail address.
     * 
     * @param userEmailAddress the e-mail address of the Slack user for which the identifier is to be found
     * @return the identifier of the user
     * @throws Exception an error that occurred when looking up the identifier of a Slack user using the e-mail address
     */
    private String findSlackUserIdByEmail(String userEmailAddress) throws Exception {

        String apiUrl = "https://slack.com/api/users.lookupByEmail";

        HttpGet httpGet = new HttpGet(apiUrl);
        
        //Build the URI which contains the user e-mail address to be sent as a parameter.
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("email", userEmailAddress));
        try {
            URI uri = new URIBuilder(new URI(apiUrl))
                .addParameters(nvps)
                .build();
            httpGet.setUri(uri);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        
        //Set JSON as the type to accept, the content type of the request, and the token needed to invoke the API
        //in the header of the request.
        httpGet.setHeader("Accept", "application/json");
        httpGet.setHeader("Content-Type", "application/x-www-form-urlencoded");
        httpGet.setHeader("Authorization", "Bearer " + this.botToken);

        //Configure the response handler which will return the result of the web service invocation.
        HttpClientResponseHandler<SlackUsersLookupByEmailResponse> responseHandler = response -> {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.getEntity().getContent(), SlackUsersLookupByEmailResponse.class);
        };

        //Invoke the web service.  If the call was successful, return the identifier of the Slack user to whom the message 
        //is to be sent.  Otherwise, throw an exception.
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            SlackUsersLookupByEmailResponse lookupResponse = httpClient.execute(httpGet, responseHandler);
            if (lookupResponse.isOk()) {
                return lookupResponse.getUser().getId();
            }
            else {
                throw new Exception("Slack API Error: " + lookupResponse.getError());
            }
        }
        catch (Exception e) {
            throw new Exception("The Slack user id could not be looked up by e-mail address.  Error: " + e.getMessage());
        }
    }

    /**
     * This methid opens a direct message channel to the Slack user with the specified identifier and returns
     * the identifier of the channel to be used for communication.
     * 
     * @param userId the identifier of the user to whom a direct message channel is to be opened
     * @return the identifier of the direct message channel opened to the user
     * @throws Exception an error that occurred while opening a direct message channel to the Slack user
     */
    private String openDirectMessageChannelToSlackUser(String userId) throws Exception {

        String apiUrl = "https://slack.com/api/conversations.open";

        HttpGet httpGet = new HttpGet(apiUrl);
        
        //Build the URI which contains the identifier of the Slack user to whom a channel is to be opened.
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("users", userId));
        try {
            URI uri = new URIBuilder(new URI(apiUrl))
                .addParameters(nvps)
                .build();
            httpGet.setUri(uri);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        
        //Set JSON as the type to accept, the content type of the request, and the token needed to invoke the API
        //in the header of the request.
        httpGet.setHeader("Accept", "application/json");
        httpGet.setHeader("Content-Type", "application/x-www-form-urlencoded");
        httpGet.setHeader("Authorization", "Bearer " + this.botToken);

        //Configure the response handler which will return the result of the web service invocation.
        HttpClientResponseHandler<SlackImOpenResponse> responseHandler = response -> {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.getEntity().getContent(), SlackImOpenResponse.class);
        };

        //Invoke the web service.  If the call was successful, return the identifier of the channel opened to the Slack user 
        //to whom the message is to be sent.  Otherwise, throw an exception.
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            SlackImOpenResponse imOpenResponse = httpClient.execute(httpGet, responseHandler);
            if (imOpenResponse.isOk()) {
                return imOpenResponse.getChannel().getId();
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            throw new Exception("The direct message channel to the Slack user could not be opened.  Error: " + e.getMessage());
        }
    }    

    /**
     * This method sends a direct message to the Slack channel with the given identifier.
     * 
     * @param channelId the identifier of the channel to which a direct message is to be sent
     * @param message the message to be sent to the Slack channel
     * @throws Exception an error that occurred while sending a direct message to a Slack channel
     */
    private void sendDirectMessageToSlackChannel(String channelId, String message) throws Exception {

        String apiUrl = "https://slack.com/api/chat.postMessage";

        HttpPost httpPost = new HttpPost(apiUrl);
    
        //Build the object containing the message to be sent to the Slack user as well as the 
        //identifier of the channel representing the connection to the user.
        SlackPostMessage messageToPost = new SlackPostMessage();
        messageToPost.setChannel(channelId);
        messageToPost.setMessageText(message);
        messageToPost.setAsUser(true);
        String messageToPostJSON = new ObjectMapper().writeValueAsString(messageToPost);
        
        //Set JSON as the type to accept, the content type of the request, the token needed to invoke the API
        //in the header of the request, and the object containing the message parameters.
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Authorization", "Bearer " + this.botToken);
        httpPost.setEntity(new StringEntity(messageToPostJSON));

        //Configure the response handler which will return the result of the web service invocation.
        HttpClientResponseHandler<SlackChatPostMessageResponse> responseHandler = response -> {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.getEntity().getContent(), SlackChatPostMessageResponse.class);
        };

        //Invoke the web service.  If the call was successful, print out a message to the console indicating as such.  
        //Otherwise, throw an exception.
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            SlackChatPostMessageResponse postMessageResponse = httpClient.execute(httpPost, responseHandler);

            if (postMessageResponse.isOk()) {
                System.out.println("The message was successfully sent to the Slack user.");
            }
            else {
                throw new Exception("Slack API Error: " + postMessageResponse.getError());
            }
        }
        catch (Exception e) {
            throw new Exception("The direct message to the Slack user could not be sent.  Error: " + e.getMessage());
        }
    }     
}
