package behaviroal_pattern.mediator.chat_system_homework;
/**
 * ConcreteColleague: cài đặt các phương thức của Colleague.
 * Giao tiếp thông qua Mediator khi cần giao tiếp với các Colleague khác.*/
public class UserImpl extends User {
    public UserImpl(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("-----");
        System.out.println(this.name + " is sending the message: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " is received the message: " + msg);
    }
}
