package Vježba4.Zadatak5;

public class Main {
        public static void main(String[] args){

            try{
                unosBroja.Unos();
                System.out.println(izracunKvadarata.izracun());
            } catch (NumberFormatException e) {
            System.out.println("Inpout mora biti broj.");
            } catch (IllegalArgumentException e){
                System.out.println("Broj treba biti pozitivan.");
            }

            }
}
