package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class ManagerPosterTest {

    @Test
    public void shouldGet10LastMovies() {
        Poster bladshot = new Poster(101, "Bladshot", "thriller");
        Poster vpered = new Poster(202, "Vpered", "cartoon");
        Poster otelBelgrad = new Poster(303, "OtelBelgrad", "comedy");
        Poster dzentlmeni = new Poster(404, "Dzentlmeni", "thriller");
        Poster chelovek = new Poster(505, "ChelovekNevidimka", "horrors");
        Poster trolli = new Poster(606,  "TrolliMirovoiTur", "cartoon");
        Poster nomerOdin = new Poster(707,  "NomerOdin", "comedy");
        Poster chelovekPauk = new Poster(808, "ChelovekPauk", "thriller");
        Poster zveropoi = new Poster(909,  "Zveropoi", "cartoon");
        Poster lolita = new Poster(111,  "Lolita", "drama");

        ManagerPoster manager = new ManagerPoster(10);
        manager.addMovies(bladshot);
        manager.addMovies(vpered);
        manager.addMovies(otelBelgrad);
        manager.addMovies(dzentlmeni);
        manager.addMovies(chelovek);
        manager.addMovies(trolli);
        manager.addMovies(nomerOdin);
        manager.addMovies(chelovekPauk);
        manager.addMovies(zveropoi);
        manager.addMovies(lolita);

        Poster[] expected = { lolita, zveropoi, chelovekPauk, nomerOdin, trolli, chelovek, dzentlmeni, otelBelgrad, vpered, bladshot};
        Poster[] actual = manager.getLastMovies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGet3lastMovies() {
        Poster chelovekPauk = new Poster(808, "ChelovekPauk", "thriller");
        Poster zveropoi = new Poster(909,  "Zveropoi", "cartoon");
        Poster lolita = new Poster(111,  "Lolita", "drama");

        ManagerPoster manager = new ManagerPoster();
        manager.addMovies(chelovekPauk);
        manager.addMovies(zveropoi);
        manager.addMovies(lolita);

        Poster[] expected = { lolita, zveropoi, chelovekPauk};
        Poster[] actual = manager.getLastMovies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetLimitMovies() {
        Poster bladshot = new Poster(101, "Bladshot", "thriller");
        Poster vpered = new Poster(202, "Vpered", "cartoon");
        Poster otelBelgrad = new Poster(303, "OtelBelgrad", "comedy");
        Poster dzentlmeni = new Poster(404, "Dzentlmeni", "thriller");
        Poster chelovek = new Poster(505, "ChelovekNevidimka", "horrors");
        Poster trolli = new Poster(606,  "TrolliMirovoiTur", "cartoon");
        Poster nomerOdin = new Poster(707,  "NomerOdin", "comedy");
        Poster chelovekPauk = new Poster(808, "ChelovekPauk", "thriller");
        Poster zveropoi = new Poster(909,  "Zveropoi", "cartoon");
        Poster lolita = new Poster(111,  "Lolita", "drama");
        Poster kingKong = new Poster(112, "KingKong", "thriller");

        ManagerPoster manager = new ManagerPoster(10);
        manager.addMovies(bladshot);
        manager.addMovies(vpered);
        manager.addMovies(otelBelgrad);
        manager.addMovies(dzentlmeni);
        manager.addMovies(chelovek);
        manager.addMovies(trolli);
        manager.addMovies(nomerOdin);
        manager.addMovies(chelovekPauk);
        manager.addMovies(zveropoi);
        manager.addMovies(lolita);
        manager.addMovies(kingKong);

        Poster[] expected = { kingKong, lolita, zveropoi, chelovekPauk, nomerOdin, trolli, chelovek, dzentlmeni, otelBelgrad, vpered};
        Poster[] actual = manager.getLastMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet0Movies() {
        Poster zveropoi = new Poster(909,  "Zveropoi", "cartoon");
        Poster lolita = new Poster(111,  "Lolita", "drama");

        ManagerPoster manager = new ManagerPoster(1);
        manager.addMovies(zveropoi);
        manager.addMovies(lolita);

        Poster[] expected = { lolita };
        Poster[] actual = manager.getLastMovies();

        assertArrayEquals(expected, actual);
    }
}