package ej_parking.Angel.GestionParking;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String propietario;
    protected int numeroPlaza = 0;
    private static int contador = 1;

    public Vehiculo (String marca, String modelo, String propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.numeroPlaza = contador++;
    }

    protected abstract String mostrarDatos();
}
