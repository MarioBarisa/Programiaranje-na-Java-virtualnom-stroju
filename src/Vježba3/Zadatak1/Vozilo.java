package Vježba3.Zadatak1;

public class Vozilo {

    protected String marka;
    protected Integer brzina;


    public Vozilo(String marka, Integer brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }

    void opis(){
        System.out.println("Marka: "+marka+", Brzina: "+brzina);
    }
}
