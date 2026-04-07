package Vježba4.Zadatak5;

import java.util.Scanner;

public class unosBroja {

    static int br = 0;

    public static void Unos() {
        String broj;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj");
        broj = sc.next();
        br = Integer.parseInt(broj);
    }

    public static int getBr() {
        return br;
    }
}
