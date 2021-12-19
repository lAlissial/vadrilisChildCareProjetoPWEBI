package br.edu.ifpb.vadrilischildcare.repositories;

import br.edu.ifpb.vadrilischildcare.model.Responsavel;
import br.edu.ifpb.vadrilischildcare.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long>  {

}
