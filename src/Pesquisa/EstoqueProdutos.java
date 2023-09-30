package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque ;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p ;
                }
            }
        }
        return produtoMaisCaro;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1l, "produto a", 10, 5.50);
        estoque.adicionarProduto(2l, "produto b", 5, 10.50);
        estoque.adicionarProduto(3l, "produto c", 4, 15.50);
        estoque.adicionarProduto(4l, "produto d", 2, 2.99);
        estoque.adicionarProduto(4l, "produto e", 2, 122.99);

        estoque.exibirProdutos();

        System.out.println("valor total do estoque : R$ " + estoque.calculaValorTotalEstoque());
        // metodo obter produto mais caro esta retornado sempre o ultimo val
        System.out.println("Produto mais caro " + estoque.obterProdutoMaisCaro());
    }
}
