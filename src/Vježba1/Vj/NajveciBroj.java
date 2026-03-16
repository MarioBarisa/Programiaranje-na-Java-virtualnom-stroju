import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;

public class NajveciBroj{

    public static int najveciBroj(List<Integer> lista){
        int max = lista.get(0);

        for(int i : lista){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(1,23,4,1,3,11,22,47,66,5,33,324));
        System.out.println(lista);
        System.out.println(najveciBroj(lista));
    }
}