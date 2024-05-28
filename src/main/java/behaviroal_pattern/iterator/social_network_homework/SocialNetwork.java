package behaviroal_pattern.iterator.social_network_homework;
/**
 * Iterable Collection: Là lớp interface hoặc abstrac class định nghĩa các phương thức
 * để tạo Iterator tương thích. */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}
