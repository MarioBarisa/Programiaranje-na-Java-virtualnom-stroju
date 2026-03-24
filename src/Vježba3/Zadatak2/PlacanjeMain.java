package Vježba3.Zadatak2;

public class PlacanjeMain {

        public static void main(String[] args){

            Placanje kartica = new KarticnoPlacanje();
            Placanje gotovina = new GotovinskoPlacanje();

            kartica.izvrsiPlacanje();
            gotovina.izvrsiPlacanje();

            }
}
