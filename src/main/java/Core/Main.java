package Core;

/**
 * Created by mrc on 31/05/16.
 */
public class Main {
    private String variableQueNoHaceNada;
    
    public static String holaMethod(String name) {
        if (name.equalsIgnoreCase("marcos")) {
            return "Hola señor " + name;
        } else {
            return "Hola " + name;
        }
    }

}
