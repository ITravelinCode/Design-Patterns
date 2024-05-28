package behaviroal_pattern.observer.system_manager_homework;
/**
 * Concrete Observer: Lớp cụ thể triển khai Observer,
 * cập nhật trạng thái thay đổi của nó để phản hồi đến Subject.*/
public class DebuggingListener implements EventListener{
    private final EventManager eventManager;

    public DebuggingListener(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public void update() {
        System.out.println("DebuggingListener debugged: " + eventManager.getData());
    }
}
