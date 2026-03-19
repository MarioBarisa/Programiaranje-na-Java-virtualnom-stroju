import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci{

    public static void fibbonaci(Integer n){
        int a = 0;
        int b=1;
        List<Integer> lista = new ArrayList<>(Arrays.asList(a,b));


        if(n==0){
            System.out.println(0);
        }
        if(n==1){
            System.out.println(1);
        }
        if(n>2){
        for( int i=2; i<n ; i++){

            lista.add(lista.get(i - 1) + lista.get(i - 2));

        }}

        System.out.println(lista);
    }

    public static void main(String[] args){
        System.out.println("Unesite broj N za fibbonaci");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        fibbonaci(n);

        scanner.close();
    }
}


