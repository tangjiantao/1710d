package com.liqian.movie.service;




import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liqian.movie.domain.Movie;

@RunWith(SpringJUnit4ClassRunner.class)  //开启spring
@ContextConfiguration(locations = "classpath:spring-beans.xml")//查询spring核心配置文件的位置
public class MovieServiceImplTest {
	@Autowired
	private MovieService service;

	//测试
	@Test
	public void testSelects() {
		/*
		 * List<Movie> selects = service.selects();
		 * 
		 * System.out.println(selects);
		 */
	}

}
