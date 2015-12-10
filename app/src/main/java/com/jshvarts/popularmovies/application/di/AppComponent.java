package com.jshvarts.popularmovies.application.di;

import com.jshvarts.popularmovies.MovieDetailFragment;
import com.jshvarts.popularmovies.MovieListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Dagger component which lists all injection points of the app. Any class that
 * injects an object via Dagger must have a corresponding inject() method here.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MovieListFragment fragment);
    void inject(MovieDetailFragment fragment);
}
