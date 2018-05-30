package com.liuxc.restful.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liuxc.restful.service.ISynthesizeService;

public class SynthesizeTest extends BaseTest {
	@Autowired
	ISynthesizeService synthesizeService;

	@Test
	public void testGetList() throws Exception {
		List<Map<String, Object>> deptList = synthesizeService.getDeptList();
		List<Map<String, Object>> userList = synthesizeService.getUserList();
		System.err.println("userSize：" + userList.size());
		System.err.println("deptSize：" + deptList.size());
	}
	
}
