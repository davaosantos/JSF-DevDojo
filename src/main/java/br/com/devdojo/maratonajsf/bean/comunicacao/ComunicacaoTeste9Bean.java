package br.com.devdojo.maratonajsf.bean.comunicacao;

import org.omnifaces.util.Faces;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class ComunicacaoTeste9Bean implements Serializable {
    private String value;

    public void init() {

        value = Faces.getRequestCookie("Nome");
        System.out.println(value);
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
