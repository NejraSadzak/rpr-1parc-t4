package ba.unsa.etf.rpr;

public abstract class Nastavnik extends Osoba{
    private String imePrezime;

    public Nastavnik(String imePrezime) {
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
}
