package Vježba1;


import java.util.Arrays;
import java.util.stream.Collectors;

public class pocetnoSlovo{

    public static void filter(String[] rjc){

        Arrays.stream(rjc)
                .filter(s -> !s.isEmpty() && s.charAt(0)=='j' || s.charAt(0)=='J' )
                .collect(Collectors.toList()).forEach(System.out::println);

    }

    public static void main(String[] args){
        String[] words = {"java", "python", "rust", "Javascript", "JtestJ"};

        filter(words);


    }
}