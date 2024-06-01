package behaviroal_pattern.mediator.chat_system_homework;
/**
 * Mediator: Interface hoặc Abstract class định nghĩa các phương thức
 * để giao tiếp đến các Colleague object*/
public interface IChatMediator {
    void addUser(User user);
    void sendMessage(String msg, User user);
}
