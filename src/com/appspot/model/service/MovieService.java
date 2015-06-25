package com.appspot.model.service;

import com.appspot.model.entity.Movie;
import com.framework.util.repository.RepositoryException;
import com.framework.util.validator.ValidatorException;
import java.util.List;

public interface MovieService {
    public void save(Movie movie) throws RepositoryException, ValidatorException;
    public void delete(Integer id) throws RepositoryException;
    public List<Movie> findAll() throws RepositoryException;
    public List<Movie> findAll(String orderBy, String orderType) throws RepositoryException;
    public Movie findById(Integer id) throws RepositoryException;

    public List<Movie> findAllByExample(Movie movie) throws RepositoryException;
    public List<Movie> findAllWithPagination(int min, int max, String orderBy, String orderType) throws RepositoryException;

    public Integer count() throws RepositoryException;
}
