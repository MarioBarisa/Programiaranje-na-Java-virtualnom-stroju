package Vježba3.Zadatak3;

public class StnalniZaposlenik extends Zaposlnik {

    Double minimalnaPlaca;

    public StnalniZaposlenik(Double minimalnaPlaca) {
        this.minimalnaPlaca = minimalnaPlaca;
    }


    @Override
    double izracujanPlacu() {
        return minimalnaPlaca;
    }
}
