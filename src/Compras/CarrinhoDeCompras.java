package Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private static List<Itens> listaItens;

    public CarrinhoDeCompras(){
        //primeiro coloca o nome da classe e depois a lista atributo.
        CarrinhoDeCompras.listaItens = new ArrayList<>();
    }
    //metodo adicionar item
    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Itens(nome, preco, quantidade));
    }
    //metodo remover item
    public void removerItem(String nome){
        List<Itens> itensRemover = new ArrayList<>();
        for(Itens t : listaItens){
            if (t.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(t);
            }
        }
        listaItens.removeAll(itensRemover);
    }
    //metodo calcular valor total
    public double calcularValorTotal(){
        double calcularValorTotalCarrinho = 0d;
        if(!listaItens.isEmpty()){
            for(Itens i : listaItens){
                calcularValorTotalCarrinho += i.getPreco() * i.getPreco();
            }
        }
        return calcularValorTotalCarrinho;
    }
    //metodo que exibe od itens na tela
    public void exibirItens(){
        if (!listaItens.isEmpty()) {
            System.out.println(CarrinhoDeCompras.listaItens);
        } else {
            System.out.println("Não existe lista");
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras it = new CarrinhoDeCompras();

        it.adicionarItem("pasta", 12.32, 45);
        it.adicionarItem("lapis", 2.32, 25);
        it.adicionarItem("borracha", 5.02, 75);
        it.adicionarItem("caneta", 2.20, 5);

        it.exibirItens();
    }
}
