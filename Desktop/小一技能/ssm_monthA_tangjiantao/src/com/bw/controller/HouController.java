package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.bean.Condition;
import com.bw.bean.House;
import com.bw.service.HouService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class HouController {
	@Autowired
	private HouService service;
	
	@RequestMapping("list.do")
	public String list(Model m,Condition con) {
		if (con.getPageNum()==null) {
			con.setPageNum(1);
		}
		PageHelper.startPage(con.getPageNum(), 3);
		List<House> list=service.list(con);
		PageInfo<House> page=new PageInfo<House>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("list", list);
		m.addAttribute("con", con);
		return "list";
		
	}
	
	@ResponseBody
	@RequestMapping("ownerAll.do")
	public Object ownerAll() {
		return service.ownerAll();
		
	}
	
	@RequestMapping("add.do")
	public String add(House hou,HttpServletRequest request,MultipartFile myFile) throws IllegalStateException, IOException {
		String realName = myFile.getOriginalFilename();
		
		hou.setH_pic(realName);
		
		String endName = realName.substring(realName.lastIndexOf("."));
		
		String startName = UUID.randomUUID().toString();
		
		String realPath = request.getServletContext().getRealPath("/load/");
		
		File file=new File(realPath+startName+endName);
		
		myFile.transferTo(file);
		
		hou.setH_pic(startName+endName);
		
		service.add(hou);
		
		return "redirect:list.do";
		
	}
	
	@ResponseBody
	@RequestMapping("selectOne.do")
	public Object selectOne(Integer h_id) {
		return service.selectOne(h_id);
		
	}
	
	@RequestMapping("update.do")
	public String update(House hou,HttpServletRequest request,MultipartFile myFile) throws IllegalStateException, IOException {
		String realName = myFile.getOriginalFilename();
		
		hou.setH_pic(realName);
		
		String endName = realName.substring(realName.lastIndexOf("."));
		
		String startName = UUID.randomUUID().toString();
		
		String realPath = request.getServletContext().getRealPath("/load/");
		
		File file=new File(realPath+startName+endName);
		
		myFile.transferTo(file);
		
		hou.setH_pic(startName+endName);
		
		service.update(hou);
		
		return "redirect:list.do";
		
	}
	
	@RequestMapping("login.do")
	public String login(String username,String password,Model m,HttpSession session) {
		boolean flag=service.login(username,password);
		
		String path="";
		if (flag) {
			session.setAttribute("username", username);
			return "redirect:list.do";
		}else {
			m.addAttribute("msg", "密码或账号错误请重新登录");
			path="login";
		}
		
		
		return path;
		
	}
}
