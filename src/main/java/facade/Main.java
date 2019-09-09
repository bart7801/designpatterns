package facade;

public class Main {

    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.buy("lampshade", "4565-6504-6405-6547",
                "52 Swanton Gardens, Wimbledon, SW19 6BL London");
    }
}
