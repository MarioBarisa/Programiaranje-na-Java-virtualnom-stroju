package Vježba2;

public class PasClass {

    String ime;

     public PasClass(String ime) {
        this.ime = ime;
    }

    public void laje(){
         System.out.println("Pas "+ ime+ " laje.");
    }

    public static  void main(String[] args){
         PasClass Boki = new PasClass("Boki");

         Boki.laje();
    }
}
