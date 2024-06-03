package structual_pattern.state.document_system_homework;

public class DocumentMain {
    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        context.setState(new CreationState());
        context.applyState();
        context.setState(new ApprovedState());
        context.applyState();
    }
}
