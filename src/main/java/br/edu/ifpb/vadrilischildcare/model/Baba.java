package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "tb_baba")
public class Baba extends Usuario{
    private String descricao;

    public Baba() {

    }


    public Baba(String emailz, String senha, String nome, String cpf, String telefone, String cep, String num, String complemento, String descricao, String dataAniversario) {
        super(emailz, senha, nome, cpf, telefone, cep, num, complemento, dataAniversario);
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}







