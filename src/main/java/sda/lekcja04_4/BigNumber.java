package sda.lekcja04_4;

import java.util.ArrayList;
import java.util.List;


public class BigNumber {
    private List<Short> number;
    private boolean sign; // znak liczby; true - dodatni, false - ujemny

    public List<Short> getNumber() {
        return number;
    }

    public void setNumber(List<Short> number) {
        this.number = number;
    }

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        String score = "";
        if (!sign) {
            score += "-";
        }

        // wypisanie pierwszej cyfry
        if ((number.get(number.size() - 1)) != 0) {
            score += number.get(number.size() - 1);
        }


        for (int i = number.size() - 2; i >= 0; i--) {
            if (number.get(i) < 10 && score.length() > 0) {
                score += "00" + number.get(i);
            } else if (number.get(i) >= 10 && number.get(i) < 100 && score.length() > 0) {
                score += "0" + number.get(i);
            } else {
                score += number.get(i);
            }

        }
        return score;
    }

    public BigNumber() {
        this.number = new ArrayList<>();
    }

    public BigNumber(BigNumber a) {
        this.number = new ArrayList<>(a.getNumber());
        this.sign = a.isSign();
    }

    public BigNumber(String stringNumber) {
        this.number = new ArrayList<>();

        // sprawdzenie znaku
        if (stringNumber.startsWith("-")) {
            sign = false;
            stringNumber = stringNumber.substring(1);
        } else {
            sign = true;
        }

        // odwrócenie stringa
        String reversedStringNumber = "";
        int j = 3;
        for (int i = 0; i < stringNumber.length(); i++) {
            reversedStringNumber += stringNumber.charAt(stringNumber.length() - 1 - i);
        }
        // podział na trójki
        List<String> triples = new ArrayList<>();
        String rest = "";
        int ifRest = 0;
        if (reversedStringNumber.length() % 3 == 0) {
            ifRest = 0;
            for (int i = 0; i < reversedStringNumber.length(); ) {
                triples.add(reversedStringNumber.substring(i, (i + 3)));
                i += 3;
            }
        } else if (reversedStringNumber.length() % 3 == 1) {
            ifRest = 1;
            rest = reversedStringNumber.substring(reversedStringNumber.length() - 1);
            reversedStringNumber = reversedStringNumber.substring(0, reversedStringNumber.length() - 1);

            for (int i = 0; i < reversedStringNumber.length(); ) {
                triples.add(reversedStringNumber.substring(i, (i + 3)));
                i += 3;
            }
            // dodanie reszty
            triples.add(rest);


        } else if (reversedStringNumber.length() % 3 == 2) {
            ifRest = 1;
            rest = reversedStringNumber.substring(reversedStringNumber.length() - 2);
            reversedStringNumber = reversedStringNumber.substring(0, reversedStringNumber.length() - 2);

            for (int i = 0; i < reversedStringNumber.length(); ) {
                triples.add(reversedStringNumber.substring(i, (i + 3)));
                i += 3;
            }
            // odwrócenie reszty
            String buffer = "";
            for (int i = 0; i < rest.length(); i++) {
                buffer += rest.charAt(1 - i);
            }
            rest = buffer;

            // dodanie odwróconej reszty
            triples.add(rest);

        }

        // odwrócenie trójek bez reszty
        List<String> triplesRereversed = new ArrayList<>();
        for (int i = 0; i < triples.size() - ifRest; i++) {
            String buffer = "";
            for (int k = 0; k < 3; k++) {
                buffer += triples.get(i).charAt(2 - k);
            }
            triplesRereversed.add(buffer);
        }
        triplesRereversed.add(rest);

        // zamiana listy stringów na listę shortów
        for (int i = 0; i < triplesRereversed.size(); i++) {
            if (triplesRereversed.get(i) != "") {
                number.add(Short.parseShort(triplesRereversed.get(i)));
            }
        }

    }


}
