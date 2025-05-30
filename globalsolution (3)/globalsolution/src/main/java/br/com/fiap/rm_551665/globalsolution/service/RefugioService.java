package br.com.fiap.rm_551665.globalsolution.service;

import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioRequestCreate;
import br.com.fiap.rm_551665.globalsolution.dto.refugio.RefugioRequestUpdate;
import br.com.fiap.rm_551665.globalsolution.model.Refugio;
import br.com.fiap.rm_551665.globalsolution.repository.RefugioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class RefugioService {

    @Autowired
    private RefugioRepository repository;

    public Refugio createRefugio(RefugioRequestCreate dto){
        return repository.save(dto.toModel());
    }

public Optional<Refugio> getRefugioById(Long id){
        return repository.findById(id);
    }

public List<Refugio> getAll(){
        return repository.findAll();
    }

public Optional<Refugio> updateRefugio(Long id, RefugioRequestUpdate dto){
        return repository.findById(id).map(a -> repository.save(dto.toModel(a)));
    }

public boolean deleteRefugio(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
