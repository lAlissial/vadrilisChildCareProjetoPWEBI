package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String emailw;
    private String mensagem;

    public Comentario(){

    }


    public Comentario(String emailw, String mensagem){
        this.emailw = emailw;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public String getEmailw() {
        return emailw;
    }

    public void setEmailw(String emailw) {
        this.emailw = emailw;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
