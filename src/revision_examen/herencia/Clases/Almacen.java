package revision_examen.herencia.Clases;

import java.util.ArrayList;
import java.util.Scanner;


public class Almacen {
    static ArrayList<Producto> listaProductos;
    static Scanner sc = new Scanner(System.in);

    public Almacen() {
        listaProductos = new ArrayList<>();
        listaProductos.add(new ProductoFresco("Lubina", "20/03/2024", 124, "09/12/2023", "España"));}

    public void interaccion() {
        boolean reptir = true;

        do {
            System.out.println("""
                    - Almacen -
                    1. Insertar productos
                    2. Ver stock actual
                    3. Sacar productos del almacen
                    4. Salir
                    
                   
                    """);
            System.out.print("Introduce una opcion: ");
            String respuesta = sc.nextLine();

            switch (respuesta) {
                case "1":
                    verificarInsertarProducto();
                    break;
                case "2":
                    verificarVerStock();
                    break;
                case "3":

                    break;
                case "4":
                    System.out.println("Saliendo");
                    reptir = Boolean.FALSE;
                    break;
                default:
                    System.out.println("Introduce una respuesta válida");
                    break;
            }
        } while (reptir);
        sc.close();
    }

    private void verificarInsertarProducto() {
        boolean reptir = true;

        do {
            System.out.println("¿Desea insertar un producto nuevo? (Y/N)");
            String respuesta = sc.nextLine().toUpperCase();

            switch (respuesta) {
                case "Y":
                    insertarProducto();
                    break;
                case "N":
                    System.out.println("Saliendo");
                    reptir = Boolean.FALSE;
                    break;
                default:
                    System.out.println("Introduce una respuesta válida");
                    break;
            }
        } while (reptir);
    }

    private void insertarProducto() {

        System.out.println("""
                - Insertar Producto -
                                
                ¿Que tipo de producto va a ser?
                1. Fresco
                2. Refrigerado
                3. Congelado
                """);
        System.out.print("Introduce una opcion: ");
        String respuesta = sc.nextLine();

        switch (respuesta) {
            case "1":
                insertarFresco();
                break;
            case "2":
                insertarRefrigerado();
                break;
            case "3":
                insertarCongelado();
                break;
        }
    }

    private void insertarFresco() {
        System.out.println("Introduce los datos del nuevo producto:");

        System.out.println("Nombre");
        String nombre = sc.nextLine();

        System.out.println("Fecha de caducidad: ");
        String fechaCaducidad = sc.nextLine();

        System.out.println("Numero de lote: ");
        int numeroLote = Integer.parseInt(sc.nextLine());

        System.out.println("Fecha de envasado: ");
        String fechaEnvasado = sc.nextLine();

        System.out.println("Pais de origen");
        String paisOrgien = sc.nextLine();

        Producto productoFrescoNuevo = new ProductoFresco(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrgien);
        listaProductos.add(productoFrescoNuevo);

        System.out.println("producto registrado exitosamente.");
    }

    private void insertarRefrigerado() {
        System.out.println("Introduce los datos del nuevo producto:");

        System.out.println("Nombre");
        String nombre = sc.nextLine();

        System.out.print("Fecha de caducidad: ");
        String fechaCaducidad = sc.nextLine();

        System.out.println("Numero de lote");
        int numeroLote = Integer.parseInt(sc.nextLine());

        System.out.println("Codigo del Organismo de Supervision Alimentaria");
        String codigoOsa = sc.nextLine();

        System.out.println("Pais de origen");
        String paisOrgien = sc.nextLine();

        Producto productoRefrigeradoNuevo = new ProductoRefigerado(nombre, fechaCaducidad, numeroLote, codigoOsa);
        listaProductos.add(productoRefrigeradoNuevo);

        System.out.println("producto registrado exitosamente.");
    }

    private void insertarCongelado() {
        System.out.println("Introduce los datos del nuevo producto:");

        System.out.println("Nombre");
        String nombre = sc.nextLine();

        System.out.print("Fecha de caducidad: ");
        String fechaCaducidad = sc.nextLine();

        System.out.println("Numero de lote");
        int numeroLote = Integer.parseInt(sc.nextLine());

        System.out.println("Temeratura de congelación recomendada");
        double temperatura = Double.parseDouble(sc.nextLine());

        Producto productoCongeladoNuevo = new ProductoCongelado(nombre, fechaCaducidad, numeroLote, temperatura);
        listaProductos.add(productoCongeladoNuevo);

        System.out.println("producto registrado exitosamente.");
    }

    public void verificarVerStock() {

        boolean reptir = true;

        do {
            System.out.println("¿Desea ver el stock? (Y/N)");
            String respuesta = sc.nextLine().toUpperCase();

            switch (respuesta) {
                case "Y":
                    verStock();
                    break;
                case "N":
                    System.out.println("Saliendo");
                    reptir = Boolean.FALSE;
                    break;
                default:
                    System.out.println("Introduce una respuesta válida");
                    break;
            }
        } while (reptir);
    }

    public void verStock() {

        System.out.println("- Stock -");

        System.out.print("Introduzca el nombre del producto que desa buscar:");
        String nombreProducto = sc.nextLine();

        int cantidadProducto = 0;

        for (Producto productoActual : listaProductos) {
            if (nombreProducto.equalsIgnoreCase(productoActual.getNombre())) {
                cantidadProducto++;
            }
        }

        if (cantidadProducto == 0) {
            System.out.println("No hay stock disponible de ese producto");
        } else {
            System.out.println("Stock de " + nombreProducto + ": " + cantidadProducto);
        }
    }
}
