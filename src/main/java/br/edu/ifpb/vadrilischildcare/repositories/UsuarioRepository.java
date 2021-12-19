package br.edu.ifpb.vadrilischildcare.repositories;

import br.edu.ifpb.vadrilischildcare.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public List<Usuario> findByCep(String cep);

    @Query("SELECT u FROM Usuario u WHERE u.complemento LIKE '%Apto%' OR u.complemento LIKE '%Apartamento%'OR u.complemento LIKE '%apartamento%' OR u.complemento LIKE '%apto%'")
    public List<Usuario> getUsuariosMoramApto(String complemento);

}

