package ru.netology.manager;

import ru.netology.domain.Poster;

public class ManagerPoster {
    private Poster[] movies = new Poster[0];
    private int movieLimit = 10;

    public ManagerPoster() {
    }

    public ManagerPoster(int movieLimit) {
        this.movieLimit = movieLimit;
    }

    public void addMovies(Poster movie) {
        int length = movies.length + 1;
        Poster[] tmp = new Poster[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Poster[] getLastMovies() {
        int resultLength;
        if (movies.length > movieLimit) {
            resultLength = movieLimit;
        } else {
            resultLength = movies.length;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
