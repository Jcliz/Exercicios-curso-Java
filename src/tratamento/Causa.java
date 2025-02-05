package tratamento;

import Filter.Aluno;

public class Causa {
    public static void main(String[] args) {
        try{
            methodA(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
    }

    static void methodA (Aluno aluno) {
        try {
            methodB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    static void methodB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("O aluno está nulo.");
        }

        System.out.println(aluno.getNome());
    }
}
