public interface PaymentProcessor {
    String processPayment(double amount);
    boolean supportsProvider(String provider);
} 