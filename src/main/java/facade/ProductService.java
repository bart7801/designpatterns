package facade;

import java.util.Random;

public class ProductService {

    public Product buy(String name) {
        System.out.println("searching product by name");
        Random random = new Random();
        Product product = new Product(name, random.nextDouble() * 1000);
        System.out.println("you have bought product " + name);
        return product;
    }
}
