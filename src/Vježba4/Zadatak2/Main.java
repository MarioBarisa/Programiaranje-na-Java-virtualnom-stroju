package Vježba4.Zadatak2;

public class Main {

    public static void methodC(){
           int x = 10/0;
    }

    public static void methodB(){
        methodC();
    }

    public static void methodA(){
        try{
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("divison sa 0 nije moguci");
        }finally {
            System.out.println("Program gotov.");
        }
    }

        public static void main(String[] args){
            methodA();
            }

}
