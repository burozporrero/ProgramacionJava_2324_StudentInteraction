//He comentado las líneas 42-44 y 207 que es lo que Bea ha hecho para enseñar porque no puede ser static
package ejemplo_mal_uso_static.arturo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static String carrer = null;
    public static Integer nombre = null;
    public static String poblacio = null;
    public static Double superficie = null;
    public static Boolean garatge = null;
    public static Integer edat = null;
    public static boolean mesInfo = false;
    public static boolean guardarInfo = false;
    public static boolean repetir = false;

    static List<Casa> lista = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("\nPrimera part de l'exercici." +
                "\n-------------------------------------------------------\n");
        espera(1);

        Casa primeraCasa = new Casa("Major", 12, "Llíria",98.0,30,false);

        primeraCasa.getInfo();
        espera(1);

        Casa miCasa = new Casa("València", 1, "La Pobla de Vallbona",112.0,5,true);

//        lista.add(primeraCasa);
//        lista.add(miCasa);
//        System.out.println(lista.toString());

        miCasa.getInfo();
        espera(1);

        Casa otraCasa = new Casa("Serrano", 48, "Olocau", 130.0,40,true);

        otraCasa.getInfo();
        espera(3);

        System.out.println("\nEl nombre de cases creades es " + Casa.getComptadorCases());
        espera(1);

        //new Casa().getAdressaCompleta(); porque funciona esto????

        System.out.println("Fins ací els punts 6, 7 i 8 de l'exercici\n" +
                "------------------------------------------------------------\n");
        espera(1);
        System.out.println("Segona part, punt 9\n" +
                "------------------------------------------------------------\n");
        espera(1);
        aplicacio();
        sc.close();
    }
    private static void aplicacio() {

        System.out.println("Benvingut a 'GUARDA TA CASA!'\n" +
                "El sistema guardarà la direcció i les dades de la casa que desitge,\n" +
                "abans de guardar-les li demanarà confirmació.\n");

        espera(3);
        introduirInformacio();

        System.out.println("Desitja introduïr informació adicional?\n1 (sí)\n2 (no)");

        mesInfo = comprovarResposta();

        if (mesInfo) {
            introduirInformacioExtra();
        }
        System.out.println("Desitja guardar la informació que ha introduït?\n1 (sí)\n2 (no)");

        guardarInfo = comprovarResposta();

        if (guardarInfo) {

            if (mesInfo) {
                guardarTotaInformacio();
            }else {
                guardarAdressa();
            }
            System.out.println("Es procedeix a mostrar la informació introduïda");
            mostrarInformacio(mesInfo);
        }else {
            borrarInformacio();
        }
        espera(1);
        System.out.println("\nGràcies per utitzar els nostres serveis.\n");
    }
    private static void introduirInformacio() {
        System.out.println("Per favor introduïsca el carrer on està situada la casa:");
        carrer = sc.nextLine();

        System.out.println("Introduïsca el nombre del portal:");
        nombre = comprovarResposta(nombre);

        sc.nextLine();//limpia buffer

        System.out.println("Introduïsca la població on està situada:");
        poblacio = sc.nextLine();
    }
    private static boolean comprovarResposta() {
        int decisioMesInformacio = 0;
        do {
            try {
                decisioMesInformacio = sc.nextInt();
                repetir = false;
                if (decisioMesInformacio != 1 && decisioMesInformacio !=2) {
                    System.out.println("El nombre introduït no es el 1 ni el 2, per favor torne a introduïr:");
                    repetir = true;
                }
            } catch (Exception e) {
                System.out.println("El caràcter introduït no es un nombre, per favor torne a introduïr:");
                repetir = true;
                sc.next();//limpia buffer
            }
        }while (repetir);
        if (decisioMesInformacio == 1) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
    private static Integer comprovarResposta(Integer nombre) {
        do {
            try {
                nombre = sc.nextInt();
                repetir = false;
            } catch (Exception e) {
                System.out.println("El caràcter introduït no es un nombre, per favor torne a introduïr:");
                repetir = true;
                sc.next();//limpia buffer
            }
        }while (repetir);
        return nombre;
    }
    private static double comprovarResposta(Double superficie) {
        do {
            try {
                superficie = sc.nextDouble();
                repetir = false;
            } catch (Exception e) {
                System.out.println("El caràcter introduït no es un nombre, per favor torne a introduïr:");
                repetir = true;
                sc.next();//limpia buffer
            }
        }while (repetir);
        return superficie;
    }
    private static void introduirInformacioExtra() {
        System.out.println("Per favor introduïsca la informació adicional que se li demane\n");
        espera(1);
        System.out.println("Introduïsca la superficie construïda en m²:");

        superficie = comprovarResposta(superficie);

        System.out.println("Introduïsca si te garaig o no amb un 1 per a 'sí que te' o un 2 per a 'no te':");

        garatge = comprovarResposta();

        System.out.println("Introduïsca l'edat de la vivenda en anys:");

        edat = comprovarResposta(edat);
    }
    private static void borrarInformacio() {
        System.out.println("Es procedeix a esborrar la informació introduïda");
        carrer = null;
        nombre = null;
        poblacio = null;
        superficie = null;
        garatge = null;
        edat = null;
    }
    private static void guardarAdressa() {
        guardant();

        Casa.setCarrer(carrer);
        Casa.setNombre(nombre);
        Casa.setPoblacio(poblacio);
    }
    private static void guardarTotaInformacio() {
        guardant();

        Casa.setCarrer(carrer);
        Casa.setNombre(nombre);
        Casa.setPoblacio(poblacio);
        Casa.setSuperficie(superficie);
        Casa.setGaratge(garatge);
        Casa.setEdat(edat);

//        System.out.println(lista.toString());
    }
    private static void guardant() {
        try {
            System.out.print("Guardant la informació");
            for (int i = 0; i < 5; i++ ){
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.println("\nGuardat!");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void mostrarInformacio(boolean mesInfo) {
        espera(1);
        if (mesInfo) {
            System.out.println("---------------------" +
                    "\nCarrer: " + Casa.getCarrer() +
                    "\nNombre: " + Casa.getNombre() +
                    "\nPoblació: " + Casa.getPoblacio() +
                    "\nSuperficie: " + Casa.getSuperficie() +
                    "\nGaratge: " + Casa.getGaratge() +
                    "\nEdat: " + Casa.getEdat() +
                    "\n------------------");
        }else {
            System.out.println("---------------------" +
                    "\nCarrer: " + Casa.getCarrer() +
                    "\nNombre: " + Casa.getNombre() +
                    "\nPoblació: " + Casa.getPoblacio() +
                    "\n------------------");
        }
    }
    private static void espera(int segundos) {
        try {
            Thread.sleep((segundos*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}