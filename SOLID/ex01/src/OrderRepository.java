public interface OrderRepository {
    void save(String customerEmail, double total);
} 