package br.com.senai.infoa.backend.projeto_curso.models;

import java.time.LocalDate;

public class Curso {
    // definição de atributos
    private Integer id;
    private String nome;
    private LocalDate dataInicio;

    // definição de construtores
    public Curso() {
    }

    // contrutor parametrizado
    public Curso(Integer id, String nome, LocalDate dataInicio) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
    }

    // getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

}
