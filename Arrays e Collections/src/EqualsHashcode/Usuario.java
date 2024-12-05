package EqualsHashcode;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return super.equals(obj);
        } else {
            return false;
        }
    }
}
