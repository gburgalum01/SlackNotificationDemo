package com.brm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response returned from Slack when posting a message.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackChatPostMessageResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("ts")
    private String timestamp;

    @JsonProperty("message")
    private SlackMessage message;

    @JsonProperty("error")
    private String error;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public SlackMessage getMessage() {
        return message;
    }

    public void setMessage(SlackMessage message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "SlackChatPostMessageResponse [ok=" + ok + ", channel=" + channel + ", timestamp=" + timestamp
                + ", message=" + message + ", error=" + error + "]";
    }
}
