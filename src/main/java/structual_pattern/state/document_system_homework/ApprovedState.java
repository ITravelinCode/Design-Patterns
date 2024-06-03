package structual_pattern.state.document_system_homework;

public class ApprovedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Approved a document");
    }
}
