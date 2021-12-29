package br.edu.ifpb.vadrilischildcare.service;

import br.edu.ifpb.vadrilischildcare.repositories.UsuarioRepository;
import br.edu.ifpb.vadrilischildcare.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service


public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuario getUsuarioPorId(Long idUsuario) {
        return this.usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Transactional
    public Usuario inserirUsuario(Usuario usuario) {
        Usuario usuarioInserido = this.usuarioRepository.save(usuario);
       /* if (Period.between(usuario.getDataAniversario().toLocalDate(), LocalDateTime.now().toLocalDate()).getYears() < 18) {
            throw new RuntimeException("Menor de idade não permitido");
        }*/
        return usuarioInserido;
    }

    public void apagarUsuario(Long id) {
        this.usuarioRepository.deleteById(id);
    }

    public List<Usuario> pesquisarPorCep(String cep){
        return this.usuarioRepository.findByCep(cep);
    }
}

