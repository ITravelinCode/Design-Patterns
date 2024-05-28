package behaviroal_pattern.iterator.social_network_homework;

public class Application {
    public static void main(String[] args) {
        Profile profile = new Profile("1", "Coworkers", "test@test.com");
        SocialNetwork facebook = new Facebook();
        SocialSpammer spammer = new SocialSpammer();
        ProfileIterator iterator = facebook.createCoworkersIterator(profile.getProfileId());
        spammer.send(iterator, "Very love you");
    }
}
