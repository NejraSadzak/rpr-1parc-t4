package ba.unsa.etf.rpr;

public class VanredniProfesor extends Nastavnik {
    private String imePrezime;

    public VanredniProfesor(String imePrezime) {
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
        return "V. prof. dr. " + imePrezime + '\'';
    }
}
