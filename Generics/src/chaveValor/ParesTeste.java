package chaveValor;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "João");
        resultadoConcurso.adicionar(2, "Julia");
        resultadoConcurso.adicionar(3, "Jane");
        resultadoConcurso.adicionar(2, "Joe");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(3));
    }
}
