package br.com.devdojo.maratonajsf.bean.datatable;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;


@Named
@ViewScoped
public class DataTableTestBean implements Serializable {
    private List<Estudante> estudanteList = Estudante.getEstudanteList();
    private Set<Estudante> estudanteSet = new HashSet<>(Estudante.getEstudanteList());

    private List<Estudante> estudanteLinkedList = new LinkedList<>(Estudante.getEstudanteList());

    private Map<String, Estudante> estudanteMapList = new HashMap<>();

    public void init(){
        estudanteMapList.put("Estudante 1", new Estudante("Sonic", "Hedghehog", 10.0));
        estudanteMapList.put("Estudante 2", new Estudante("Knuckles", "knuc", 5.5));
        estudanteMapList.put("Estudante 3", new Estudante("Tails", "talezao", 6.0));
        estudanteMapList.values();
    }


    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

    public Set<Estudante> getEstudanteSet() {
        return estudanteSet;
    }

    public void setEstudanteSet(Set<Estudante> estudanteSet) {
        this.estudanteSet = estudanteSet;
    }

    public List<Estudante> getEstudanteLinkedList() {
        return estudanteLinkedList;
    }

    public void setEstudanteLinkedList(List<Estudante> estudanteLinkedList) {
        this.estudanteLinkedList = estudanteLinkedList;
    }

    public Map<String, Estudante> getEstudanteMapList() {
        return estudanteMapList;
    }

    public void setEstudanteMapList(Map<String, Estudante> estudanteMapList) {
        this.estudanteMapList = estudanteMapList;
    }
}
