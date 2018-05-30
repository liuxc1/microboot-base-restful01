package com.liuxc.restful.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liuxc.restful.domain.Dept;
import com.liuxc.restful.service.IDeptService;
import com.liuxc.restful.service.IUserService;

public class DataSourceTest extends BaseTest {
	@Autowired
	private IUserService userService;
	@Autowired
	private IDeptService deptService;

	@Test
	public void testGetList() throws Exception {
		List<Map<String, Object>> list = userService.getList();

		List<Map<String, Object>> list2 = deptService.getList();
	}

	@Test
	public void insertDept() throws Exception {
		List<Map<String, Object>> list = userService.getList();
		Dept dept = new Dept();
		dept.setId(2);
		dept.setName("人事部");
		System.err.println(deptService.insert(dept));
		System.out.println("userSize:"+list.size());
	}
}
