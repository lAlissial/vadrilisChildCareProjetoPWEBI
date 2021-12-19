package br.edu.ifpb.vadrilischildcare.service;


import br.edu.ifpb.vadrilischildcare.repositories.AvaliacaoRepository;
import br.edu.ifpb.vadrilischildcare.model.Avaliacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service

public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> getAvaliacoes() {
        return this.avaliacaoRepository.findAll();
    }

    public Avaliacao getAvaliacaoPorId(Long idAvaliacao) {
        return this.avaliacaoRepository.findById(idAvaliacao).orElse(null);
    }

    @Transactional
    public Avaliacao inserirOuAtualizarAvaliacao (Avaliacao avaliacao) {
        Avaliacao avaliacaoInserida = this.avaliacaoRepository.save(avaliacao);
        return avaliacaoInserida;
    }

    public void apagarAvaliacao(Long id) {
        this.avaliacaoRepository.deleteById(id);
    }
}
