package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.br.com.alura.minhasmusicas.models.Music;
import br.com.alura.minhasmusicas.br.com.alura.minhasmusicas.models.MyFavorites;
import br.com.alura.minhasmusicas.br.com.alura.minhasmusicas.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Way Down We Go");
        myMusic.setArtist("Kaleo");
        myMusic.setAlbum("Way Down We GoWay Down We Go");
        myMusic.setDuration(3.56);
        myMusic.setGender("Rock");

        for(int i = 0; i < 2000; i++){
            myMusic.totalReproduction();
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Hipsters Ponto Tech");
        myPodcast.setDuration(30.40);
        myPodcast.setDescription("Falando sobre desenvolvimento Back-End");
        myPodcast.setHost("Alura");

        for(int i = 0; i < 1000; i++){
            myPodcast.totalReproduction();
            myPodcast.like();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.AddToPlaylist(myMusic);
        myFavorites.AddToPlaylist(myPodcast);
    }
}