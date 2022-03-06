package Lista;

public class Uczestnik {
    String imię;
    String nazwisko;
    String płeć;
    int wiek;

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPłeć() {
        return płeć;
    }

    public void setPłeć(String płeć) {
        this.płeć = płeć;
    }

    @Override
    public String toString() {
        return imię + " " +  nazwisko +" "+ wiek;
    }

    public Uczestnik(String imię, String nazwisko, String płeć, int wiek) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.płeć = płeć;
        this.wiek = wiek;
    }
}

