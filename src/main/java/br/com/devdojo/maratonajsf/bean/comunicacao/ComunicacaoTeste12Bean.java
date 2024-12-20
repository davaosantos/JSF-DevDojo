package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;
import br.com.devdojo.maratonajsf.util.ApplicationMapUtil;

import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {

    private Estudante estudante;
    private Estudante estudante2 = new Estudante();

    public String voltar(){
        System.out.println(estudante2.getNome());
        System.out.println(estudante2.getSobrenome());
        return "comunication11?faces-redirect=true";
    }

    public void init(){
        System.out.println("Entrou no ComunicacaoTeste12Bean");
        estudante = (Estudante) ApplicationMapUtil.getValueFromApplicationMap("estudante");
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Estudante getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante estudante2) {
        this.estudante2 = estudante2;
    }
}
