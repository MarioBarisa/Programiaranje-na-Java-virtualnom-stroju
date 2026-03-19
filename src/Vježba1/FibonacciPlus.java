package Vježba1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciPlus {

    public static List<Integer> fibbonaci(Integer n){
        int a = 0;
        int b=1;
        List<Integer> lista = new ArrayList<>(Arrays.asList(a,b));


        if(n==0){
            return lista;
        }
        if(n==1){
            lista.add(0);
            lista.add(1);
            return lista;
        }
        if(n>2){
        for( int i=2; i<n ; i++){

            lista.add(lista.get(i - 1) + lista.get(i - 2));

        }}

        return lista;
    }

    public static void ispisiFib(List<Integer> Lista){
        System.out.println("Tvoja fibbonaci lista:");
        System.out.println(Lista);
    }

    public static void main(String[] args){
        System.out.println("Unesite broj N za fibbonaci");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> fib = fibbonaci(n);
        ispisiFib(fib);

        scanner.close();
    }
}


