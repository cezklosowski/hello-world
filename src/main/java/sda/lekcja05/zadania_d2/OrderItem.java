package sda.lekcja05.zadania_d2;

public class OrderItem {
    private String productName;
    private int quantity;
    private double unitPrice;

    public OrderItem(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getValue(){
        return (double) (this.quantity * this.unitPrice);
    }

    public boolean isCorrect(){
        return (this.quantity > 0 && this.unitPrice > 0);
    }

    public void print(){
        System.out.println(this.productName + " " + this.unitPrice + " zł "  + this.quantity + " szt. " + String.format("%.2f", this.getValue()) + " zł");
    }
}
