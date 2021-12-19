package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_responsavel")
public class Responsavel extends Usuario{
    @OneToOne
    private Crianca criancaz;


    private Responsavel(){

    }

    public Responsavel(String emaily, String senha, String nome, String cpf, String telefone, String cep, String num, String complemento, String descricao, LocalDateTime dataAniversario) {
        super(emaily, senha, nome, cpf, telefone, cep, num, complemento,dataAniversario);
        this.criancaz = new Crianca();
    }

    public Crianca getCriancas() {
        return criancaz;
    }

    public void setCriancas(Crianca criancas) {
        this.criancaz = criancas;
    }
}
