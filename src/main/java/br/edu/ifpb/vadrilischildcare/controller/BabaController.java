package br.edu.ifpb.vadrilischildcare.controller;

import br.edu.ifpb.vadrilischildcare.model.Baba;
import br.edu.ifpb.vadrilischildcare.service.BabaService;
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

public class BabaController {
    @Autowired
    private BabaService babaService;

    @GetMapping("/babas")
    public List<Baba> getBaba() {
        return this.babaService.getBabas();
    }

    @GetMapping("/babas/{id}")
    public Baba getBabaPorId(@PathVariable("id") Long idBaba) {
        return this.babaService.getBabaPorId(idBaba);
    }

    @PostMapping("/babas")
    public Baba inserirBaba(@RequestBody Baba responsavel){
        return this.babaService.inserirOuAtualizarBaba(responsavel);
    }

    @PutMapping("/babas/{id}")
    public Baba atualizarBaba(@RequestBody Baba responsavel){
        return this.babaService.inserirOuAtualizarBaba(responsavel);
    }

    @DeleteMapping("/babas/{id}")
    public void apagarBaba(@PathVariable("id") Long id) {
        this.babaService.apagarBaba(id);
    }
}
