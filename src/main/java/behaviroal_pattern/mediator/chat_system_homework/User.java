package behaviroal_pattern.mediator.chat_system_homework;
/**
 * Colleague: Lớp trừu tượng (abstract class) định nghĩa các phương thức, các thuộc tính và giữ tham chiếu đến Mediator*/
public abstract class User {
    protected IChatMediator mediator;
    protected String name;

    public User(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
