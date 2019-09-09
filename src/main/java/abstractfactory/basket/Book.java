package abstractfactory.basket;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book implements Product {

    private double price;
    private String author;
    private String title;
    private int yearOfRelease;

    public String getSummary() {
        return String.format("author: %s, title: %s, %s",
                this.author, this.title, this.yearOfRelease);
    }
}
