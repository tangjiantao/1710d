package com.bw.service;

import java.util.List;

import com.bw.bean.Condition;
import com.bw.bean.House;
import com.bw.bean.Owner;

public interface HouService {

	List<House> list(Condition con);

	List<Owner> ownerAll();

	void add(House hou);

	House selectOne(Integer h_id);

	void update(House hou);

	boolean login(String username, String password);

}
