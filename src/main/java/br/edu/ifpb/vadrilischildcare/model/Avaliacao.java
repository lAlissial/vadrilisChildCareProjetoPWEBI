package br.edu.ifpb.vadrilischildcare.model;

import javax.persistence.*;


@Entity
@Table(name = "tb_avaliacao")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="us_emt_id", referencedColumnName="id")
    private Usuario emitente;

    @ManyToOne
    @JoinColumn(name="us_dst_id", referencedColumnName="id")
    private Usuario destinatario;

    private String mensagem;

    public Avaliacao(){

    }

    public Avaliacao(Usuario emitente, Usuario destinatario, String mensagem){
        this.emitente = emitente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public Usuario getEmitente() {
        return emitente;
    }

    public void setEmitente(Usuario emitente) {
        this.emitente = emitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
