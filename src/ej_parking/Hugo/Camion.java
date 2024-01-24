package ej_parking;

import java.util.Random;

public class Camion extends VehiculoMotor implements Parking {

    private boolean conCarga;
    private int plazaCarga;

    public void setConCarga(boolean conCarga) {
        this.conCarga = conCarga;
    }

    public boolean isConCarga() {
        return conCarga;
    }

    public int getPlazaCarga() {
        return plazaCarga;
    }

    public void setPlazaCarga(int plazaCarga) {
        this.plazaCarga = plazaCarga;
    }

    public void aparcar() {

        setPlaza(plazaAsignada());
        if (isConCarga() == Boolean.TRUE) {
            setPlazaCarga(getPlaza() + 2);
            System.out.println("La plaza en la que esta el camion es " + getPlaza() +
                    " y continua hasta la plaza " + getPlazaCarga() + " por su carga");
        } else System.out.println("La plaza en la que esta el camion es " + getPlaza());
    }

    @Override
    public void irse() {

        System.out.print("El camion estaba en la plaza ");
        Parking.super.irse();
        System.out.print("ahora esa plaza esta vacia");
        setPlaza(0);
    }
}


