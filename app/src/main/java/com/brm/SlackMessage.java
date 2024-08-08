package com.brm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents a Slack message.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackMessage {

    @JsonProperty("type")
    private String type;

    @JsonProperty("subtype")
    private String subType;

    @JsonProperty("text")
    private String text;

    @JsonProperty("ts")
    private String timestamp;

    @JsonProperty("username")
    private String userName;

    @JsonProperty("bot_id")
    private String botId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    @Override
    public String toString() {
        return "SlackMessage [type=" + type + ", subType=" + subType + ", text=" + text + ", timestamp=" + timestamp
                + ", userName=" + userName + ", botId=" + botId + "]";
    }
}
