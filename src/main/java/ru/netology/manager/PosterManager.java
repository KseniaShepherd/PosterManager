package ru.netology.manager;

import ru.netology.model.Film;

public class PosterManager {

    private Film[] films = new Film[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int filmsLimit) {

        if (filmsLimit >= 10) {
            this.limit = 10;
            return;
        }
        this.limit = filmsLimit;
    }


    public Film[] getFilms() {
        return films;
    }

    public int getLimit() {
        return limit;
    }

    public void add(Film film) {
        int lenght = films.length + 1;
        Film[] tmp = new Film[lenght];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = film;
        films = tmp;
    }


    public Film[] getAll() {
        int resultLength = getLimit();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

}
