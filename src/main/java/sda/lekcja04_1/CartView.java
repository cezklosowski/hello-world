package sda.lekcja04_1;
import java.util.List;

public class CartView {
    public Cart cart;

    public CartView(Cart cart) {
        this.cart = cart;
        printCart(cart.shoppingList);
    }

    public void printCart(List<Product> shoppingList){
        String format = "|%1$-42s|%2$-10s|%3$-10s|\n";
        System.out.println("------------------------------------------------------------------");
        System.out.format(format, "Name", "Quantity", "Price");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.format(format, shoppingList.get(i).getName(), shoppingList.get(i).getQuantity(), shoppingList.get(i).getPricePromo());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("TOTAL: " + cart.getTotalPrice(shoppingList));
    }
}
