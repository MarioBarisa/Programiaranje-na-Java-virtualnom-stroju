package Vježba2;

import java.util.Scanner;

public class Predmet {

    String naziv;
    String polozeno;
    Integer ocjena;


    public Predmet(String naziv, Integer ocjena) {
        this.naziv = naziv;
        if (ocjena==1){
            this.polozeno = "Ne";
        }
        else this.polozeno="Da";

        if(ocjena>5 || ocjena <1){
            //soutv
            System.out.println("Ocjena mora biti između 1 i 5");
            Scanner sc = new Scanner(System.in);
            Integer ocj;
            do{
                System.out.println("Unesite ocjenu: ");
                ocj = sc.nextInt();
            }while(ocj>5 || ocj<1);
            this.ocjena = ocj;
        }

    }

    void ispis(){
        System.out.println(this.naziv+", "+this.polozeno+", "+this.ocjena);
    }


    public static void main(String[] args){

        Predmet p = new Predmet("IKT", 6);
        p.ispis();

    }
}
