package ej_parking;

import java.util.Random;

public class Vehiculo {

    private double longitud;
    private int capacidad;
    private int numPuertas;
    private int numRuedas;

    private int plaza;

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getPlaza() {
        return plaza;
    }


    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public String tipoClase(){
        return this.getClass().getSimpleName();
    }
}
