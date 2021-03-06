package br.com.bandtec.provacontinuada2.repositorio;

import br.com.bandtec.provacontinuada2.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador , Integer>{

    List<Lutador> findByVivoTrue();

    List<Lutador> findByVivoFalse();
}
