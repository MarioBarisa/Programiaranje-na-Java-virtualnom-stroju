package Vježba1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class VelikaSlova {

    public static void main(String[] args) {

        String[] words = {"java", "python", "rust"};
        Arrays.stream(words).map(String::toUpperCase).forEach(System.out::println);

    }



}

