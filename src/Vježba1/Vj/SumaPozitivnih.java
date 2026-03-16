import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumaPozitivnih{

    public static int sumaPozitivnih(List<Integer> lista){
        int suma =0;
        for ( int i : lista){
            if(i>0){
                suma=suma+i;
            }
        }
        return suma;
    }

    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,-1,12,-1,-1,-1));
        System.out.println(lista);
        System.out.println(sumaPozitivnih(lista));
    }

}