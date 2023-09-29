package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContato = new AgendaContatos();
        agendaContato.adicionarContato("Daniel", 121212);
        agendaContato.adicionarContato("Diego", 232323);
        agendaContato.adicionarContato("Daniel",343434 );
        agendaContato.adicionarContato("Daniel Novais",454545 );
        agendaContato.adicionarContato("Dayane", 565656);

        agendaContato.exibirContato();

        agendaContato.removerContato("Diego");

        agendaContato.exibirContato();


        //System.out.println("o numero é: " + agendaContato.pesquisarPorNome("Diego"));
    }
}
