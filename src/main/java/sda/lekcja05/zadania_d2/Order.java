package sda.lekcja05.zadania_d2;

public class Order {
    public OrderItem[] order;
    public static int position;

    public Order(int numberIfItems) {
        order = new OrderItem[numberIfItems];



    }

    public void addItem(OrderItem item){
        if (position < order.length && item.isCorrect() == true){
            order[position++] = item;
        } else {
            System.out.println("Przekroczono wielkość zamówienia lub pozycja zamówienia jest nieprawidłowa.");
        }
    }

    public double getValue(){
        double value = 0;
        for (int i = 0; i < order.length; i++) {
            value += order[i].getValue();
        }
        return value;
    }

    public int getItemsCount(){
        int count = 0;
        for (int i = 0; i < order.length; i++) {
            count += order[i].getQuantity();
        }
        return count;
    }

    public void print(){
        for (int i = 0; i < order.length; i++) {
            order[i].print();
        }
        System.out.println("Wartość zamówienia: " + String.format("%.2f", this.getValue()) + " zł");
    }








}
