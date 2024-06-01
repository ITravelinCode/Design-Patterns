package behaviroal_pattern.mediator.chat_system_homework;

public class ChatClient {
    public static void main(String[] args) {
        IChatMediator chatMediator = new ChatMediator("Learn Design Patter");
        User admin = new UserImpl(chatMediator, "Chat GPTer");
        User user1 = new UserImpl(chatMediator, "User 1");
        chatMediator.addUser(admin);
        chatMediator.addUser(user1);

        admin.send("Hi all");
        user1.send("Hi GPT");
    }
}
