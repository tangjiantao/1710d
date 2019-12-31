package com.liqian.movie.dao;

import java.util.List;

import com.liqian.movie.domain.Movie;
import com.liqian.movie.vo.MovieVO;

public interface MovieMapper {

	List<Movie> selects(MovieVO vo);

}
