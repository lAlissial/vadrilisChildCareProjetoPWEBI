package br.edu.ifpb.vadrilischildcare.controller;

import br.edu.ifpb.vadrilischildcare.model.Avaliacao;
import br.edu.ifpb.vadrilischildcare.service.AvaliacaoService;
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

public class AvaliacaoController {
    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping("/avaliacoes")
    public List<Avaliacao> getAvaliacao() {
        return this.avaliacaoService.getAvaliacoes();
    }

    @GetMapping("/avaliacoes/{id}")
    public Avaliacao getAvaliacaoPorId(@PathVariable("id") Long idAvaliacao) {
        return this.avaliacaoService.getAvaliacaoPorId(idAvaliacao);
    }

    @PostMapping("/avaliacoes")
    public Avaliacao inserirAvaliacao(@RequestBody Avaliacao avaliacao){
        return this.avaliacaoService.inserirOuAtualizarAvaliacao(avaliacao);
    }

    @PutMapping("/avaliacoes/{id}")
    public Avaliacao atualizarAvaliacao(@RequestBody Avaliacao avaliacao){
        return this.avaliacaoService.inserirOuAtualizarAvaliacao(avaliacao);
    }

    @DeleteMapping("/avaliacoes/{id}")
    public void apagarAvaliacao(@PathVariable("id") Long id) {
        this.avaliacaoService.apagarAvaliacao(id);
    }
}
