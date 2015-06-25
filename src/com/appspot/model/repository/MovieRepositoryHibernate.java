package com.appspot.model.repository;

import com.appspot.model.entity.Movie;
import com.framework.util.hibernate.GenericRepositoryHibernate;

public class MovieRepositoryHibernate extends GenericRepositoryHibernate<Movie, Integer> implements MovieRepository {
    public MovieRepositoryHibernate() {
        super(Movie.class);
    }
}
