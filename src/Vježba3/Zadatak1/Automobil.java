package Vježba3.Zadatak1;

public class Automobil extends Vozilo {

    protected Integer brojvrata;

    public Automobil(String marka, Integer brzina, Integer brojvrata) {
        super(marka, brzina);
        this.brojvrata = brojvrata;
    }

    @Override
    void opis() {
        super.opis();
        System.out.println("Broj vrata: "+brojvrata);
    }
}
