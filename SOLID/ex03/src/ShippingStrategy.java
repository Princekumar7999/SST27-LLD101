public interface ShippingStrategy {
    double calculateCost(double weightKg);
    boolean supportsType(String type);
} 