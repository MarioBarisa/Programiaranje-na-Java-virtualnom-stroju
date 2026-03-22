package Vježba2;

public class Auto {

    String marka;
    Integer brzina;

    public Auto(String marka, Integer brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }

    void prikaziInfo(){
        System.out.println("Marka: "+marka + ", Brzina: "+brzina);
    }

    public static void main(String[] args){
        Auto megane = new Auto("Renault", 100);
        megane.prikaziInfo();
    }

}
