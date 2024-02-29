package ej_parking.Angel.GestionParking;

public abstract class VehiculoMotor extends Vehiculo {
    protected String tipoMotor;
    public VehiculoMotor(String marca, String modelo, String propietario, String tipoMotor) {
        super(marca, modelo, propietario);
        this.tipoMotor= tipoMotor;
    }
}
