package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mail;
    private String mensagem;

    public Comentario(){

    }


    /*public Comentario(String emailw, String mensagem){
        this.mail = emailw;
        this.mensagem = mensagem;
    }*/

    public Long getId() {
        return id;
    }

    public String getmail() {
        return this.mail;
    }

    public void setmail(String emailw) {
        this.mail = emailw;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
