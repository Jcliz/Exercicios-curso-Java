package generics;

import java.util.List;

public class ListaUtil {
    //? == qualquer tipo
    public static Object getUltimo1(List<?> lista) {
        return lista.getLast();
    }

    public static <T> T getUltimo2(List<T> lista) {
        return lista.getLast();
    }
}
