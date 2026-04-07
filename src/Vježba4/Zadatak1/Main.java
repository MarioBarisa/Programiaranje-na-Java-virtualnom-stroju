package Vježba4.Zadatak1;

import java.util.*;

public class Main {

        public static void main(String[] args){
            List<Integer> lista = new ArrayList<>();
            Collections.addAll(lista, 10,20,30,40,50);
            int index = 0;
            Scanner sc = new Scanner(System.in);
            try{
                System.out.println("Unesi broj:");
                index = sc.nextInt();
            }

            catch (InputMismatchException e) {
                System.out.println("Index treba biti broj.");
                sc.nextInt();
                sc.close();
            }

             try{
                System.out.println(lista.get(index));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index je out of bounds.");
            }


            }

}
