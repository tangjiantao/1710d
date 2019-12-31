package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Condition;
import com.bw.bean.House;
import com.bw.bean.Owner;
import com.bw.dao.HouDao;
import com.bw.service.HouService;

@Service("service")
public class HouServiceImpl implements HouService{
	@Autowired
	private HouDao dao;

	@Override
	public List<House> list(Condition con) {
		// TODO Auto-generated method stub
		return dao.list(con);
	}

	@Override
	public List<Owner> ownerAll() {
		// TODO Auto-generated method stub
		return dao.ownerAll();
	}

	@Override
	public void add(House hou) {
		int i=dao.add(hou);
		if (i>0) {
			i=dao.addHO(hou.getH_id(),hou.getOids());
		}
	}

	@Override
	public House selectOne(Integer h_id) {
		// TODO Auto-generated method stub
		return dao.selectOne(h_id);
	}

	@Override
	public void update(House hou) {
		int i=dao.update(hou);
		if (i>0) {
			i=dao.delHO(hou.getH_id(),hou.getOids());
			if (i>0) {
				i=dao.addHO(hou.getH_id(), hou.getOids());
			}
		}
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return dao.login(username,password)>0;
	}
}
