package ej_parking;

import java.util.Random;

public class Bicicleta extends Vehiculo implements Parking{

    private String tipo;


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void aparcar() {

        setPlaza(plazaAsignada());
        System.out.println("La plaza en la que esta la bicicleta es es " + getPlaza());
    }

    @Override
    public void irse() {

        System.out.print("La bicicleta estaba en la plaza ");
        Parking.super.irse();
        System.out.print("ahora esa plaza esta vacia");
        setPlaza(0);
    }
}
