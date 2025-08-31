public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Charged card: " + amount;
    }
    
    @Override
    public boolean supportsProvider(String provider) {
        return "CARD".equals(provider);
    }
} 