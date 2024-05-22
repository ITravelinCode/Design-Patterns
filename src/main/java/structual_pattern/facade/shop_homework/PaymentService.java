package structual_pattern.facade.shop_homework;
/**
 * Subsystem Classes: Các lớp hệ thống con thực hiện các chức năng chính.
 * Facade sẽ tương tác với các lớp này để thực hiện các nhiệm vụ phức tạp.
 * Ngược lại, các lớp con này thì không cần biết Facade và không tham chiếu đến nó*/
public class PaymentService {
    public void payByPaypal() {
        System.out.println("Paying by Paypal");
    }

    public void payByCredit() {
        System.out.println("Paying by Credit");
    }

    public void payByEBankingAccount() {
        System.out.println("Paying by EBanking Account");
    }

    public void payByCash() {
        System.out.println("Paying by Cash");
    }
}
