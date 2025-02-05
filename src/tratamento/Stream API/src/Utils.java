package tratamento.Stream

import java.util.function.UnaryOperator;

public class Utils {
    static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();

    static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    public static String grito (String n) {
        return n + "aaaaaaaaahhh!!! ";
    }
}
