package com.appspot.controller;

// generator:imports

import com.appspot.model.entity.Movie;
import com.appspot.model.search.MovieSearchMap;
import com.appspot.model.service.MovieService;
import com.appspot.model.service.MovieServiceImpl;
import com.framework.util.pagination.manager.PagingLookupManagerException;
import com.framework.util.search.EntitySearchMap;
import com.framework.util.struts.StrutsController;
import com.framework.util.repository.RepositoryException;
import com.framework.util.search.SearchAware;
import com.framework.util.validator.ValidatorException;
import com.opensymphony.xwork2.ModelDriven;

public class MovieController extends StrutsController 
        implements ModelDriven<Movie>, SearchAware {
    
    // generator:attributes

    private MovieService movieService;
    private Movie movie = new Movie();
    private Integer movieId;

    // Actions =================================================================
    // generator:actions
    
    public String index() {
        try {
            paginatedList = paginateListFactory.getPaginatedListFromRequest(request);
            paginatedList.setPageSize(Integer.parseInt(getText("table.pagesize")));

            if (isSearch()) {
                paginatedList = pagingManager.getSearchRecordsPage(searchParams, paginatedList);
            } else {
                paginatedList = pagingManager.getAllRecordsPage(paginatedList);
            }
        } catch (PagingLookupManagerException ex) {
            errorHandler(ex);
        }
        
        statusHandler();
        return SUCCESS;
    }

    public String edit() {
        try {
        	// generator:loaders

        	
            if (isSave()) {
                getMovieService().save(movie);
                return SUCCESS_SAVE;
            } else {
                movie = getMovieService().findById(movieId);
                if (movie == null) {
                    return NOT_FOUND;
                }
            }
        } catch (RepositoryException ex) {
            errorHandler(ex);
        } catch (ValidatorException ex) {
            errorHandler(ex);
        }

        return SUCCESS;
    }

    public String add() {
        try {
        	// generator:loaders

        	
            if (isSave()) {
                getMovieService().save(movie);
                return SUCCESS_SAVE;
            }
        } catch (RepositoryException ex) {
            errorHandler(ex);
        } catch (ValidatorException ex) {
            errorHandler(ex);
        }

        return SUCCESS;
    }

    public void delete() {
        try {
            getMovieService().delete(movieId);
        } catch (RepositoryException ex) {
            errorHandler(ex);
        }
    }

    // Implemented interface methods ===========================================

    public Movie getModel() {
        return movie;
    }

    public EntitySearchMap getEntitySearchMap() {
        return new MovieSearchMap();
    }

    // Getters and Setters =====================================================
    // generator:accessors

    
    public MovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
