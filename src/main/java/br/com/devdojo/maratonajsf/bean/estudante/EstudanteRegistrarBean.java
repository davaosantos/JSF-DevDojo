package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;


@Named
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();

    private String[] nomesArray = {"DevDojo", "eh" , "Zika"};

    private List<String> nomesList = Arrays.asList("David" , "Eh ", "Cagão");

    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku" , "Naruto ", "Kuririn"));

    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("Kuririn", "O bunda mole");
        nomesMap.put("Gohan", "Filho fodao");

        for (Map.Entry<String, String> nomesEntry : nomesMap.entrySet()){
            System.out.printf(nomesEntry.getKey());
            System.out.printf(nomesEntry.getValue());

        }
    }


    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }


}
