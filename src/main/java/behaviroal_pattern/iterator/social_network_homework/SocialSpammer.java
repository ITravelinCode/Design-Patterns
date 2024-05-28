package behaviroal_pattern.iterator.social_network_homework;

public class SocialSpammer {
    void send(ProfileIterator profileIterator, String message) {
        while (profileIterator.hasMore()) {
            Profile profile = profileIterator.getNext();
            System.out.println("To " + profile.getEmail() + " With message: " + message);
        }
    }
}
