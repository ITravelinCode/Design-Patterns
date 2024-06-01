package behaviroal_pattern.mediator.chat_system_homework;

import java.util.ArrayList;
import java.util.List;
/**
 * ConcreteMediator: Lớp cụ thễ triển khai Mediator, giúp điều phối và quản lý sự giao tiếp giữa các Colleague*/
public class ChatMediator implements IChatMediator{
    private List<User> users;
    public ChatMediator(String groupName) {
        System.out.println(groupName + " group was created");
        users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.name + " was added in group");
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : users) {
            if(u.equals(user)) {
                u.receive(msg);
            }
        }
    }
}
