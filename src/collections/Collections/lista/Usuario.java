package collections.Collections.lista;

import java.util.Objects;

public class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
