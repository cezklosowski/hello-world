public class obiekty {

    public static void main(String[] args) {
        String object = "123456789";
        String reversedObject = reverseString(object);
        System.out.println(object);
        System.out.println(reversedObject);


    }

    public static String reverseString (String object){
        String reversedObject = "";
        for (int i = 0; i < object.length(); i++) {
            reversedObject = reversedObject + object.charAt(object.length()-1-i);
        }
        return reversedObject;
    }
}
