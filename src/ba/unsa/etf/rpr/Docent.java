package ba.unsa.etf.rpr;

public class Docent extends Nastavnik {
    private String imePrezime;


    public Docent(String imePrezime) {
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
        return "Doc. dr " +
                imePrezime + '\'';
    }
}
