package ba.unsa.etf.rpr;

import java.time.LocalDate;

public interface Mladi {

    public default String rodjendan(LocalDate datumRodjenja) {
        if(datumRodjenja.getMonth() == LocalDate.now().getMonth() && datumRodjenja.getDayOfMonth() == LocalDate.now().getDayOfMonth())
            return "Sretan rođendan!";
        return "";
    }

}
