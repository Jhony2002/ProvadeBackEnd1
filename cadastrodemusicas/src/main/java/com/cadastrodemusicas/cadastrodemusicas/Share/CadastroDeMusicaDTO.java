package com.cadastrodemusicas.cadastrodemusicas.Share;

import javax.validation.constraints.NotBlank;

import com.cadastrodemusicas.cadastrodemusicas.Model.Musica;


public class CadastroDeMusicaDTO {
     private String id;
    @NotBlank(message = "A música precisa ter um nome")
    private String titulo;
    @NotBlank(message = "A música precisa ter um artista")
    private String artista;
    private String album;
    private String genero;
    private int anoDeLancamento;
    private String compositor;
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setArtista(String artista){
        this.artista=artista;
    }
    public String getArtista(){
        return artista;
    }
    public String getCompositor(){
        return compositor;
    }

    public void setCompositor(String compositor){
        this.compositor=compositor;
    }

    public void setAnoDeLancamento(int anodeLancamento){
      this.anoDeLancamento=anodeLancamento;
    }
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setAlbum(String album){
      this.album=album;
   }
   public String getAlbum(){
       return album;
   }
   
   public CadastroDeMusicaDTO(String id,String titulo,String artista,String album,String genero, int anoDeLancamento,String compositor){
       this.id=id;
       this.titulo=titulo;
       this.artista=artista;
       this.album=album;
       this.genero=genero;
       this.anoDeLancamento=anoDeLancamento;
       this.compositor=compositor;
       
    }
   public static CadastroDeMusicaDTO from(Musica m ){
       return new CadastroDeMusicaDTO(m.getId(),m.getTitulo(),m.getArtista(),m.getAlbum(),m.getGenero(),m.getAnoDeLancamento(),m.getCompositor());
   }


}    
