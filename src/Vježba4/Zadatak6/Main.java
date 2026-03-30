package Vježba4.Zadatak6;

public class Main {

        public static void main(String[] args){

            String str = null;
            try {
                System.out.println(str.length());

            } catch (NullPointerException e) {
                System.out.println("String ne smije biti null.");;
            }
            finally {
                System.out.println("Program je završio.");
            }

            }


}
