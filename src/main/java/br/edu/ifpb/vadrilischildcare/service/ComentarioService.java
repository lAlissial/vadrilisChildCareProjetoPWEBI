package br.edu.ifpb.vadrilischildcare.service;

import br.edu.ifpb.vadrilischildcare.model.Avaliacao;
import br.edu.ifpb.vadrilischildcare.repositories.AvaliacaoRepository;
import br.edu.ifpb.vadrilischildcare.repositories.ComentarioRepository;
import br.edu.ifpb.vadrilischildcare.model.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service

public class ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> getComentario() {
        return this.comentarioRepository.findAll();
    }

    public Comentario getComentarioPorId(Long idComentario) {
        return this.comentarioRepository.findById(idComentario).orElse(null);
    }

    @Transactional
    public Comentario inserirComentario (Comentario comentario) {
        Comentario comentarioInserido = this.comentarioRepository.save(comentario);
        return comentarioInserido;
    }

    public void apagarComentario(Long id) {
        this.comentarioRepository.deleteById(id);
    }
}
