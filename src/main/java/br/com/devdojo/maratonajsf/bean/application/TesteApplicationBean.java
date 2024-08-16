package br.com.devdojo.maratonajsf.bean.application;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
@ApplicationScoped
public class TesteApplicationBean {

    private List<String> categoriaList;

    @PostConstruct
    public void init(){
        System.out.println("Entrou no applicationScoped");
        categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void mudarLista(){
        categoriaList = Arrays.asList("Coisa", "Nova Categoria" );
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
