package sda.lekcja04_1;

/*
Wszysstkie zadania zrobić w ramach jednego projektu Java. Starać się używać nazw po angielsku. Wykonanie wszystkich zadań złoży nam się na
prostą aplikację sklepu.
 */
/*
Zadanie 1. Stworzyć klasę "Product", powinna ona zawierać pola określające:
nazwę
cenę
czy jest w promocji (boolean)
cenę promocyjną
stawkę VAT
ilosc

Ponadto powinan zawierać dwa konstruktowy
- bezrgumentowy który nic nie robi
- 5 argumentowy który przyjmuje i ustawia wszystkie pola

Klasa powinna zawierać metody typu get i set zwracająca i uswawiająca wszystkie pola w klasie
 */
/*
Zadanie 2. Stworzyć klasę użytkownika (User), która zawiera pola:
imie
naziwsko
login
haslo
id;

Stworzyć 2 konstruktowy analogiczne do tych z zadania 1;
Stworzyć metody get i set dla wszystkich pół oprócz id;
 */
/*
Zadanie 3. Stworzyć klasę sklep (Store) który zawiera pola:
- lista produktów (pole typu List) parametryzowana typem Product z zadania 1 (List<Product> productList).
Następnie:
- Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę produktów (oczywiście chodzi przpisaniu nowej pustej listy polu klasy "productList" - najlepiej ArrayList) i wypełnia ją przykładowymi danymi 5-10 produktów.
Następnie dodać następujące metody
- Stworzyć metodę addProduct, która przyjmuje 1 argument typu Product (z zadania 1) i dodaje go do listy produktów.
- Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę produktów;
- Stworzyć metodę removeProduct, która przyjmuje 1 argument typu Product (z zadania 1) i usuwa go z listy produktów -----> ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
- Stworzyć metodę getProductQuantity, która przy przyjmuje 1 argument typu String, który jest nazwą produktu i zwraca typ int z ilością danego produktu lub -1 jeśli nie ma na liście takiego produktu.
 */
/*
Zadanie 4. Stworzyć klasę danych użytkowników (UsersData) który zawiera pola;
- lista użytkowników (Pole typu List) parametryzowana typem User z zadania 2 (List<User> users).
Następnie:
- Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę użytkowników ("users", najlepiej ArrayList) i wypełnia ją przykładowymi danymi - 5-10 użytkowników.
Potem stworzyć metody:
- Stworzyć metodę addUser, która przyjmuje 1 argument typu User (z zadania 2) i dodaje go do listy użytkowników.
- Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę użytkowników (tych przetrzymywanych w polu "users"
- Stworzyć metodę removeProduct, która przyjmuje 1 argument typu User (z zadania 2) i usuwa go z listy użytkowników -----> ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
- Stworzyć metodę getUserByLogin, która przyjnuje 1 argument typu String z loginem użytkownika i zwraca całego użytkownika (User) jeśli użytkownik o padanym loginie jest na liście, lub null jeśli go nie ma.
- Stworzyć metodę getUserById, analogicznie jak powyższy punkt tylko
 */
/*
Zadanie 5. Stworzyć klasę StoreView, zadaniem klasy będzie wyświetlenie na konsoli w postaci tabeli listy produktów.

Klasa powinna zawierać 1 pole typu Store (z zadania 3)

- Stworzyć Konstruktor 1 argumentowy, który przjmuje argument typu Store i ustawia go jako pole klasy
- Stworzyć metodę printProductList która wyświetla na konsoli w postaci tabeli listę produktów znajdującą się w klasie Store czyliu coś w stypu

--------------------------------------------------------------------------
| Nazwa produktu | Ilość          |  Promocja   |      VAT    |    CENA  |
-------------------------------------------------------------------------
|  Chleb         |     100        |     NIE     |       8     |	    3	 |
|  Maslo         |     150        |     NIE     |       8     |     7    |
|  Mleko         |     200        |     NIE     |       8     |     3    |
|  Kawa          |     300        |     TAK     |       8     |     10   |
--------------------------------------------------------------------------
 */
/*
Zadanie 6. Stworzyć klasę Cart, Która będzie stanowić koszyk użytkownika

- lista produktów (pole typu List) parametryzowana typem Product z zadania 1 (List<Product>).
Następnie:
- Stworzyć konstruktor bezartumentowy który tworzy nową (pustą) listę produktów (najlepiej ArrayList)
Potem stworzyć metody:
- Stworzyć metodę addProductToCart, która przyjmuje 1 argument typu Product (z zadania 1) i dodaje go do listy produktów.
- Stworzyć metodę która nie przyjmuje żadnego argumentu i zwraca listę produktów w koszu;
- Stworzyć metodę removeProduct, która przyjmuje 1 argument typu Product (z zadania 1) i usuwa go z listy produktów -----> ten punkt jest jako zadanie dodatkowe jeśli uda się zrobić to przetestować jak działa tu kryje się pułapka którą omówimy na następnych zajęciach
- Stworzyć metodę getTotalPrice, zwraca całkowitą cenę produktów w koszyku
 */
/*
Zadanie 7. Stworzyć klasę CartView, zadaniem klasy będzie wyświetlenie na konsoli w postaci tabeli zawartosci kosza.

Klasa powinna zawierać 1 pole typu Cart (z zadania 6)

- Stworzyć Konstruktor 1 argumentowy, który przjmuje argument typu Cart i ustawia go jako pole klasy
- Stworzyć metodę printCart która wyświetla na konsoli w postaci tabeli listę produktów znajduącą się w koszu (Cart);

-------------------------------------------------
| Nazwa produktu | Ilość        |    Cena       |
-------------------------------------------------
|  Chleb         |     1        |     3         |
|  Maslo         |     1        |     7         |
|  Mleko         |     2        |     9         |
-------------------------------------------------
SUMA: 19
 */

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        new StoreView(store);
        Cart cart = new Cart(store);
        new CartView(cart);




    }
}
