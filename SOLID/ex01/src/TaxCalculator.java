public class TaxCalculator {
    private static final double TAX_RATE = 0.18;
    
    public double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }
    
    public double calculateTotalWithTax(double subtotal) {
        return subtotal + calculateTax(subtotal);
    }
} 