package structual_pattern.facade.shop_homework;
/**
 * Facade: Facade nắm rõ hệ thống con hoặc dịch vụ nào đảm nhiệm việc đáp ứng yêu cầu của client.
 * Đây là nơi chuyển yêu cầu của client đến các đối tượng hệ thống con tương ứng*/
public class ShopFacade {

    private static ShopFacade instance;
    private final AccountService accountService;
    private final EmailService emailService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public ShopFacade() {
        this.accountService = new AccountService();
        this.emailService = new EmailService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }
    public static ShopFacade getInstance() {
        if (instance == null) return  new ShopFacade();
        return instance;
    }

    public void buyProductByCashWithFreeShipping(String email) {
        accountService.getAccount(email);
        paymentService.payByCash();
        shippingService.shipForFree();
        emailService.sendEmail(email);
    }

    public void buyProductByPaypalWithExpressShipping(String email) {
        accountService.getAccount(email);
        paymentService.payByPaypal();
        shippingService.shipForExpress();
        emailService.sendEmail(email);
    }
}
