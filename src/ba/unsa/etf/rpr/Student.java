package ba.unsa.etf.rpr;

import java.util.Arrays;

public abstract class Student extends Osoba implements Comparable<Student>{
    private String brojIndeksa = "";
    protected int[] ocjene = new int[100];
    protected int brojOcjena=0;


    public Student(String imePrezime) {
        super(imePrezime);
    }
    public int[] getOcjene() {
        return ocjene;
    }

    public int getBrojOcjena() {
        return brojOcjena;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    //   public abstract void dodajOcjenu(int ocjena) throws IlegalnaOcjena;
//    public abstract double prosjek();
    public void dodajOcjenu(int ocjena) throws IlegalnaOcjena {
        if(brojOcjena>100) throw new IllegalArgumentException("Dosegnut maksimalan broj ocjena");
        if(ocjena <5 || ocjena>10) throw new IlegalnaOcjena("Ilegalna ocjena " + ocjena);

        ocjene[brojOcjena]=ocjena;
        brojOcjena = brojOcjena+1;
    }
    public double prosjek() {
        if(brojOcjena==0) return 0;
        double suma=0;
        int br = brojOcjena;
        for(int i=0; i<br; i++)
            suma+=ocjene[i];
        return suma/br;
    }
    @Override
    public int compareTo(Student o) {
        double p1 = prosjek(), p2 = o.prosjek();
        if(p1 > p2) return -1;
        else if (p1 < p2) return 1;
        return 0;
    }

    @Override
    public String toString() {
        Double prosjek = prosjek();
        return "student " + getImePrezime() + " (" + brojIndeksa + "), " +
                "prosjek ocjena: " + prosjek.toString();
    }
}
