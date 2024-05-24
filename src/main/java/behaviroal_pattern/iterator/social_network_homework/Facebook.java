package behaviroal_pattern.social_network_homework;
/**
 * Concrete Collection: Lớp implement Iterable Collection*/
public class Facebook implements SocialNetwork{
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "Friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "Coworkers");
    }

    public Profile[] socialGraphRequest(String profileId, String type) {
        return new Profile[]{new Profile(profileId, type, "")};
    }
}
