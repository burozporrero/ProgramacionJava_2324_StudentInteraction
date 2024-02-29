package revision_examen.mejorar_if;

import java.time.LocalDate;
import java.util.Objects;

public class ProductoRefrigerado extends Producto {
    private LocalDate fechaCaducidad;
    private String codOrganismoSupervisionAlimenticia;
    private int numeroLote;

    public ProductoRefrigerado() {

    }

    public ProductoRefrigerado(LocalDate fechaCaducidad, String codOrganismoSupervisionAlimenticia, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaCaducidad = fechaCaducidad;
        this.codOrganismoSupervisionAlimenticia = codOrganismoSupervisionAlimenticia;
        this.numeroLote = numeroLote;
    }

    @Override
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodOrganismoSupervisionAlimenticia() {
        return codOrganismoSupervisionAlimenticia;
    }

    public void setCodOrganismoSupervisionAlimenticia(String codOrganismoSupervisionAlimenticia) {
        this.codOrganismoSupervisionAlimenticia = codOrganismoSupervisionAlimenticia;
    }

    @Override
    public int getNumeroLote() {
        return numeroLote;
    }

    @Override
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoRefrigerado that)) return false;
        if (!super.equals(o)) return false;
        return numeroLote == that.numeroLote && Objects.equals(fechaCaducidad, that.fechaCaducidad) && Objects.equals(codOrganismoSupervisionAlimenticia, that.codOrganismoSupervisionAlimenticia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad, codOrganismoSupervisionAlimenticia, numeroLote);
    }

    @Override
    public String toString() {
        return "ProductosRefrigerados{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", codOrganismoSupervisionAlimenticia='" + codOrganismoSupervisionAlimenticia + '\'' +
                ", numeroLote=" + numeroLote +
                '}';
    }
}
