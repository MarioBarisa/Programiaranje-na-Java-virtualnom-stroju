package Vježba3.Zadatak5;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args){
            Radnik diz = new Dizajner();
            Radnik prog = new Programer();
            List<Radnik> lista = new ArrayList<>();
            lista.add(diz);
            lista.add(prog);


            //iter
            for (Radnik radnik : lista) {
                radnik.rad();
            }
            }
}
