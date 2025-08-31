public class StandardShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
    
    @Override
    public boolean supportsType(String type) {
        return "STANDARD".equals(type);
    }
} 