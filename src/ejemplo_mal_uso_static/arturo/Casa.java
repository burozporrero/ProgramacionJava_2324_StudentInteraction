//Aquí he comentado la línea 115-118 que es lo que Bea ha corregido para mostrar para que funciona el static
package ejemplo_mal_uso_static.arturo;

public class Casa {

    public static String carrer;
    public static int nombre;
    public static String poblacio;
    public static Double superficie;
    public static Boolean garatge;
    public static int edat;
    public static final Double SUPERFICIE_MINIMA = 43.5;
    public static int comptadorCases = 0;
    public static String primeraLetra;
    public static String teGaraig;

    public Casa() {
        comptadorCases++;
    }

    public Casa(String carrer, int nombre, String poblacio) {
        this();
        this.carrer = carrer;
        this.nombre = nombre;
        this.poblacio = poblacio;
    }

    public Casa(String carrer, int nombre, String poblacio, Double superficie, int edat, boolean garatge) {
        this(carrer, nombre, poblacio);
        this.superficie = superficie;
        this.edat = edat;
        this.garatge = garatge;
    }

    public void getAdressaCompleta() {
        Qutil.esVocal();
        getCarrer();
        getNombre();
        getPoblacio();
        System.out.print("C/" + carrer + " nº" + nombre + " població " + Qutil.esVocal() + poblacio);
    }

    public void getInfo() {
        getAdressaCompleta();
        getEdat();
        getGaratge();
        getSuperficie();

        if (garatge) {
            teGaraig = "amb garaig";
        } else {
            teGaraig = "sense garaig";
        }
        System.out.println(" de " + superficie + " metres quadrats " + teGaraig + " de " + edat + " anys.");
    }

    public static int getComptadorCases() {
        return comptadorCases;
    }
    public static void setComptadorCases(int nouComptador) {
        comptadorCases = nouComptador;
    }
    public static void incrementaComptadorCases() {
        comptadorCases++;
    }

    public static String getCarrer() {
        return carrer;
    }

    public static void setCarrer(String carrer) {
        Casa.carrer = carrer;
    }

    public static int getNombre() {
        return nombre;
    }

    public static void setNombre(int nombre) {
        Casa.nombre = nombre;
    }

    public static String getPoblacio() {
        return poblacio;
    }

    public static void setPoblacio(String poblacio) {
        Casa.poblacio = poblacio;
    }

    public static Double getSuperficie() {
        return superficie;
    }

    public static void setSuperficie(Double superficie) {
        Casa.superficie = superficie;
    }

    public static Boolean getGaratge() {
        return garatge;
    }

    public static void setGaratge(Boolean garatge) {
        Casa.garatge = garatge;
    }

    public static int getEdat() {
        return edat;
    }

    public static void setEdat(int edat) {
        Casa.edat = edat;
    }

//    public String toString(){
//        String s = "CASA: " + getCarrer() + " " + getPoblacio() + " " +getNombre() + " " + getSuperficie() +  " " + getEdat();
//        return s;
//    }
}
