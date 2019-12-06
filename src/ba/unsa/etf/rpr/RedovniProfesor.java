package ba.unsa.etf.rpr;

public class RedovniProfesor extends Nastavnik {
    private String imePrezime;

    public RedovniProfesor(String imePrezime) {
        super(imePrezime);
    }

    @Override
    public String getImePrezime() {
        return imePrezime;
    }

    @Override
    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    @Override
    public String toString() {
        return "R. prof. dr. " + imePrezime + '\'';
    }
}
