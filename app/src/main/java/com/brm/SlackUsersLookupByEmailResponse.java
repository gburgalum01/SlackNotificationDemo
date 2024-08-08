package com.brm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response returned from Slack when attempting to look up a user by e-mail address.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackUsersLookupByEmailResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("user")
    private SlackUser user;

    @JsonProperty("error")
    private String error;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public SlackUser getUser() {
        return user;
    }

    public void setUser(SlackUser user) {
        this.user = user;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "SlackUsersLookupByEmailResponse [ok=" + ok + ", user=" + user + ", error=" + error + "]";
    }
}
