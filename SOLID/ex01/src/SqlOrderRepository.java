public class SqlOrderRepository implements OrderRepository {
    @Override
    public void save(String customerEmail, double total) {
        System.out.println("Order stored (pretend DB).");
    }
} 