package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livros> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor){
        List<Livros> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livros l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
        if( !livroList.isEmpty()){
            for (Livros l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livrosPorTitulo = null;
        if (!livroList.isEmpty()){
            for( Livros l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros =new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 2", 2001);
        catalogoLivros.adicionarLivro("Livro 2 ", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 3 ", "Autor 3", 2003);
        catalogoLivros.adicionarLivro("Livro 4 ", "Autor 4", 2004);

        //System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2002, 2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1 "));
    }   
}
