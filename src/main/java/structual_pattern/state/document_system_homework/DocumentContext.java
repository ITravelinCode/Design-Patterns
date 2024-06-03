package structual_pattern.state.document_system_homework;
/**
 * Context: Là lớp được sử dụng bởi Client. Client không truy cập trực tiếp đến
 * State mà phải thông qua class Context này.*/
public class DocumentContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }
    public void applyState(){
        this.state.handleRequest();
    }
}
