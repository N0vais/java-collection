package Pesquisar;

public class Contatos {
    // atributos
    private String nome;
    private int numero;

    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    // get
    public int getNumero() {
        return numero;
    }

    // set
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contatos other = (Contatos) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Contatos [nome=" + nome + ", numero=" + numero + "]";
    }

}
