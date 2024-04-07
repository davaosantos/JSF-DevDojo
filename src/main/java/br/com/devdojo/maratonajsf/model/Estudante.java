package br.com.devdojo.maratonajsf.model;

import br.com.devdojo.maratonajsf.model.enums.Turno;

public class Estudante {

    private String nome = "David";
    private String sobrenome = "Oliveira";

    private Double nota01 = 10.0;

    private Double nota02 = 4.0;

    private Double nota03;

    private Turno turno = Turno.MATUTINO;

    public Estudante() {
    }

    public Estudante(String nome, String sobrenome, Double nota01, Double nota02, Double nota03, Turno turno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.turno = turno;
    }

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

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }


}
