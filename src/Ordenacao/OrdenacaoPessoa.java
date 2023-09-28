package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAutura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAutura, new ComparatorPorAutura() );
        return pessoasPorAutura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.70);
        ordenacaoPessoa.adicionarPessoa("nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("nome 3", 10, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome 4", 12, 1.35);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
