package sda.lekcja05.zadania_d3;

public class Main {
    public static void main(String[] args) {
        /*
        1. Napisz klasę Cat, która w konstruktorze przyjmować będzie imię kota. Klasa powinna
        posiadać metodę makeSound, która wypisywać będzie imię kota oraz wydawany przez niego
        dźwięk.
         */

        /*
        2. Utwórz tablicę kotów, dodaj do niej parę utworzonych obiektów i dla wszystkich wywołaj
        metodę makeSound.
        */
        System.out.println("Zadanie 2");
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Limes");
        cats[1] = new Cat("Eta");
        cats[2] = new Cat("Delta");
        for (int i = 0; i < cats.length; i++) {
            cats[i].makeSound();
        }
        System.out.println();

        /*
        3. Do klasy Cat dodaj metodę eatMouse, która będzie zliczała zjedzone przez kota myszy i
        wypisywała komunikat: „Zjadłem X myszy”.
         */
        System.out.println("Zadanie 3");
        cats[0].eatMouse();
        cats[0].eatMouse();
        System.out.println();

        /*
        4. Napisz klasę Dog, która w konstruktorze przyjmować będzie imię psa. Klasa powinna
        posiadać metodę makeSound, która wypisywać będzie imię psa oraz wydawany przez niego
        dźwięk.
         */
        System.out.println("Zadanie 4");
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Tom");
        dogs[1] = new Dog("Paul");
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].makeSound();
        }
        System.out.println();

        /*
        5. Utwórz tablicę zwierząt, dodaj do niej parę utworzonych obiektów typu Cat oraz Dog i dla
        wszystkich wywołaj metodę makeSound.
         */
        System.out.println("Zadanie 5");
        Animal[] animals = new Animal[5];
        animals[0] = cats[0];
        animals[1] = cats[1];
        animals[2] = cats[2];
        animals[3] = dogs[0];
        animals[4] = dogs[1];

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
        System.out.println();

        /*
        8. Utwórz klasę Vet, która będzie miała metodę sayHello przyjmującą jako parametr obiekt
        klasy Cat i wypisującą powitanie dla tego kota, np. „Witaj Mruczek”.
        */

        /*
        9. W klasie Vet napisz metodę sayHello przyjmującą jako parametr obiekt klasy Dog i
        wypisującą powitanie dla tego psa, np. „Witaj Burek”
        */

        /*
        10. Zamiast dwóch wersji metody sayHello napisz jedną, która będzie potrafiła przyjąć w
        parametrze obiekty klas Cat oraz Dog
         */
        System.out.println("Zadanie 10");
        Vet.sayHello(cats[0]);
        Vet.sayHello(dogs[1]);
        System.out.println();

        /*
        11. Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
        pola i konstruktor oraz metodę getArea - obliczającą pole:
        1. Prostokąta – wysokość * szerokość
        2. Koła – Pi * promień * promień
        3. Trójkąta – ½ * wysokość * podstawa
         */

        /*
        12. Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.
         */
        System.out.println("Zadanie 12");
        Rectangle rectangle1 = new Rectangle(2, 1);
        Circle circle1 = new Circle(1);
        Triangle triangle1 = new Triangle(3, 4, 5);
        double totalArea = totalArea(rectangle1, circle1, triangle1);
        System.out.println("Łączne pole powierzchni figur wynosi " + totalArea);
        System.out.println();

        /*
        13. Mając podaną powierzchnię X, która może zostać pokryta przez farbę, napisz metodę, która
        sprawdzi, czy daną ilością farby można zamalować wszystkie podane figury
         */
        System.out.println("Zadanie 13");
        double paint = 12;
        if (isEnough(paint, rectangle1, circle1, triangle1)){
            System.out.println("Ilość farby jest wystarczająca do pomalowania wszystkich figur");
        } else {
            System.out.println("Ilość farby nie jest wystarczająca do pomalowania wszystkich figur");
        }
        System.out.println();

        /*
        14. Napisz klasę Calculator, która będzie miała metodę add, dodającą dwie liczby i zwracającą
        ich wynik. Metoda ta powinna umieć dodawać liczby zespolone (klasa Complex) oraz liczby
        naturalne (klasa MyNumber). Jeśli jest taka potrzeba - zmodyfikuj odpowiednio klasy
        Complex i MyNumber
         */
        System.out.println("Zadanie 14");
        MyNumber a = new MyNumber(4);
        MyNumber b = new MyNumber(5);
        Complex c = new Complex(2,2);
        Complex d = new Complex(1,-1);
        System.out.println(Calculator.add(a,b));
        System.out.println(Calculator.add(c,d));
        System.out.println();

        /*
        15. Utwórz klasę Employee dziedziczącą po klasie Person. Dlaczego klasa jest podkreślona na
        czerwono?
        16. Zmodyfikuj klasę Employee w taki sposób, żeby przy podaniu roku urodzenia z zakresu
        innego niż 1900-2020 ustawiało rok urodzenia na 0.
        17. Do klasy Employee dodaj pole salary oraz metodę getSalary. Zrób tak, aby metoda whoAmI
        dla pracownika wyświetlała tekst „Nazywam się Jan Kowalski i zarabiam 1000zł”
         */
        System.out.println("Zadanie 17");
        Employee employee1 = new Employee("Jan","Kowalski",1980);
        Employee employee2 = new Employee("Jacek","Nowicki",1985);
        employee1.setSalary(1000);
        employee1.whoAmI();
        employee2.setSalary(2000);
        employee2.whoAmI();
        System.out.println();

        /*
        18. Utwórz klasę Manager dziedziczącą po klasie Employee. Dla managera do pensji dodawane
        jest 10% jako dodatek funkcyjny. Zmodyfikuj odpowiednio metodę getSalary. Zrób tak, aby
        metoda whoAmI dla pracownika wyświetlała tekst „Nazywam się manager Jan Kowalski i
        zarabiam 1000zł”
         */
        System.out.println("Zadanie 18");
        Manager manager1 = new Manager(employee1);
        manager1.whoAmI();

        /*
        19. Utwórz klasy Mammal (ssak) i Canidae (psowate). Zmodyfkuj klasę Dog tak, aby
        dziedziczyła po klasach Mammal i Canidae
         */


    }

    public static double totalArea(Figures... figure) {
        double total = 0.0;
        for (int i = 0; i < figure.length; i++) {
            total += figure[i].getArea();
        }
        return total;
    }

    public static boolean isEnough(double paint, Figures... figures) {
        return paint > totalArea(figures);
    }
}
