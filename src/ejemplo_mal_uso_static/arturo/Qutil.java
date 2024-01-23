package ejemplo_mal_uso_static.arturo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qutil {

    public static boolean esVocal(char caracter) {
        return "aeiouAEIOU".indexOf(caracter) != -1;
    }

    public static boolean esVocal(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (esVocal(c)) {
                return true;
            }
        }
        return false;
    }
    public static String esVocal() {
        Pattern patron = Pattern.compile("(^([aeiouAEIOU])([a-zA-Z_]\\s*.*)+$)");
        Matcher coincidir = patron.matcher(Casa.poblacio);
        boolean empiezaVocal = coincidir.find();
        if (empiezaVocal) {
            Casa.primeraLetra = "d'";
        } else {
            Casa.primeraLetra = "de ";
        }
        return Casa.primeraLetra;
    }
}