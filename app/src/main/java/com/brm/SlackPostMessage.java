package com.brm;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents a message to be sent to a Slack channel.
 */
public class SlackPostMessage {

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("text")
    private String messageText;

    @JsonProperty("as_user")
    private boolean asUser;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public boolean isAsUser() {
        return asUser;
    }

    public void setAsUser(boolean asUser) {
        this.asUser = asUser;
    }

    @Override
    public String toString() {
        return "SlackPostMessage [channel=" + channel + ", messageText=" + messageText + ", asUser=" + asUser + "]";
    }
}
