package sda.lekcja03;

public class Pracownik {
    public String imie;
    public String nazwisko;
    public int wiek;
    public String dataZatrudnienia;
    public int wynagrodzenie;

    public Pracownik(String imie) {
        this.imie = imie;
    }

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Pracownik(String imie, String nazwisko, int wiek, String dataZatrudnienia, int wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.dataZatrudnienia = dataZatrudnienia;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getImie(){
        return imie;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public void pracuje(){

    }

    public void odpoczywa(){

    }

}
