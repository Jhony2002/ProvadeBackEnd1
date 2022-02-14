package com.cadastrodemusicas.cadastrodemusicas.Repository;

import com.cadastrodemusicas.cadastrodemusicas.Model.Musica;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioDeMusicas extends MongoRepository<Musica,String> {
    
}
