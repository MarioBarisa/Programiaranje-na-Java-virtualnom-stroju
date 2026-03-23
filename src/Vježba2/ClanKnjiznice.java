package Vježba2;

public class ClanKnjiznice {

    String naziv;
    Integer brojDozvoljenihPosudbi;


    public ClanKnjiznice(String naziv) {
        this.naziv = naziv;
        this.brojDozvoljenihPosudbi =5;
    }

    void posudiKnjigu(){
        if(brojDozvoljenihPosudbi==0){
            System.out.println("Prekoračne broj posudbi.");
        }else brojDozvoljenihPosudbi=brojDozvoljenihPosudbi-1;
    }
    void vratiKnjigu(){
        brojDozvoljenihPosudbi=brojDozvoljenihPosudbi+1;
    }
    void ispis(){
        System.out.println("Korisnik ima trenutno posuđenih: "+(5-brojDozvoljenihPosudbi)+".");
    }

    public static void main(String[] args){
        ClanKnjiznice Ivan = new ClanKnjiznice("Ivan");
        Ivan.posudiKnjigu();
        for (int i = 0; i < 6; i++) {
            Ivan.posudiKnjigu();
        }
        Ivan.ispis();
        Ivan.vratiKnjigu();
        Ivan.ispis();

    }
}
