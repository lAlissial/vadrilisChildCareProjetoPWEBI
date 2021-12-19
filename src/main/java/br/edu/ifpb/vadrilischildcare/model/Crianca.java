package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "tb_crianca")
public class Crianca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String dataAniversario;

    @OneToOne
    private Responsavel responsavel;

    public Crianca(){

    }

    public Crianca(String nome,Responsavel responsavel, String dataAniversario){
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}