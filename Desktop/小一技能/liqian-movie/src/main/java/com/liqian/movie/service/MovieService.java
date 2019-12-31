package com.liqian.movie.service;

import java.util.List;

import com.liqian.movie.domain.Movie;
import com.liqian.movie.vo.MovieVO;

public interface MovieService {
	
	public List<Movie> selects(MovieVO vo);

}
