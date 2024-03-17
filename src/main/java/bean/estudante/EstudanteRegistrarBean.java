package bean.estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private String nome = "David";
    private String sobrenome = "Oliveira";

    private Double nota01 = 10.0;

    private Double nota02 = 4.0;

    private Double nota03;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getNota01() {
        return nota01;
    }

    public void setNota01(Double nota01) {
        this.nota01 = nota01;
    }

    public Double getNota02() {
        return nota02;
    }

    public void setNota02(Double nota02) {
        this.nota02 = nota02;
    }

    public Double getNota03() {
        return nota03;
    }

    public void setNota03(Double nota03) {
        this.nota03 = nota03;
    }

}
