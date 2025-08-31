import java.util.List;
import java.util.Arrays;

public class ShippingCostCalculator {
    private final List<ShippingStrategy> strategies;
    
    public ShippingCostCalculator() {
        this.strategies = Arrays.asList(
            new StandardShippingStrategy(),
            new ExpressShippingStrategy(),
            new OvernightShippingStrategy()
        );
    }
    
    public double cost(Shipment shipment) {
        for (ShippingStrategy strategy : strategies) {
            if (strategy.supportsType(shipment.type)) {
                return strategy.calculateCost(shipment.weightKg);
            }
        }
        throw new IllegalArgumentException("Unknown type: " + shipment.type);
    }
}