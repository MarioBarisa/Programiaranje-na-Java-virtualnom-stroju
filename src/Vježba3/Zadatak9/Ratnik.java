package Vježba3.Zadatak9;

public class Ratnik implements Napadac{

    protected String ime;
    protected Integer snaga;

    public Ratnik(String ime, Integer snaga) {
        this.ime = ime;
        this.snaga = snaga;
    }


    @Override
    public int napadni() {
        return snaga+5;
    }

    public String getIme(){
        return ime;
    }
}
