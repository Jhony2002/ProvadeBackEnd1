package com.cadastrodemusicas.cadastrodemusicas.Service;


import java.util.List;
import java.util.Optional;

import com.cadastrodemusicas.cadastrodemusicas.Model.Musica;
import com.cadastrodemusicas.cadastrodemusicas.Repository.RepositorioDeMusicas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServicoDeMusicasImpl implements ServicoDeMusicas {
    @Autowired
    private RepositorioDeMusicas repositorio;
    
    @Override
    public List<Musica> MostrarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Musica SalvarMusica(Musica m) {
        return repositorio.save(m);
        
    }

    @Override
    public List<Musica> DeletarMusica(String id) {
        repositorio.deleteById(id);
        return repositorio.findAll();
        
    }

    @Override
    public Musica PegarPorId(String id) {
        var m=repositorio.findById(id);
        Musica n=m.get();
        return n; 
    }

    @Override
    public Musica Atualizar(String id, String artista) {
        Optional<Musica>m=repositorio.findById(id);
        Musica n=m.get();
        n.setArtista(artista);
        repositorio.save(n);
        return n;
    }
    
}
