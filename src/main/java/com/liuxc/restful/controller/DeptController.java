package com.liuxc.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuxc.restful.service.IDeptService;

@RestController
@RequestMapping("/dept")
public class DeptController extends AbstractBaseController {
	@Autowired
	private IDeptService deptService;

	@RequestMapping("/getList")
	public Object getList() {

		return deptService.getList();
	}

}
