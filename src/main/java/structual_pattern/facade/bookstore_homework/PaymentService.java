package structual_pattern.facade.bookstore_homework;
/**
 * Subsystem Classes: Các lớp hệ thống con thực hiện các chức năng chính.
 * Facade sẽ tương tác với các lớp này để thực hiện các nhiệm vụ phức tạp.
 * Ngược lại, các lớp con này thì không cần biết Facade và không tham chiếu đến nó*/
public class PaymentService {
    public String payByPaypal() {
        return "Paying by Paypal";
    }

    public String payByCredit() {
        return "Paying by Credit";
    }

    public String payByEBankingAccount() {
        return "Paying by EBanking Account";
    }

    public String payByCash() {
        return "Paying by Cash";
    }
}
