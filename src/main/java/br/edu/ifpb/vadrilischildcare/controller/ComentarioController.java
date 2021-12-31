package br.edu.ifpb.vadrilischildcare.controller;


import br.edu.ifpb.vadrilischildcare.model.Comentario;
import br.edu.ifpb.vadrilischildcare.service.ComentarioService;
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

public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/comentarios")
    public List<Comentario> getComentario() {
        return this.comentarioService.getComentario();
    }

    @GetMapping("/comentarios/{id}")
    public Comentario getComentarioPorId(@PathVariable("id") Long idComentario) {
        return this.comentarioService.getComentarioPorId(idComentario);
    }

    @PostMapping("/comentarios")
    public Comentario inserirComentario(@RequestBody Comentario comentario){
        return this.comentarioService.inserirComentario(comentario);
    }

    @PutMapping("/comentarios/{id}")
    public Comentario atualizarComentario(@RequestBody Comentario comentario){
        return this.comentarioService.atualizarComentario(comentario);
    }

    @DeleteMapping("/comentarios/{id}")
    public void apagarComentario(@PathVariable("id") Long id) {
        this.comentarioService.removerComentario(id);
    }
}
