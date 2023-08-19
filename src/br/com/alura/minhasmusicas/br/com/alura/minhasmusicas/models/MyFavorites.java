package br.com.alura.minhasmusicas.br.com.alura.minhasmusicas.models;

public class MyFavorites {
    public void AddToPlaylist(Audio audio){
        if(audio.getRating() >= 9){
            System.out.println(audio.getTitle() + " É considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitle() + " Também e um dos que todo mundo está curtindo");
        }
    }
}
