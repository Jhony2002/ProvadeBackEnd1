package com.cadastrodemusicas.cadastrodemusicas.Service;


import java.util.List;


import com.cadastrodemusicas.cadastrodemusicas.Model.Musica;

public interface ServicoDeMusicas {
  public List<Musica> MostrarTodos(); 
  public Musica SalvarMusica(Musica m);
  public List <Musica>DeletarMusica(String m); 
  public Musica PegarPorId(String id);
  public Musica Atualizar(String id,String artista);
}
