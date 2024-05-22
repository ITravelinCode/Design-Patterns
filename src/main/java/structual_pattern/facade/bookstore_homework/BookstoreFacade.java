package structual_pattern.facade.bookstore_homework;
/**
 * Facade: Facade nắm rõ hệ thống con hoặc dịch vụ nào đảm nhiệm việc đáp ứng yêu cầu của client.
 * Đây là nơi chuyển yêu cầu của client đến các đối tượng hệ thống con tương ứng*/
public class BookstoreFacade {
    private static BookstoreFacade instance;
    private final AccountService accountService;
    private final EmailService emailService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final BookstoreService bookstoreService;

    public static BookstoreFacade getInstance() {
        if(instance == null) return new BookstoreFacade();
        return instance;
    }

    //Dependency Injection
    private BookstoreFacade() {
        this.accountService = new AccountService();
        this.emailService = new EmailService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.bookstoreService = new BookstoreService();
    }

    public void buyBookOfBachDangBookstoreByCreditWithFreeShipping(String email) {
        accountService.getAccount(email);
        emailService.sendEmail(bookstoreService.BackDangBookStore(), paymentService.payByCredit() + "\n" +
                shippingService.shipForFree()
                );
    }
}
