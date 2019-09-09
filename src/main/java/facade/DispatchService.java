package facade;

import java.time.LocalDate;

public class DispatchService {

    public LocalDate send(Product product, String address) {
        System.out.println(String.format("Sending product %s to adress %s",
                product.getName(), address));
        return LocalDate.now().plusDays(3);
    }
}
