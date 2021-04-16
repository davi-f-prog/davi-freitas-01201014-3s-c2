package br.com.bandtec.provacontinuada2.controle;

import br.com.bandtec.provacontinuada2.dominio.Lutador;
import br.com.bandtec.provacontinuada2.repositorio.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;


    @PostMapping
    public ResponseEntity postLutador(@RequestBody @Valid Lutador novoLutador) {
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

        @GetMapping
    public ResponseEntity getLutador() {
        return ResponseEntity.status(200).body(repository.findAll());
    }

    @GetMapping("/contagem-vivos")
    public ResponseEntity getVivos() {
       return ResponseEntity.status(200).body(repository.findByVivoTrue());

    }
    @GetMapping("/mortos")
    public ResponseEntity getMortos() {
        return ResponseEntity.status(200).body(repository.findByVivoFalse());

    }
}
