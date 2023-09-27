package List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
 
private static List<Tarefas> tarefaList;

public ListaTarefas() {
    ListaTarefas.tarefaList = new ArrayList<>();
}

public static void adicionarTarefa(String descricao){
     tarefaList.add(new Tarefas(descricao));
}
    public static void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public static void obterDecricoesTarefas(){
        System.out.println(tarefaList);
    }
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
