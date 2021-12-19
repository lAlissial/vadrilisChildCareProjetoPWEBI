package br.edu.ifpb.vadrilischildcare.service;

import br.edu.ifpb.vadrilischildcare.model.Usuario;
import br.edu.ifpb.vadrilischildcare.repositories.ResponsavelRepository;
import br.edu.ifpb.vadrilischildcare.model.Responsavel;
import br.edu.ifpb.vadrilischildcare.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service

public class ResponsavelService {
    @Autowired
    private ResponsavelRepository responsavelRepository;

    public List<Responsavel> getResponsaveis() {
        return this.responsavelRepository.findAll();
    }

    public Responsavel getResponsavelPorId(Long idUsuario) {
        return this.responsavelRepository.findById(idUsuario).orElse(null);
    }

    @Transactional
    public Responsavel inserirOuAtualizarResponsavel (Responsavel responsavel) {
        Responsavel responsavelInserido = this.responsavelRepository.save(responsavel);
        /*if (Period.between(responsavel.getDataAniversario().toLocalDate(), LocalDateTime.now().toLocalDate()).getYears() < 18) {
            throw new RuntimeException("Menor de idade não permitido");
        }*/
        return responsavelInserido;
    }

    public void apagarResponsavel(Long id) {
        this.responsavelRepository.deleteById(id);
    }

}
