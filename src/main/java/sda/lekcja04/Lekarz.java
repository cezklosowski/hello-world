package sda.lekcja04;

public class Lekarz extends Pracownik {
    private String specjalizacja;
    private int premia;

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }
}
