package com.appspot.model.service;

import com.appspot.model.repository.MovieRepository;
import com.appspot.model.repository.MovieRepositoryHibernate;
import com.appspot.model.entity.Movie;
import com.framework.util.repository.RepositoryException;
import com.framework.util.validator.Validator;
import com.framework.util.validator.ValidatorException;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;
    private Validator movieValidator;

    public MovieServiceImpl() {}

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    // Implemented interface methods ===========================================

    public void save(Movie movie) throws RepositoryException, ValidatorException {
        getMovieValidator().validate(movie);
        getMovieRepository().save(movie);
    }

    public void delete(Integer id) throws RepositoryException {
        Movie movie = getMovieRepository().findById(id);
        getMovieRepository().delete(movie);
    }

    public List<Movie> findAll() throws RepositoryException {
        return getMovieRepository().findAll();
    }

    public List<Movie> findAll(String orderBy, String orderType) throws RepositoryException {
        return getMovieRepository().findAll(orderBy, orderType);
    }

    public Movie findById(Integer id) throws RepositoryException {
        return getMovieRepository().findById(id);
    }
    
    public List<Movie> findAllByExample(Movie movie) throws RepositoryException {
        return getMovieRepository().findAllByExample(movie);
    }

    public List<Movie> findAllWithPagination(int min, int max, String orderBy, String orderType) throws RepositoryException {
        return getMovieRepository().findAllWithPagination(min, max, orderBy, orderType);
    }

    public Integer count() throws RepositoryException {
        return getMovieRepository().count();
    }

    // Getters and Setters =====================================================

    public MovieRepository getMovieRepository() {
        if (movieRepository == null) {
            setMovieRepository(new MovieRepositoryHibernate());
        }

        return movieRepository;
    }

    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Validator getMovieValidator() {
        if (movieValidator == null) {
            setMovieValidator(new Validator<Movie>());
        }
        return movieValidator;
    }

    public void setMovieValidator(Validator movieValidator) {
        this.movieValidator = movieValidator;
    }
}
