package com.liuxc.restful.service;

import java.util.List;
import java.util.Map;

public interface ISynthesizeService {
	List<Map<String, Object>> getUserList();

	List<Map<String, Object>> getDeptList();
	
	List<Map<String, Object>> getList();
}
