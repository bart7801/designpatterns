package facade;

import java.time.LocalDate;

public class ShoppingFacade {

    private ProductService productService = new ProductService();
    private BillingService billingService = new BillingService();
    private DispatchService dispatchService = new DispatchService();

    public LocalDate buy(String name, String creditCardNumber, String address) {
        Product product = productService.buy(name);
        boolean result = billingService
                .bill(creditCardNumber, product.getPrice());
        if (!result) {
            System.out.println("billing failed");
        }
        return dispatchService.send(product, address);
    }
}
