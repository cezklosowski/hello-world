package sda.lekcja04_1;

import java.util.List;
import java.util.ArrayList;

public class Store {
    public List<Product> productList;


    public Store() {
        productList = new ArrayList<Product>();
        productList.add(new Product("Ibanez RGA8",5000,true,4500,"23%",10));
        productList.add(new Product("Fender Stratocaster",12000,false,12000,"23%",2));
        productList.add(new Product("Dean C450",3000,true,2750,"23%",25));
        productList.add(new Product("ESP EII Eclipse",7500,false,7500,"23%",20));
        productList.add(new Product("Fender American Pro",8000,false,8000,"23%",6));

        Product yamaha = new Product("Yamaha RGX 121",1200,true,999,"23%",12);
        addProduct(yamaha);


    }

    public void addProduct(Product product){
        productList.add(new Product(product.getName(),product.getPrice(),product.getIfPromo(),product.getPricePromo(),product.getVat(),product.getQuantity()));
    }

    public List<Product> returnProductList(){
        return productList;
    }

    public int getProductQuantity(String name){
        int quantity = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName() == name){
                quantity = productList.get(i).getQuantity();
                break;
            } else {
                quantity = -1;
            }
        }
        return quantity;
    }


}
