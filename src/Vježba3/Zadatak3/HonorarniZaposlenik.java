package Vježba3.Zadatak3;

public class HonorarniZaposlenik extends  Zaposlnik{

    Double sat;
    Double satnica;

    public HonorarniZaposlenik(Double sat, Double satnica) {
        this.sat = sat;
        this.satnica = satnica;
    }


    @Override
    double izracujanPlacu() {
        return sat*satnica;
    }
}
