package br.com.fiap.rm_551665.globalsolution.service;

import br.com.fiap.rm_551665.globalsolution.dto.catastrofe.CatastrofeRequestCreate;
import br.com.fiap.rm_551665.globalsolution.dto.catastrofe.CatastrofeRequestUpdate;
import br.com.fiap.rm_551665.globalsolution.model.Catastrofe;
import br.com.fiap.rm_551665.globalsolution.repository.CatastrofeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CatastrofeService {

    @Autowired
    private CatastrofeRepository repository;

    public Catastrofe createCatastrofe(CatastrofeRequestCreate dto){
        return repository.save(dto.toModel());
    }

public Optional<Catastrofe> getCatastrofeById(Long id){
        return repository.findById(id);
    }

public List<Catastrofe> getAll(){
        return repository.findAll();
    }

public Optional<Catastrofe> updateCatastrofe(Long id, CatastrofeRequestUpdate dto){
        return repository.findById(id).map(e -> repository.save(dto.toModel(e)));
    }

public boolean deleteCatastrofe(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
