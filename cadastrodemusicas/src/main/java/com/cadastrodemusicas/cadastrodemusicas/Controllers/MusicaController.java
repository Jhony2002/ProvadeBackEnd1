package com.cadastrodemusicas.cadastrodemusicas.Controllers;

import java.util.List;

import javax.validation.Valid;

import com.cadastrodemusicas.cadastrodemusicas.Model.Musica;
import com.cadastrodemusicas.cadastrodemusicas.Service.ServicoDeMusicas;
import com.cadastrodemusicas.cadastrodemusicas.Share.CadastroDeMusicaDTO;
import com.cadastrodemusicas.cadastrodemusicas.Share.MusicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cadastrodemusica")
public class MusicaController {
    @Autowired
    private ServicoDeMusicas servico;
   
    @PostMapping
    public ResponseEntity<CadastroDeMusicaDTO>Cadastrar(@RequestBody @Valid CadastroDeMusicaDTO dto){
        Musica p= Musica.from(dto);
        Musica c=servico.SalvarMusica(p);
        CadastroDeMusicaDTO musicaasalva = CadastroDeMusicaDTO.from(c);
        return new ResponseEntity<>(musicaasalva,HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Musica>>MostrarTodos(){
        return new ResponseEntity<>(servico.MostrarTodos(),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Musica>Apagar(@PathVariable String id){
        servico.DeletarMusica(id);
        return new ResponseEntity<>(HttpStatus.OK);
    
    }
    @GetMapping("/{id}")
    public ResponseEntity<MusicaDTO> pegarporid(@PathVariable String id){
     var m= servico.PegarPorId(id);
     var dto=MusicaDTO.from(m);
     return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @PutMapping("/{id}/{nome}")
    public ResponseEntity<MusicaDTO> atualizaMusica(@PathVariable String id,@PathVariable String nome){
        var m=servico.Atualizar(id,nome);
        MusicaDTO p=MusicaDTO.from(m);
        return new ResponseEntity<>(p,HttpStatus.ACCEPTED);
    }
}
