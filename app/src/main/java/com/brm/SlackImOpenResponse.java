package com.brm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the response returned from Slack on trying to open a direct message channel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackImOpenResponse {

    @JsonProperty("ok")
    private boolean ok;

    @JsonProperty("no_op")
    private boolean noOp;

    @JsonProperty("already_open")
    private boolean alreadyOpen;

    @JsonProperty("channel")
    private SlackChannel channel;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public boolean isNoOp() {
        return noOp;
    }

    public void setNoOp(boolean noOp) {
        this.noOp = noOp;
    }

    public boolean isAlreadyOpen() {
        return alreadyOpen;
    }

    public void setAlreadyOpen(boolean alreadyOpen) {
        this.alreadyOpen = alreadyOpen;
    }

    public SlackChannel getChannel() {
        return channel;
    }

    public void setChannel(SlackChannel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "SlackImOpenResponse [ok=" + ok + ", noOp=" + noOp + ", alreadyOpen=" + alreadyOpen + ", channel="
                + channel + "]";
    }
}
