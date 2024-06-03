package structual_pattern.state.document_system_homework;

public class CreationState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Create a document");
    }
}
