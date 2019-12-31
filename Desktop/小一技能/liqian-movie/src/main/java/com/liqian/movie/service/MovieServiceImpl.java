package com.liqian.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liqian.movie.dao.MovieMapper;
import com.liqian.movie.domain.Movie;
import com.liqian.movie.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieMapper mapper;

	@Override
	public List<Movie> selects(MovieVO vo) {
		// TODO Auto-generated method stub
		
		return mapper.selects(vo);
	}
	
	
	
}
