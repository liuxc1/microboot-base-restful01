package com.liuxc.restful.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liuxc.restful.dao.ISynthesizeMapper;
import com.liuxc.restful.datasource.DataSourceAnnotation;
import com.liuxc.restful.datasource.DataSourceKey;
import com.liuxc.restful.service.IDeptService;
import com.liuxc.restful.service.ISynthesizeService;
import com.liuxc.restful.service.IUserService;

@Service
public class SynthesizeServiceImpl implements ISynthesizeService {
	@Autowired
	private ISynthesizeMapper synthesizeDao;
	@Autowired
	private IDeptService  deptService;
	
	@Autowired
	private IUserService userService;

	@Override
	@Transactional(readOnly=true)
	@DataSourceAnnotation(value=DataSourceKey.slave)
	public List<Map<String, Object>> getUserList() {

		return synthesizeDao.getUserList();
	}

	@Override
	@Transactional(readOnly=true)
	@DataSourceAnnotation(value=DataSourceKey.master)
	public List<Map<String, Object>> getDeptList() {
		
		return synthesizeDao.getDeptList();
	}

	@Override
	public List<Map<String, Object>> getList() {
	    deptService.getList();
		userService.getList();
		return null;
	}
	

}
