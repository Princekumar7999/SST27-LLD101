public class OrderService {
    private final TaxCalculator taxCalculator;
    private final EmailService emailService;
    private final OrderRepository orderRepository;
    
    public OrderService(TaxCalculator taxCalculator, EmailService emailService, OrderRepository orderRepository) {
        this.taxCalculator = taxCalculator;
        this.emailService = emailService;
        this.orderRepository = orderRepository;
    }
    
    public void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        emailService.send(customerEmail, "Thanks! Your total is " + total);
        orderRepository.save(customerEmail, total);
    }
}