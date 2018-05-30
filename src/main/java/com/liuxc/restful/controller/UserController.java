package com.liuxc.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuxc.restful.service.IDeptService;
import com.liuxc.restful.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractBaseController {
	@Autowired
	private IUserService userService;
	@Autowired
	private IDeptService deptrService;
	
	@RequestMapping("/getList")
	public Object getList() {
		deptrService.getList();
		return userService.getList();
	}

}
