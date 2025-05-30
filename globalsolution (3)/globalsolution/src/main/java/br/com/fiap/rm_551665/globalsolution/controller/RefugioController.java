package br.com.fiap.rm_551665.globalsolution.controller;

import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioRequestCreate;
import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioRequestUpdate;
import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioResponse;
import br.com.fiap.rm_551665.globalsolution.service.RefugioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Refugio")
public class RefugioController {

    @Autowired
    private RefugioService service;

    @PostMapping
    public ResponseEntity<RefugioResponse> create(@RequestBody RefugioRequestCreate dto){
        return ResponseEntity.status(201).body(
                new RefugioResponse().toDto(service.createRefugio(dto))
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        boolean result = service.deleteRefugio(id);
        if(result){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<RefugioResponse> update(@RequestBody RefugioRequestUpdate dto, @PathVariable Long id){
        return service.updateRefugio(id, dto)
                .map(a -> new RefugioResponse().toDto(a))
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RefugioResponse> findById(@PathVariable Long id){
        return service.getRefugioById(id)
                .map(a -> new RefugioResponse().toDto(a))
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<RefugioResponse>> findAll(){
        return ResponseEntity.ok(service.getAll()
                .stream()
                .map(a -> new RefugioResponse().toDto(a))
                .toList());
    }

}
