package sda.lekcja04_1;

public class Product {
    private String name;
    private int price;
    private boolean ifPromo;
    private int pricePromo;
    private String vat;
    private int quantity;

    public Product() {
    }

    public Product(String name, int price, boolean ifPromo, int pricePromo, String vat, int quantity) {
        this.name = name;
        this.price = price;
        this.ifPromo = ifPromo;
        this.pricePromo = pricePromo;
        this.vat = vat;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIfPromo() {
        return ifPromo;
    }

    public void setIfPromo(boolean ifPromo) {
        this.ifPromo = ifPromo;
    }

    public int getPricePromo() {
        return pricePromo;
    }

    public void setPricePromo(int pricePromo) {
        this.pricePromo = pricePromo;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
