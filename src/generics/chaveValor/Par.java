package generics.chaveValor;

import java.util.Objects;

public class Par<C, V> {
    private C chave;
    private V valor;

    public Par (C chave, V valor) {
        super();
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(chave, par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chave);
    }
}