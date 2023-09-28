package OperacoesBasicas;

public class Convidados {
    
    private String nome;
    private int codigoConvidado;

    public String getNome() {
        return nome;
    }
    // metodo hashcode para transformar o codigo do convidado unico
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvidado;
        return result;
    }
    //metodo que compara o o codigo 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidados other = (Convidados) obj;
        if (codigoConvidado != other.codigoConvidado)
            return false;
        return true;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    //metodo construtor
    public Convidados(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    

     @Override
    public String toString() {
        return "Convidados [nome=" + nome + ", codigoConvidado=" + codigoConvidado + "]";
    }

}
