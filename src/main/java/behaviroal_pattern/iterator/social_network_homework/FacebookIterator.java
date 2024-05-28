package behaviroal_pattern.iterator.social_network_homework;
/**
 * Concrete Iterator: là lớp triển khai Iterator*/
public class FacebookIterator implements ProfileIterator{
    private final Facebook facebook;
    private final String profileId;
    private final String type;
    private Profile[] cache;
    private int currentPosition;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
        this.currentPosition = 0;
    }

    @Override
    public Profile getNext() {
        return cache[currentPosition++];
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }

    private void lazyInit() {
        if(cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }
}
