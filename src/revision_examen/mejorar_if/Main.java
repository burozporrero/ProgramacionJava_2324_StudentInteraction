package revision_examen.mejorar_if;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder cad = new StringBuilder();
        Scanner sc = new Scanner(System.in);


        ProductoFresco zumoNaranja = new ProductoFresco(LocalDate.of(2024, 10, 27), LocalDate.of(2024, 02, 21), "España", 002324);
        cad.append("Se ha creado el producto zumo de naranja-> " + zumoNaranja.toString() + "\n");
        System.out.println(cad);

        ProductoCongelado helado = new ProductoCongelado(LocalDate.of(2024, 8, 27), 012324, 14);
        cad.append("Se ha creado el producto helado-> " + helado.toString() + "\n");
        System.out.println(cad);

        ProductoRefrigerado pescado = new ProductoRefrigerado(LocalDate.of(2024, 5, 27), "rtl00", 022324);
        cad.append("Se ha creado el producto pescado-> " + pescado.toString() + "\n");
        System.out.println(cad);

        ProductoAlmacenado cacahuetes = new ProductoAlmacenado(LocalDate.of(2025, 5, 27),032324,20,1.50);
        cad.append("Se ha creado el producto cacahuetes-> " + cacahuetes.toString() + "\n");
        System.out.println(cad);

        Almacen.almacenarProductos(zumoNaranja,5,2.00);
        Almacen.almacenarProductos(helado,6,1.00);
        Almacen.almacenarProductos(pescado,7,3.00);
        Almacen.almacenarProductos(cacahuetes,8,2.00);
    }
}
