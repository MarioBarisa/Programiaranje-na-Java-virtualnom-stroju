package Vježba4.Zadatak4;

public class Divide {

    public static int divide(Integer a, Integer b){

       if(b==0){
           throw new IllegalArgumentException("Nije moguce dijeliti sa 0.");
       }
           return a/b;

    };

        public static void main(String[] args) {

            try {
                divide(10, 2);
            } catch (IllegalArgumentException e) {
                System.out.println("Greska.");
            } finally {
                System.out.println("Program gotov.");
            }
        }}
