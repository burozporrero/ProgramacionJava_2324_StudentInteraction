package ej_parking;

import java.util.Random;

public class Coche extends VehiculoMotor implements Parking {
    public void aparcar() {

        setPlaza(plazaAsignada());
        System.out.println("La plaza en la que esta el coche es " + getPlaza());
    }

    @Override
    public void irse() {

        System.out.print("El coche estaba en la plaza ");
        Parking.super.irse();
        System.out.print("ahora esa plaza esta vacia");
        setPlaza(0);

    }
}
