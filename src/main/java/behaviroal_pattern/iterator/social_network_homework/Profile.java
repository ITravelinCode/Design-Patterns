package behaviroal_pattern.social_network_homework;

public class Profile {
    private String profileId;
    private String type;

    private String email;

    public Profile(String profileId, String type, String email) {
        this.profileId = profileId;
        this.type = type;
        email = email;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
