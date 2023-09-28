package Ordenacao.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    // atributos
    private Set<Produtos> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produtos(codigo, nome, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome() {
        Set<Produtos> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirProdutosPorPreco() {
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1, "produto 1", 2.20, 10);
        cadastroProduto.adicionarProduto(2, "produto 2", 3.30, 20);
        cadastroProduto.adicionarProduto(3, "produto 3", 4.40, 30);
        cadastroProduto.adicionarProduto(4, "produto 4", 5.50, 40);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
