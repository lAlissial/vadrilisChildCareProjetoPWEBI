package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
//@Table(name = "tb_responsavel")
public class Responsavel extends Usuario{
    @OneToOne
    @JoinColumn(name="cri_id", referencedColumnName="id")
    private Crianca criancaw;


    public Responsavel(String emaily, String senha, String nome, String cpf, String telefone, String cep, String num, String complemento, String descricao, String dataAniversario) {
        super(emaily, senha, nome, cpf, telefone, cep, num, complemento,dataAniversario);
    }

    public Responsavel() {

    }

    public Crianca getCriancas() {
        return criancaw;
    }

    public void setCriancas(Crianca criancas) {
        this.criancaw = criancas;
    }
}
