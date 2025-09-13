package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;


@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();

    private String[] nomesArray = {"DevDojo", "eh" , "Zika"};

    private List<String> nomesList = Arrays.asList("David" , "Eh ", "Cagão");

    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku" , "Naruto ", "Kuririn"));

    private Map<String, String> nomesMap = new HashMap<>();

    private boolean mostrarNotas ;

    private boolean mostrarLink;

    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("Kuririn", "O bunda mole");
        nomesMap.put("Gohan", "Filho fodao");

//        for (Map.Entry<String, String> nomesEntry : nomesMap.entrySet()){
//            System.out.printf(nomesEntry.getKey());
//            System.out.printf(nomesEntry.getValue());
//
//        }
    }

    public void exibirNotas(){
        this.mostrarNotas = true;
    };

    public void esconderNotas(){
        this.mostrarNotas = false;
    };

    public void exibirLink(){
        this.mostrarLink = true;
    };

    public void esconderLink(){
        this.mostrarLink = false;
    };

    public void calcularCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println(result);
    }

    public void executar(){
        System.out.println("Fazendo uma busca no BD");
        System.out.printf("Processando os dados");
        System.out.println("Exibindo os dados");//
    }

    public void executar(String par){
        System.out.println("Fazendo uma busca no BD com o PARAMETRO" + par);
        System.out.printf("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public String executarRetorno(String par){
        return "Quem é o lindao?" + par;
    }

    public String irParaIndex2(){
        System.out.println("Entrou no redirect");
        return "index2?faces-redirect=true";
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

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
