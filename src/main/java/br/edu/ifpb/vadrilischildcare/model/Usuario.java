package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mail;
    private String senha;
    private String nome;
    private String cpf;
    private String dataAniversario;
    private String telefone;
    private String cep;
    private String num;
    private String complemento;

    @OneToMany
    @JoinColumn
    private List<Avaliacao> avaliacoes  = new ArrayList<Avaliacao>();

    public Usuario(){

    }

    public Usuario(String emaily, String senha, String nome, String cpf, String telefone, String cep, String num, String complemento, String dataAniversario){
        this.mail = emaily;
        this.senha= senha;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cep = cep;
        this.num = num;
        this.complemento = complemento;
        this.dataAniversario = dataAniversario;
    }

    public Long getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String emaily) {
        this.mail = emaily;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionar(Avaliacao av)	{
        avaliacoes.add(av);
    }

    public void remover(Avaliacao av)	{
        avaliacoes.remove(av);
    }
}
