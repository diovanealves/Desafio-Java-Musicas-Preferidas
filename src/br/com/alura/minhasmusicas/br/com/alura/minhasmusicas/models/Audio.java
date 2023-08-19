package br.com.alura.minhasmusicas.br.com.alura.minhasmusicas.models;

public class Audio {
    private String title;
    private double duration;
    private int totalReproduction;
    private int totalLike;
    private int rating;

    public void like(){
        this.totalLike++;
    }

    public void totalReproduction(){
        this.totalReproduction++;
    }

    public void rating(){
        this.rating = totalReproduction / totalLike;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double isDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getTotalReproduction() {
        return totalReproduction;
    }

    public int getTotalLike() {
        return totalLike;
    }

    public int getRating() {
        return rating;
    }
}
