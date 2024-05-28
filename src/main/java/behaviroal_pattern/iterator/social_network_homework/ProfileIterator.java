package behaviroal_pattern.iterator.social_network_homework;
/**
 * Iterator: Là một interface hoặc abstract class định nghĩa các phương thức cần thiết để
 * duyệt qua một collection như hasMore(), getNext()*/
public interface ProfileIterator {
    Profile getNext();
    boolean hasMore();
}
