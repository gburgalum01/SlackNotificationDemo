package com.brm;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the profile for a Slack user.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackUserProfile {

    @JsonProperty("title")
    private String title;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("skype")
    private String skype;

    @JsonProperty("real_name")
    private String realName;

    @JsonProperty("real_name_normalized")
    private String realNameNormalized;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("display_name_normalized")
    private String displayNameNormalized;

    @JsonProperty("fields")
    private String fields;

    @JsonProperty("status_text")
    private String statusText;

    @JsonProperty("status_emoji")
    private String statusEmoji;

    @JsonProperty("status_emoji_display_info")
    private List<String> statusEmojiDisplayInfo;

    @JsonProperty("status_expiration")
    private String statusExpiration;

    @JsonProperty("avatar_hash")
    private String avatarHash;

    @JsonProperty("email")
    private String email;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("image_24")
    private String image24;

    @JsonProperty("image_32")
    private String image32;

    @JsonProperty("image_48")
    private String image48;

    @JsonProperty("image_72")
    private String image72;

    @JsonProperty("image_192")
    private String image192;

    @JsonProperty("image_512")
    private String image512;

    @JsonProperty("status_text_canonical")
    private String statusTextCanonical;

    @JsonProperty("team")
    private String team;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealNameNormalized() {
        return realNameNormalized;
    }

    public void setRealNameNormalized(String realNameNormalized) {
        this.realNameNormalized = realNameNormalized;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayNameNormalized() {
        return displayNameNormalized;
    }

    public void setDisplayNameNormalized(String displayNameNormalized) {
        this.displayNameNormalized = displayNameNormalized;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getStatusEmoji() {
        return statusEmoji;
    }

    public void setStatusEmoji(String statusEmoji) {
        this.statusEmoji = statusEmoji;
    }

    public List<String> getStatusEmojiDisplayInfo() {
        return statusEmojiDisplayInfo;
    }

    public void setStatusEmojiDisplayInfo(List<String> statusEmojiDisplayInfo) {
        this.statusEmojiDisplayInfo = statusEmojiDisplayInfo;
    }

    public String getStatusExpiration() {
        return statusExpiration;
    }

    public void setStatusExpiration(String statusExpiration) {
        this.statusExpiration = statusExpiration;
    }

    public String getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage24() {
        return image24;
    }

    public void setImage24(String image24) {
        this.image24 = image24;
    }

    public String getImage32() {
        return image32;
    }

    public void setImage32(String image32) {
        this.image32 = image32;
    }

    public String getImage48() {
        return image48;
    }

    public void setImage48(String image48) {
        this.image48 = image48;
    }

    public String getImage72() {
        return image72;
    }

    public void setImage72(String image72) {
        this.image72 = image72;
    }

    public String getImage192() {
        return image192;
    }

    public void setImage192(String image192) {
        this.image192 = image192;
    }

    public String getImage512() {
        return image512;
    }

    public void setImage512(String image512) {
        this.image512 = image512;
    }

    public String getStatusTextCanonical() {
        return statusTextCanonical;
    }

    public void setStatusTextCanonical(String statusTextCanonical) {
        this.statusTextCanonical = statusTextCanonical;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "SlackUserProfile [title=" + title + ", phone=" + phone + ", skype=" + skype + ", realName=" + realName
                + ", realNameNormalized=" + realNameNormalized + ", displayName=" + displayName
                + ", displayNameNormalized=" + displayNameNormalized + ", fields=" + fields + ", statusText="
                + statusText + ", statusEmoji=" + statusEmoji + ", statusEmojiDisplayInfo=" + statusEmojiDisplayInfo
                + ", statusExpiration=" + statusExpiration + ", avatarHash=" + avatarHash + ", email=" + email
                + ", firstName=" + firstName + ", lastName=" + lastName + ", image24=" + image24 + ", image32="
                + image32 + ", image48=" + image48 + ", image72=" + image72 + ", image192=" + image192 + ", image512="
                + image512 + ", statusTextCanonical=" + statusTextCanonical + ", team=" + team + "]";
    }
}
