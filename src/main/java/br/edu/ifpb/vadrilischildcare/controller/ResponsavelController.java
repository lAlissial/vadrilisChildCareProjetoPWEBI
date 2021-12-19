package br.edu.ifpb.vadrilischildcare.controller;

import br.edu.ifpb.vadrilischildcare.model.Responsavel;
import br.edu.ifpb.vadrilischildcare.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")

public class ResponsavelController {
    @Autowired
    private ResponsavelService responsavelService;

    @GetMapping("/responsaveis")
    public List<Responsavel> getResponsaveis() {
        return this.responsavelService.getResponsaveis();
    }

    @GetMapping("/responsaveis/{id}")
    public Responsavel getResponsavelPorId(@PathVariable("id") Long idResponsavel) {
        return this.responsavelService.getResponsavelPorId(idResponsavel);
    }

    @PostMapping("/responsaveis")
    public Responsavel inserirResponsavel(@RequestBody Responsavel responsavel){
        return this.responsavelService.inserirOuAtualizarResponsavel(responsavel);
    }

    @PutMapping("/responsaveis/{id}")
    public Responsavel atualizarResponsavel(@RequestBody Responsavel responsavel){
        return this.responsavelService.inserirOuAtualizarResponsavel(responsavel);
    }

    @DeleteMapping("/responsaveis/{id}")
    public void apagarResponsavel(@PathVariable("id") Long id) {
        this.responsavelService.apagarResponsavel(id);
    }
}
