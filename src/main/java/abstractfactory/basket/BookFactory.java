
package abstractfactory.basket;

import java.util.Random;

public class BookFactory implements ProductFactory {

    private static final String[] authors =
            {"Stephen King", "Andrzej Stasiuk", "Doruch Ania"};

    private static final String[] titles =
            {"Wiedzmin", "LOTR", "50 shades of grey"};

    public Product getProduct() {
        Random random = new Random();

        double price = random.nextDouble() * 100;
        String author = authors[random.nextInt(3)];
        String title = titles[random.nextInt(3)];
        int yearOfRelease = random.nextInt(100) + 1901;

        return new Book(price, author, title, yearOfRelease);
    }
}
