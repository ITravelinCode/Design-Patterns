package structual_pattern.state.document_system_homework;

public class SubmittedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Submitted a document");
    }
}
