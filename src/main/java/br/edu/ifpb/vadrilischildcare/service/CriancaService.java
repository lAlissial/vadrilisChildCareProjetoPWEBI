package br.edu.ifpb.vadrilischildcare.service;

import br.edu.ifpb.vadrilischildcare.model.Responsavel;
import br.edu.ifpb.vadrilischildcare.repositories.CriancaRepository;
import br.edu.ifpb.vadrilischildcare.model.Crianca;
import br.edu.ifpb.vadrilischildcare.repositories.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service


public class CriancaService {
    @Autowired
    private CriancaRepository criancaRepository;

    public List<Crianca> getCriancas() {
        return this.criancaRepository.findAll();
    }

    public Crianca getCriancaPorId(Long idCrianca) {
        return this.criancaRepository.findById(idCrianca).orElse(null);
    }

    @Transactional
    public Crianca  inserirOuAtualizarCrianca (Crianca crianca) {
        Crianca criancaInserida = this.criancaRepository.save(crianca);
        return criancaInserida;
    }

    public void apagarCrianca(Long id) {
        this.criancaRepository.deleteById(id);
    }
}
