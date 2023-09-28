package Pesquisar;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contatos> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contatos(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contatos> pesquisarPorNome(String nome) {
        Set<Contatos> contatoPorNome = new HashSet<>();

        for (Contatos c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contatos atualizarNumeroContato(String nome, int numero, int novoNumero) {
        Contatos contatoAtualizado = null;

        for (Contatos c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Daniel", 12121212);
        agendaContatos.adicionarContato("Diego", 23232323);
        agendaContatos.adicionarContato("Daniel", 02020202);
        agendaContatos.adicionarContato("Diego novais", 56565656);
        agendaContatos.adicionarContato("Dayane", 78787878);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Diego"));
    }
}
