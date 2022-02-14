package com.cadastrodemusicas.cadastrodemusicas.Model;




import com.cadastrodemusicas.cadastrodemusicas.Share.CadastroDeMusicaDTO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("musicas")
public class Musica {
   @Id
   private String id;
   private String titulo;
   private String artista;
   private String album;
   private String genero;
   private int anoDeLancamento;
   private String compositor;

public Musica(String titulo, String artista,String album, String genero, int anoDeLancamento,String compositor){
         this.titulo=titulo;
         this.artista=artista;
         this.album=album;
         this.genero=genero;
         this.anoDeLancamento=anoDeLancamento;
         this.compositor=compositor;
}
public String getId(){
    return id;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getArtista() {
    return artista;
}
public void setArtista(String artista) {
    this.artista = artista;
}
public String getAlbum() {
    return album;
}
public void setAlbum(String album) {
    this.album = album;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public int getAnoDeLancamento() {
    return anoDeLancamento;
}
public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
}
public String getCompositor() {
    return compositor;
}
public void setCompositor(String compositor) {
    this.compositor = compositor;
}
public static Musica from(CadastroDeMusicaDTO dto){
    return new Musica(dto.getTitulo(),dto.getArtista(),dto.getAlbum(),dto.getGenero(),dto.getAnoDeLancamento(),dto.getCompositor());
}
}
