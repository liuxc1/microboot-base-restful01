package com.liuxc.restful.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liuxc.restful.dao.IUserMapper;
import com.liuxc.restful.datasource.DataSourceAnnotation;
import com.liuxc.restful.datasource.DataSourceKey;
import com.liuxc.restful.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserMapper userDao;

	@Override
	@Transactional(readOnly = true)
	@DataSourceAnnotation(value = DataSourceKey.slave)
	public List<Map<String, Object>> getList() {
		
		return userDao.getList();
	}

}
