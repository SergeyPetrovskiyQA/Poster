package ru.netology.poster;

public class PosterManeger {
    private String[] films = new String[0];
    private int limit;

    public PosterManeger() {
        this.limit = 10;

    }

    public PosterManeger(int limit) {
        this.limit = limit;
    }


    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = 10;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}