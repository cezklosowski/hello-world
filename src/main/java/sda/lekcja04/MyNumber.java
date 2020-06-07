package sda.lekcja04;

public class MyNumber {
    private long number;

    public MyNumber() {
    }

    public MyNumber(long number) {
        this.number = number;
    }

    public boolean isOdd(){
        return number % 2 == 0 ? true : false;
    }

    public boolean isEven(){
        return number % 2 != 0 ? true : false;
    }

    public long value(){
        return number;
    }

    public long abs(){
        return Math.abs(number);
    }

    public double pow(){
        return Math.pow(number,2);
    }

    public MyNumber add(MyNumber a){
        return new MyNumber(number + a.value());
    }

    public MyNumber multiply(MyNumber a){
        return new MyNumber(this.number * a.value());
    }


}

