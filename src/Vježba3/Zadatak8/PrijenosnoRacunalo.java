package Vježba3.Zadatak8;

public class PrijenosnoRacunalo extends Racunalo{

    Double tezina;

    public PrijenosnoRacunalo(String naziv, Integer i, Double tezina) {
        super(naziv, i);
        this.tezina = tezina;
    }

    void prikaziInfo(){
        System.out.println("Naziv: "+naziv+" RAM: "+ram+" Tezina: "+tezina);
    }
}
