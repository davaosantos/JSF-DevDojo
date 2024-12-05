package br.com.devdojo.maratonajsf.model;

import br.com.devdojo.maratonajsf.model.enums.Turma;
import br.com.devdojo.maratonajsf.model.enums.Turno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Estudante {

    private Long id;

    private String nome = "David";
    private String sobrenome = "Oliveira";

    private Double nota01 = 10.0;

    private Double nota02 = 4.0;

    private Double nota03;

    private Turno turno = Turno.MATUTINO;

    private Turma turma = Turma.T1A;

    private String email = "david_Alisson60@yahoo.com";

    public static List<Estudante> getEstudanteList(){
        return new ArrayList<>(Arrays.asList(
                new Estudante("Sonic", "Hedghehog", 10.0),
                new Estudante("Sonic", "Hedghehog", 10.0),
                new Estudante("Knuckles", "knuc", 5.5),
                new Estudante("Tails", "talezao", 6.0)
        ));
    }

    public Estudante() {
    }

    public Estudante(String nome, String sobrenome, Double nota01) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota01 = nota01;
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(nome, estudante.nome) && Objects.equals(sobrenome, estudante.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
