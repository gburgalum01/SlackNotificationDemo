package com.brm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents a Slack user.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackUser {

    @JsonProperty("id")
    private String id;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("deleted")
    private boolean deleted;

    @JsonProperty("coolor")
    private String color;

    @JsonProperty("real_name")
    private String realName;

    @JsonProperty("tz")
    private String timeZone;

    @JsonProperty("tz_label")
    private String timeZoneLabel;

    @JsonProperty("tz_offset")
    private String timeZoneOffset;

    @JsonProperty("profile")
    private SlackUserProfile profile;

    @JsonProperty("is_admin")
    private boolean isAdmin;

    @JsonProperty("is_owner")
    private boolean isOwner;

    @JsonProperty("is_primary_owner")
    private boolean isPrimaryOwner;

    @JsonProperty("is_restricted")
    private boolean isRestricted;

    @JsonProperty("is_ultra_restricted")
    private boolean isUltraRestricted;

    @JsonProperty("is_bot")
    private boolean isBot;

    @JsonProperty("is_app_user")
    private boolean isAppUser;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("is_email_confirmed")
    private boolean isEmailConfirmed;

    @JsonProperty("who_can_share_contact_card")
    private String whoCanShareContactCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeZoneLabel() {
        return timeZoneLabel;
    }

    public void setTimeZoneLabel(String timeZoneLabel) {
        this.timeZoneLabel = timeZoneLabel;
    }

    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(String timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    public SlackUserProfile getProfile() {
        return profile;
    }

    public void setProfile(SlackUserProfile profile) {
        this.profile = profile;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public void setPrimaryOwner(boolean isPrimaryOwner) {
        this.isPrimaryOwner = isPrimaryOwner;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public boolean isUltraRestricted() {
        return isUltraRestricted;
    }

    public void setUltraRestricted(boolean isUltraRestricted) {
        this.isUltraRestricted = isUltraRestricted;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean isBot) {
        this.isBot = isBot;
    }

    public boolean isAppUser() {
        return isAppUser;
    }

    public void setAppUser(boolean isAppUser) {
        this.isAppUser = isAppUser;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    public void setEmailConfirmed(boolean isEmailConfirmed) {
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public String getWhoCanShareContactCard() {
        return whoCanShareContactCard;
    }

    public void setWhoCanShareContactCard(String whoCanShareContactCard) {
        this.whoCanShareContactCard = whoCanShareContactCard;
    }

    @Override
    public String toString() {
        return "SlackUser [id=" + id + ", teamId=" + teamId + ", name=" + name + ", deleted=" + deleted + ", color="
                + color + ", realName=" + realName + ", timeZone=" + timeZone + ", timeZoneLabel=" + timeZoneLabel
                + ", timeZoneOffset=" + timeZoneOffset + ", profile=" + profile + ", isAdmin=" + isAdmin + ", isOwner="
                + isOwner + ", isPrimaryOwner=" + isPrimaryOwner + ", isRestricted=" + isRestricted
                + ", isUltraRestricted=" + isUltraRestricted + ", isBot=" + isBot + ", isAppUser=" + isAppUser
                + ", updated=" + updated + ", isEmailConfirmed=" + isEmailConfirmed + ", whoCanShareContactCard="
                + whoCanShareContactCard + "]";
    }
}
