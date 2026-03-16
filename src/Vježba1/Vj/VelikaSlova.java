import java.util.ArrayList;
import java.util.stream.Collectors;

public class VelikaSlova {

    public static void main(String[] args) {
        String[] words = { "java", "python", "rust" };

        String velikaSlova = velikaSlova(new ArrayList<>(java.util.Arrays.asList(words)));
        System.out.println(velikaSlova);
    }

    public static String velikaSlova(ArrayList<String> rjc) {
        return rjc.stream().map(String::toUpperCase).collect(Collectors.joining());
    }

}

