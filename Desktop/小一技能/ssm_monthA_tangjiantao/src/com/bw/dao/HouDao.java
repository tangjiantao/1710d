package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Condition;
import com.bw.bean.House;
import com.bw.bean.Owner;

public interface HouDao {

	List<House> list(Condition con);
	
	List<Owner> findHid(Integer hid);

	List<Owner> ownerAll();

	int add(House hou);

	int addHO(@Param("h_id")Integer h_id, @Param("oids")int[] oids);

	House selectOne(Integer h_id);

	int update(House hou);

	int delHO(@Param("h_id")Integer h_id, @Param("oids")int[] oids);

	Integer login(@Param("username")String username, @Param("password")String password);

}
