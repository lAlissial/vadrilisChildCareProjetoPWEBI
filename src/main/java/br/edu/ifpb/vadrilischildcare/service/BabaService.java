package br.edu.ifpb.vadrilischildcare.service;

import br.edu.ifpb.vadrilischildcare.model.Responsavel;
import br.edu.ifpb.vadrilischildcare.repositories.BabaRepository;
import br.edu.ifpb.vadrilischildcare.model.Baba;
import br.edu.ifpb.vadrilischildcare.repositories.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service

public class BabaService {
    @Autowired
    private BabaRepository babaRepository;

    public List<Baba> getBabas() {
        return this.babaRepository.findAll();
    }

    public Baba getBabaPorId(Long idBaba) {
        return this.babaRepository.findById(idBaba).orElse(null);
    }

    @Transactional
    public Baba inserirOuAtualizarBaba (Baba baba) {
        Baba babaInserida = this.babaRepository.save(baba);
        if (Period.between(baba.getDataAniversario().toLocalDate(), LocalDateTime.now().toLocalDate()).getYears() < 18) {
            throw new RuntimeException("Menor de idade não permitido");
        }
        return babaInserida;
    }

    public void apagarBaba(Long id) {
        this.babaRepository.deleteById(id);
    }
}
