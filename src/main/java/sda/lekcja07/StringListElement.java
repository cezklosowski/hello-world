package sda.lekcja07;

import java.util.Arrays;
import java.util.Comparator;

public class StringListElement {
    private String value;
    private StringListElement next;
    public StringListElement(String value, StringListElement next) {
        this.value = value;
        this.next = next;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public StringListElement getNext() {
        return next;
    }
    public void setNext(StringListElement next) {
        this.next = next;
    }
    public static void main(String[] args) {
        StringListElement ala = new StringListElement("Ala", null);
        StringListElement ma = new StringListElement("ma", null);
        StringListElement kota = new StringListElement("kota", null);
        ala.setNext(ma);
        ma.setNext(kota);
//        System.out.println(ala.getValue());
//        System.out.println(ala.getNext().getValue());
//        System.out.println(ala.getNext().getNext().getValue());
//        StringListElement current = ala;
//        while (current != null) {
//            System.out.println(current.getValue());
//            current = current.getNext();
//        }
        StringListElement current = ala;
        int length = 0;
        while(current != null) {
            length++;
            current = current.getNext();
        }
        String[] elements = new String[length];
        current = ala;
        int index = 0;
        while(current != null) {
            elements[index++] = current.getValue();
            current = current.getNext();
        }
        Arrays.sort(elements, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(Arrays.toString(elements));
    }
}