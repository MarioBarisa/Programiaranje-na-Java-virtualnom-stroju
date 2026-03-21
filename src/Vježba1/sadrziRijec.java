package Vježba1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sadrziRijec {

    public static  void filter(String[] str){
         Arrays.stream(str)
                .filter(s->s.contains("Script"))
                .forEach(System.out::println);
    };

    public static void main(String[] args){

        String[] words = {"java", "python", "rust", "JavaScript"};
        filter(words);

    }

}