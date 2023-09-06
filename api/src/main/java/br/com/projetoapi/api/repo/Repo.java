package br.com.projetoapi.api.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoapi.api.model.Pessoa;

@Repository
public interface Repo extends CrudRepository<Pessoa, Integer>{
    
    List<Pessoa> findAll();
    Pessoa findByCodigo(int codigo);
}
