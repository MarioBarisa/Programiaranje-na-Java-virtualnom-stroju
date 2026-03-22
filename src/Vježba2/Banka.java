package Vježba2;

import java.math.BigDecimal;

public class Banka {

    String vlasnik;
    BigDecimal stanje;


    public Banka(String vlasnik, BigDecimal stanje) {
        this.vlasnik = vlasnik;
        this.stanje = stanje;
    }

    void uplata(BigDecimal iznos){
        stanje = stanje.add(iznos);
    }

    void isplata(BigDecimal iznos){
        if(iznos.compareTo(stanje)>=0){
            System.out.println("Isplata nije moguča jer bi stanje računa bilo u minusu.");
        }
        else stanje = stanje.subtract(iznos);

    }

    void ispis(){
        System.out.println("Trenutno stanje: "+ stanje);
    }

    public static void main(String[] args){
        Banka Ivan = new Banka("Ivan", new BigDecimal("100.78"));
        Ivan.ispis();
        Ivan.uplata(new BigDecimal("50"));
        Ivan.ispis();
        Ivan.isplata(new BigDecimal("200"));
        Ivan.ispis();
    }
}
