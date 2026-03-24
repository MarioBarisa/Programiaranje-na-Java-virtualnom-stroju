package Vježba3.Zadatak3;

public class Main {



       public static void main(String[] args){
           Zaposlnik Ivan = new HonorarniZaposlenik(50.0,8.6);
           Zaposlnik Popsi = new StnalniZaposlenik(1111.);

           System.out.println(Ivan.izracujanPlacu());
           System.out.println(Popsi.izracujanPlacu());
           }
}
