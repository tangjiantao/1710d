package com.liqian.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liqian.movie.domain.Movie;
import com.liqian.movie.service.MovieService;
import com.liqian.movie.vo.MovieVO;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;
	
	
	
	@RequestMapping("list")
	public String getMoveList(Model model,MovieVO vo) {
		List<Movie> movies=service.selects(vo);
		model.addAttribute("movies", movies);
		model.addAttribute("vo", vo);
		return "list";
	}
}
