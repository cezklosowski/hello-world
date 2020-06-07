package sda.lekcja04_1;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    public List<Product> shoppingList;

    public Cart(Store store) {
        shoppingList = new ArrayList<Product>();
        addProductToCard(store.productList.get(1), 2);
        addProductToCard(store.productList.get(3), 1);
        addProductToCard(store.productList.get(4), 4);

    }

    public void addProductToCard(Product product, int quantity) {
        shoppingList.add(new Product(product.getName(), product.getPrice(), product.getIfPromo(), product.getPricePromo(), product.getVat(), quantity));
    }

    public List<Product> returnShoppingList() {
        return shoppingList;
    }

    public int getTotalPrice(List<Product> shoppingList) {
        int totalPrice = 0;
        for (int i = 0; i < shoppingList.size(); i++) {
            totalPrice += shoppingList.get(i).getPricePromo() * shoppingList.get(i).getQuantity();
        }
        return totalPrice;
    }

}

