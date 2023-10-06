package Collection;

public class Eventos {
    //atributos
    private String nome;
    private String atracao;
    
    public Eventos(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }
    //este metodo retorna o valorda variavel e nao o local da variavel
    @Override
    public String toString() {
        return "Eventos [nome=" + nome + ", atracao=" + atracao + "]";
    }


}
