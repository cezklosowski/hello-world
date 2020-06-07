package sda.lekcja04_1;
import java.util.List;

public class StoreView {
    public Store store;
    public StoreView(Store store){
        this.store = store;
        printProductList(store.productList);
    }

    public void printProductList(List<Product> productList){
        String format = "|%1$-20s|%2$-10s|%3$-10s|%4$-10s|%5$-10s|\n";
        System.out.println("------------------------------------------------------------------");
        System.out.format(format, "Name", "Quantity", "Promotion","VAT","Price");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < productList.size(); i++) {
            System.out.format(format, productList.get(i).getName(), productList.get(i).getQuantity(), (productList.get(i).getIfPromo()==true ? "yes" : "no"),productList.get(i).getVat(),productList.get(i).getPricePromo());
        }
        System.out.println("------------------------------------------------------------------");
    }

}
