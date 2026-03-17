package Vježba1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrojParnih{

    public static int brojParnih(List<Integer>lista){
        int parni = 0;
        for (int i : lista){
            if(i%2==0){
                parni++;
            }
            else{
                continue;
            }
        }
        return parni;
    }

    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(lista);
        System.out.println(brojParnih(lista));
    }

}