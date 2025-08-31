public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public String processPayment(double amount) {
        return "Paid via UPI: " + amount;
    }
    
    @Override
    public boolean supportsProvider(String provider) {
        return "UPI".equals(provider);
    }
} 