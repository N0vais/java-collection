package List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
 //atributo
private static List<Tarefas> tarefaList;
//construtor
public ListaTarefas() {
    ListaTarefas.tarefaList = new ArrayList<>();
}
    //metodo adicionar tarefa
    public static void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefas(descricao));
    }
    //metodo remover tarefa
    public static void removerTarefa(String descricao){
        //criando uma lista vazia para adicionar as tarefas para remover
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        //tarefaliste remove as tarefas que forem colocada dentro da lista vazia
        tarefaList.removeAll(tarefasParaRemover);
    }
    //obtem a quantidade de tarefas
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    //metodo que obtem as descriçao das tarefas e imprime
    public static void obterDecricoesTarefas(){
        System.out.println(tarefaList);
    }
    //metodo que roda o codigo metodo maim
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        
        ListaTarefas.adicionarTarefa("tarefa 1");
        ListaTarefas.adicionarTarefa("tarefa 1");
        ListaTarefas.adicionarTarefa("tarefa 1");
        ListaTarefas.adicionarTarefa("tarefa 1");
        ListaTarefas.adicionarTarefa("tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        ListaTarefas.removerTarefa("tarefa 1");
        System.out.println("O numero total de elementos é: " + listaTarefas.obterNumeroTotalTarefas());

        ListaTarefas.obterDecricoesTarefas();
    }
}
