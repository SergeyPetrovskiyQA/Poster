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

        String [] expected = {"Films 1","Films 2","Films 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testFindLast(){
        PosterManeger manager = new PosterManeger();
        manager.addFilms("Films 1");
        manager.addFilms("Films 2");
        manager.addFilms("Films 3");

        String [] expected = {"Films 3","Films 2","Films 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }
}
