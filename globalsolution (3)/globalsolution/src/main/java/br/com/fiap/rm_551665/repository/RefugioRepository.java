package br.com.fiap.rm_551665.globalsolution.repository;

import br.com.fiap.rm_551665.globalsolution.model.Refugio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RefugioRepository extends JpaRepository<Refugio, Long> {
}
