package com.appleframework.opm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.entity.RopApi;
import com.appleframework.opm.model.ApiBo;
import com.appleframework.opm.model.ServerBo;
import com.appleframework.opm.service.ApiService;
import com.appleframework.opm.service.RopApiService;
import com.appleframework.opm.service.RopServerService;

@Service
public class ApiServiceImpl implements ApiService {
		
	@Resource
	private RopApiService ropApiService;
		
	@Resource
	private RopServerService ropServerService;

	@Override
	public List<ApiBo> getList(String appkey) {
		List<RopApi> apiList = ropApiService.findListByState();
		List<ApiBo> list = new ArrayList<ApiBo>();
		for (RopApi ropApi : apiList) {
			List<ServerBo> serverList = ropServerService.findByAppIdAndApiId(1L, ropApi.getId());
			if(serverList.size() > 0) {
				ApiBo api = new ApiBo(ropApi.getApiName(), ropApi.getApiPath(), ropApi.getApiVersion(), ropApi.getRequestType());
				api.setServers(serverList);
				list.add(api);
			}
		}
		return list;
	}
		
}
