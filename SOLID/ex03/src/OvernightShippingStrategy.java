public class OvernightShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double weightKg) {
        return 120 + 10 * weightKg;
    }
    
    @Override
    public boolean supportsType(String type) {
        return "OVERNIGHT".equals(type);
    }
} 