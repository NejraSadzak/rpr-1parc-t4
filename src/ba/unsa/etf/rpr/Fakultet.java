package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fakultet {

    private List<Osoba> osobe = new ArrayList<>();

    public void dodajOsobu(Osoba o) {
        osobe.add(o);
    }

    public Set<Student> studenti () {

        Set<Student> studentiNaFakultetu = new TreeSet<>();
        for(Osoba o : osobe) {
            if (o instanceof Student)
                studentiNaFakultetu.add((Student)o);
        }
    return studentiNaFakultetu;
    }
    public List<Osoba> filtriraj(Function<Osoba, Boolean> funkcija) {
        List<Osoba> l = new ArrayList<>();
        for(Osoba o : osobe) {
            if(funkcija.apply(o))
                l.add(o);
        }
        return l;
    }
    public List<BachelorStudent> topBachelor() {
        List<BachelorStudent> top = filtriraj((Osoba o)-> (o instanceof BachelorStudent && ((BachelorStudent) o).prosjek() >= 8))
                .stream().map((Osoba o) -> {BachelorStudent s = (BachelorStudent) o; return s; }).collect(Collectors.toList());
        return  top;
    }


    @Override
    public String toString() {
        String result = "+";
        for (int i = 0; i < osobe.size(); i++) {
            result += " " + osobe.get(i);
        }
        return result;
    }
    List<Mladi> mladi() {
        List<Mladi> mladiList = new ArrayList<>();
        for(Osoba o : osobe ) {
            if(o instanceof Mladi) mladiList.add((Mladi)o);
        }
    return mladiList;
    }
}
