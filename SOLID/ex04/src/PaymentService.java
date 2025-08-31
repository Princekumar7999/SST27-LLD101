import java.util.List;
import java.util.Arrays;

public class PaymentService {
    private final List<PaymentProcessor> processors;
    
    public PaymentService() {
        this.processors = Arrays.asList(
            new CardPaymentProcessor(),
            new UpiPaymentProcessor(),
            new WalletPaymentProcessor()
        );
    }
    
    public String pay(Payment payment) {
        for (PaymentProcessor processor : processors) {
            if (processor.supportsProvider(payment.provider)) {
                return processor.processPayment(payment.amount);
            }
        }
        throw new RuntimeException("No provider");
    }
}