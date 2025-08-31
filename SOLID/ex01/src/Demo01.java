

public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        EmailService emailService = new EmailClient();
        OrderRepository orderRepository = new SqlOrderRepository();
        
        OrderService orderService = new OrderService(taxCalculator, emailService, orderRepository);
        orderService.checkout("a@shop.com", 100.0);
    }
}