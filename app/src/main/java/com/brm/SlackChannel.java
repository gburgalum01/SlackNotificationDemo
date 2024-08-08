package com.brm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents a Slack channel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackChannel {

    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SlackChannel [id=" + id + "]";
    }
}
