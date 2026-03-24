package Vježba3.Zadatak9;

public class Carobnjak implements Napadac{

    protected String ime;
    protected Integer magijskaSnaga;

    public Carobnjak(String ime, Integer magijskaSnaga) {
        this.ime = ime;
        this.magijskaSnaga = magijskaSnaga;
    }


    @Override
    public int napadni() {
        return magijskaSnaga+10;
    };

    public String getIme(){
        return ime;
    }
}
