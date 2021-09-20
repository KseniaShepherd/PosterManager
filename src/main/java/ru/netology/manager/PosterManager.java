package ru.netology.manager;

import ru.netology.model.Film;

public class PosterManager {

    private Film[] films;

    public Film[] getFilms() {
        return films;
    }

    public PosterManager() {
        films = new Film[10];
    }

    public PosterManager(int filmsLimit) {
        films = new Film[filmsLimit];
    }

    public void add(Film film) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                films[i] = film;
                return;
            }
        }
    }

    public Film[] getAll() {
        int  resultLength;
        if (films.length >= 10) {
            resultLength = 10;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

}
