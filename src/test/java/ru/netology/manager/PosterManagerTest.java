package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.model.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {

    @Test
    void shouldAddFilm() {
        PosterManager posterManager = new PosterManager();
        Film film = new Film(1, 1, "first film", "drama", "12/12/2021");
        posterManager.add(film);

        Film[] expected = new Film[]{film};

        assertArrayEquals(expected, posterManager.getFilms());
    }

    @Test
    void shouldAddTenFilms() {
        PosterManager posterManager = new PosterManager();

        Film firstFilm = new Film(1, 1, "first film", "drama", "12/12/2021");
        Film secondFilm = new Film(2, 2, "seecond film", "comedy", "13/12/2021");
        Film thirdFilm = new Film(3, 3, "third film", "drama", "13/12/2021");
        Film fourthFilm = new Film(4, 4, "fourth film", "drama", "13/12/2021");
        Film fifthFilm = new Film(5, 5, "fifth film", "comedy", "13/12/2021");
        Film sixthFilm = new Film(6, 6, "sixth film", "thriller", "13/12/2021");
        Film seventhFilm = new Film(7, 7, "seventh film", "drama", "13/12/2021");
        Film eighthFilm = new Film(8, 8, "eighth film", "thriller", "13/12/2021");
        Film ninthFilm = new Film(9, 9, "ninth film", "comedy", "13/12/2021");
        Film tenthFilm = new Film(10, 10, "tenth film", "thriller", "13/12/2021");

        posterManager.add(firstFilm);
        posterManager.add(secondFilm);
        posterManager.add(thirdFilm);
        posterManager.add(fourthFilm);
        posterManager.add(fifthFilm);
        posterManager.add(sixthFilm);
        posterManager.add(seventhFilm);
        posterManager.add(eighthFilm);
        posterManager.add(ninthFilm);
        posterManager.add(tenthFilm);

        Film[] expected = new Film[]{firstFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm,
                seventhFilm, eighthFilm, ninthFilm, tenthFilm};

        assertArrayEquals(expected, posterManager.getFilms());

    }


    @Test
    void shouldGetTenFilmsWhenManagerHaveTenFilms() {

        PosterManager posterManager = new PosterManager();

        Film firstFilm = new Film(1, 1, "first film", "drama", "12/12/2021");
        Film secondFilm = new Film(2, 2, "seecond film", "comedy", "13/12/2021");
        Film thirdFilm = new Film(3, 3, "third film", "drama", "13/12/2021");
        Film fourthFilm = new Film(4, 4, "fourth film", "drama", "13/12/2021");
        Film fifthFilm = new Film(5, 5, "fifth film", "comedy", "13/12/2021");
        Film sixthFilm = new Film(6, 6, "sixth film", "thriller", "13/12/2021");
        Film seventhFilm = new Film(7, 7, "seventh film", "drama", "13/12/2021");
        Film eighthFilm = new Film(8, 8, "eighth film", "thriller", "13/12/2021");
        Film ninthFilm = new Film(9, 9, "ninth film", "comedy", "13/12/2021");
        Film tenthFilm = new Film(10, 10, "tenth film", "thriller", "13/12/2021");
        posterManager.add(firstFilm);
        posterManager.add(secondFilm);
        posterManager.add(thirdFilm);
        posterManager.add(fourthFilm);
        posterManager.add(fifthFilm);
        posterManager.add(sixthFilm);
        posterManager.add(seventhFilm);
        posterManager.add(eighthFilm);
        posterManager.add(ninthFilm);
        posterManager.add(tenthFilm);
        Film[] actual = posterManager.getAll();

        Film[] expected = new Film[]{tenthFilm, ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm,
                fourthFilm, thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetTenFilmsWhenManagerHaveMoreThanTenFilms() {

        PosterManager posterManager = new PosterManager(11);

        Film firstFilm = new Film(1, 1, "first film", "drama", "12/12/2021");
        Film secondFilm = new Film(2, 2, "seecond film", "comedy", "13/12/2021");
        Film thirdFilm = new Film(3, 3, "third film", "drama", "13/12/2021");
        Film fourthFilm = new Film(4, 4, "fourth film", "drama", "13/12/2021");
        Film fifthFilm = new Film(5, 5, "fifth film", "comedy", "13/12/2021");
        Film sixthFilm = new Film(6, 6, "sixth film", "thriller", "13/12/2021");
        Film seventhFilm = new Film(7, 7, "seventh film", "drama", "13/12/2021");
        Film eighthFilm = new Film(8, 8, "eighth film", "thriller", "13/12/2021");
        Film ninthFilm = new Film(9, 9, "ninth film", "comedy", "13/12/2021");
        Film tenthFilm = new Film(10, 10, "tenth film", "thriller", "13/12/2021");
        Film eleventhFilm = new Film(11, 11, "eleventh film", "thriller", "13/12/2021");

        posterManager.add(firstFilm);
        posterManager.add(secondFilm);
        posterManager.add(thirdFilm);
        posterManager.add(fourthFilm);
        posterManager.add(fifthFilm);
        posterManager.add(sixthFilm);
        posterManager.add(seventhFilm);
        posterManager.add(eighthFilm);
        posterManager.add(ninthFilm);
        posterManager.add(tenthFilm);
        posterManager.add(eleventhFilm);

        Film[] actual = posterManager.getAll();

        Film[] expected = new Film[]{eleventhFilm, tenthFilm, ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm,
                fourthFilm, thirdFilm, secondFilm};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllFilmsWhenManagerHaveLessThanTenFilms() {

        PosterManager posterManager = new PosterManager(3);

        Film firstFilm = new Film(1, 1, "first film", "drama", "12/12/2021");
        Film secondFilm = new Film(2, 2, "seecond film", "comedy", "13/12/2021");
        Film thirdFilm = new Film(3, 3, "third film", "drama", "13/12/2021");


        posterManager.add(firstFilm);
        posterManager.add(secondFilm);
        posterManager.add(thirdFilm);


        Film[] actual = posterManager.getAll();

        Film[] expected = new Film[]{thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(expected, actual);
    }
}