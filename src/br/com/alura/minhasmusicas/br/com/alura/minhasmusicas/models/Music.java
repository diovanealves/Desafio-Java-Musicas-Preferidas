package br.com.alura.minhasmusicas.br.com.alura.minhasmusicas.models;

public class Music extends Audio {
    private String album;
    private String artist;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getRating() {
        if(this.getTotalReproduction() > 600){
            return 10;
        } else {
            return 7;
        }
    }
}
