package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class MasterStudent extends Student {


    private int[] ocjeneMaster = new int[100];
    private int brojOcjenaMaster=0;


    public MasterStudent(String imePrezime) {
        super(imePrezime);
    }

    public void dodajOcjenuMaster(int ocjena) throws IlegalnaOcjena {
        if(brojOcjenaMaster>100) throw new IllegalArgumentException("Dosegnut maksimalan broj ocjena");
        if(ocjena <5 || ocjena>10) throw new IlegalnaOcjena("Ilegalna ocjena " + ocjena);
        ocjeneMaster[brojOcjenaMaster]=ocjena;
        brojOcjenaMaster = brojOcjenaMaster+1;
    }

    public double prosjek() {
        if(brojOcjenaMaster==0 && brojOcjena == 0) return 0;
        double suma=0;
        for(int i=0; i<brojOcjenaMaster; i++)
            suma+=ocjeneMaster[i];
        int br = getBrojOcjena();
        int [] ocjene = getOcjene();
        for(int i=0; i<br; i++)
            suma+=ocjene[i];

        return suma/brojOcjenaMaster+br;
    }
    public double prosjekMaster() {
        if(brojOcjenaMaster == 0) return 0;
        double suma=0;
        for(int i=0; i<brojOcjenaMaster; i++)
            suma+=ocjeneMaster[i];
        return suma/brojOcjenaMaster;
    }

    @Override
    public String toString() {
        return "MasterStudent " + super.toString();
    }



}
