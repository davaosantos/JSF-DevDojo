package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {

    private String buttonName = "Nome do botao do bean";

    private Estudante estudante = new Estudante();
    public void execute(ActionEvent event){
        String nome = (String) event.getComponent().getAttributes().get("nome");
        String adjetivo = (String) event.getComponent().getAttributes().get("adjetivo");
        Estudante estudante1 = (Estudante) event.getComponent().getAttributes().get("estudante");
        System.out.println(nome);
        System.out.println(adjetivo);
        System.out.println(estudante1.getTurno());
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
