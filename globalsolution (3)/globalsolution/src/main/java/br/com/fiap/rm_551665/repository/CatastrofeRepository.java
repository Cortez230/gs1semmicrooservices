package br.com.fiap.rm_551665.globalsolution.repository;

import br.com.fiap.rm_551665.globalsolution.model.Catastrofe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CatastrofeRepository extends JpaRepository<Catastrofe, Long> {
}
