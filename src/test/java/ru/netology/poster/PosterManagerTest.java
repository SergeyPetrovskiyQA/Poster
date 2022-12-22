package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void testAddFilms() {

        PosterManeger manager = new PosterManeger();
        manager.addFilms("Films 1");
        manager.addFilms("Films 2");
        manager.addFilms("Films 3");

        String[] expected = {"Films 1", "Films 2", "Films 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        PosterManeger manager = new PosterManeger();
        manager.addFilms("Films 1");
        manager.addFilms("Films 2");
        manager.addFilms("Films 3");

        String[] expected = {"Films 3", "Films 2", "Films 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindlastOverLimit() {
        PosterManeger manager = new PosterManeger();
        manager.addFilms("Films 1");
        manager.addFilms("Films 2");
        manager.addFilms("Films 3");
        manager.addFilms("Films 4");
        manager.addFilms("Films 5");
        manager.addFilms("Films 6");
        manager.addFilms("Films 7");
        manager.addFilms("Films 8");
        manager.addFilms("Films 9");
        manager.addFilms("Films 10");


        String[] expected = {"Films 10","Films 9","Films 8","Films 7","Films 6","Films 5","Films 4","Films 3", "Films 2", "Films 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGet() {
        PosterManeger manager = new PosterManeger(10);

        int expected = 10;
        int actual = manager.getLimit();
        Assertions.assertEquals(expected, actual);
    }
}
