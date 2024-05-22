package structual_pattern.facade.bookstore_homework;
/**
 * Subsystem Classes: Các lớp hệ thống con thực hiện các chức năng chính.
 * Facade sẽ tương tác với các lớp này để thực hiện các nhiệm vụ phức tạp.
 * Ngược lại, các lớp con này thì không cần biết Facade và không tham chiếu đến nó*/
public class AccountService {
    public void getAccount(String email) {
        System.out.println("Getting account by " + email);
    }
}
