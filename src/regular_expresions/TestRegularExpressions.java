package regular_expresions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpressions {

    static Scanner sc = new Scanner(System.in);
    static public void main(String[] args){

        sc.useDelimiter("\\n");

        compruebaNombre();
        compruebaEmail();
        compruebaIP();
        compruebaTelefono();
        compruebaCodigoPostal();
        compruebaEnlaceHTML();
    }

    static public boolean isValid(String dato, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dato);
        return m.matches();
    }

    static public void compruebaNombre(){

        boolean regexValida = Boolean.FALSE;
        // Nombre completo donde nombre y apellidos aceptan guiones, imp. mayúsculas y coma
        // Apellido1 Apellido2, Nombre
        // TODO - La siguiente no acepta acentos
        final String NAME_REGEX = "^([A-Z]{1}[a-zA-Z-\\.]+)\\s([A-Z]{1}[a-zA-Z-\\.]+),(\\s[A-Z]{1}[a-zA-Z-\\.]+)+$";

        do {
            System.out.println("Apellido1 Apellido2, Nombre");
            String nombre = sc.nextLine();
            regexValida = isValid(nombre, NAME_REGEX);
            System.out.println(regexValida);
        } while (!regexValida);
    }

    static public void compruebaEmail(){

        boolean regexValida = Boolean.FALSE;
        // Email:
        // nombre_usuario@dominio
        final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        do {
            System.out.println("nombre_usuario@dominio");
            String nombre = sc.nextLine();
            regexValida = isValid(nombre, EMAIL_REGEX);
            System.out.println(regexValida);
        } while (!regexValida);
    }

    static public void compruebaIP(){

        boolean regexValida = Boolean.FALSE;
        // Dirección IP (IPv4), no puede superar el 255
        // xxx.xxx.xxx.xxx
        final String zeroTo255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        final String IP_REGEX = "^" + zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "$";

        do {
            System.out.println("xxx.xxx.xxx.xxx");
            String nombre = sc.nextLine();
            regexValida = isValid(nombre, IP_REGEX);
            System.out.println(regexValida);
        } while (!regexValida);
    }

    static public void compruebaTelefono(){

        boolean regexValida = Boolean.FALSE;
        // Teléfono
        // +(34) xxxxxxxxx
        final String TELEPHONE_REGEX = "^\\+\\(34\\)\\s\\d{9}$";

        do {
            System.out.println("+(34) xxxxxxxxx");
            String nombre = sc.nextLine();
            regexValida = isValid(nombre, TELEPHONE_REGEX);
            System.out.println(regexValida);
        } while (!regexValida);
    }

    static public void compruebaCodigoPostal(){

        boolean regexValida = Boolean.FALSE;
        // Código postal: Sólo españoles, que tienen 5 dígitos y ¿alguna restricción más?
        // xxxxx
        final String POSTAL_CODE_REGEX = "";

        do {
            System.out.println("C.P : xxxxx");
            String nombre = sc.nextLine();
            regexValida = isValid(nombre, POSTAL_CODE_REGEX);
            System.out.println(regexValida);
        } while (!regexValida);
    }

    static public void compruebaEnlaceHTML(){

        boolean regexValida = Boolean.FALSE;
        // Comprueba que una etiqueta html a (enlace) tiene su respectivo atributo href y que está bien escrita y
        // cerrada con su correspondiente </a>
        final String HREF_REGEX = "";

        do {
            System.out.println("Comprueba enlace con href");
            String nombre = sc.nextLine();
            regexValida = isValid(nombre, HREF_REGEX);
            System.out.println(regexValida);
        } while (!regexValida);
    }
}
