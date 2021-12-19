package br.edu.ifpb.vadrilischildcare.controller;

import br.edu.ifpb.vadrilischildcare.model.Crianca;
import br.edu.ifpb.vadrilischildcare.service.CriancaService;
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

public class CriancaController {
    @Autowired
    private CriancaService criancaService;

    @GetMapping("/criancas")
    public List<Crianca> getCriancas() {
        return this.criancaService.getCriancas();
    }

    @GetMapping("/criancas/{id}")
    public Crianca getCriancaPorId(@PathVariable("id") Long idCrianca) {
        return this.criancaService.getCriancaPorId(idCrianca);
    }

    @PostMapping("/criancas")
    public Crianca inserirCrianca(@RequestBody Crianca crianca){
        return this.criancaService.inserirOuAtualizarCrianca(crianca);
    }

    @PutMapping("/criancas/{id}")
    public Crianca atualizarCrianca(@RequestBody Crianca crianca){
        return this.criancaService.inserirOuAtualizarCrianca(crianca);
    }

    @DeleteMapping("/criancas/{id}")
    public void apagarCrianca(@PathVariable("id") Long id) {
        this.criancaService.apagarCrianca(id);
    }
}
