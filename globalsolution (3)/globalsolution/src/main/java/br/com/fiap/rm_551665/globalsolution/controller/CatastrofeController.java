

package br.com.fiap.rm_551665.globalsolution.controller;

import br.com.fiap.rm_551665.globalsolution.dto.catastrofe.CatastrofeRequestCreate;
import br.com.fiap.rm_551665.globalsolution.dto.catastrofe.CatastrofeRequestUpdate;
import br.com.fiap.rm_551665.globalsolution.dto.catastrofe.CatastrofeResponse;
import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioRequestCreate;
import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioRequestUpdate;
import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioResponse;
import br.com.fiap.rm_551665.globalsolution.service.CatastrofeService;
import br.com.fiap.rm_551665.globalsolution.service.CatastrofeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Catastrofe")
public class CatastrofeController {

    @Autowired
    private CatastrofeService service;

    @PostMapping
    public ResponseEntity<CatastrofeResponse> create(@RequestBody CatastrofeRequestCreate dto){
        return ResponseEntity.status(201).body(
                new CatastrofeResponse().toDto(service.createCatastrofe(dto))
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        boolean result = service.deleteCatastrofe(id);
        if(result){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatastrofeResponse> update(@RequestBody CatastrofeRequestUpdate dto, @PathVariable Long id){
        return service.updateCatastrofe(id, dto)
                .map(e -> new CatastrofeResponse().toDto(e))
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatastrofeResponse> findById(@PathVariable Long id){
        return service.getCatastrofeById(id)
                .map(e -> new CatastrofeResponse().toDto(e))
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<CatastrofeResponse>> findAll(){
        return ResponseEntity.ok(service.getAll()
                .stream()
                .map(e -> new CatastrofeResponse().toDto(e))
                .toList());
    }

}
