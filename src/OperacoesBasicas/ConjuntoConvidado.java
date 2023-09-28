package OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidado {
        //atributos
        private Set<Convidados> convidadosSet;

        public ConjuntoConvidado(){
            this.convidadosSet = new HashSet<>();
        }
        
        public void adicionarConvidados(String nome, int codigoConvidado){
            convidadosSet.add(new Convidados(nome, codigoConvidado));
        }

        public void removerConvidadoPorConvite(int codigoConvidado){
            
            Convidados convidadoParaRemover = null;
            for (Convidados c : convidadosSet){
                if (c.getCodigoConvidado() == codigoConvidado){
                    convidadoParaRemover = c;
                    break;
                }
            }

            convidadosSet.remove(convidadoParaRemover);
        }
        
        public int contarConvidados(){
            return convidadosSet.size();
        }

        public void exibirConvidados(){
            System.out.println(convidadosSet);
        }

        public static void main(String[] args) {
            ConjuntoConvidado conjuntoConvidado = new  ConjuntoConvidado();
            System.out.println("Existem " + conjuntoConvidado.contarConvidados() + "dentro do set de convidados");

            conjuntoConvidado.adicionarConvidados("convidado 1", 1234);
            conjuntoConvidado.adicionarConvidados("convidado 2", 1235);
            conjuntoConvidado.adicionarConvidados("convidado 3", 1236);
            conjuntoConvidado.adicionarConvidados("convidado 4", 1237);

            conjuntoConvidado.exibirConvidados();

            System.out.println("Existem " + conjuntoConvidado.contarConvidados() + "convidados");

            conjuntoConvidado.removerConvidadoPorConvite(1234);

            System.out.println("Existem " + conjuntoConvidado.contarConvidados() + "dentro do set");

            conjuntoConvidado.exibirConvidados();
        }

}