package structual_pattern.state.document_system_homework;

public class RejectedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Rejected a document");
    }
}
