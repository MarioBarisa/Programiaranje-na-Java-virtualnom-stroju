package Vježba3.Zadatak7;



public class pro
{

    static void provjeri ( Osoba o){
        if(o instanceof Profesor){
            ((Profesor) o).predaje();
        }
        else{
            System.out.println("Objekt nije profesor.");
        }
    }

}
