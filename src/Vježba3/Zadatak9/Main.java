package Vježba3.Zadatak9;

public class Main {

        public static void main(String[] args){
            Napadac ivan = new Carobnjak("Ivan", 12);
            Napadac popsi = new Ratnik("Popsi",12);
            System.out.println(ivan.napadni());
            System.out.println(ivan.getIme());
            System.out.println(popsi.getIme());
            System.out.println(popsi.napadni());
            }
}
