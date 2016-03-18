package com.appleframework.opm.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.opm.entity.RopApi;
import com.appleframework.opm.entity.RopApiParams;
import com.appleframework.opm.entity.RopModul;
import com.appleframework.opm.entity.RopServer;
import com.appleframework.opm.model.EnvType;
import com.appleframework.opm.model.ServiceMethodDefinition;
import com.appleframework.opm.model.SideType;
import com.appleframework.opm.service.RopApiParamsService;
import com.appleframework.opm.service.RopApiService;
import com.appleframework.opm.service.RopModulService;
import com.appleframework.opm.service.RopServerService;
import com.appleframework.opm.service.ServiceMethodDefinitionService;

@Service
public class ServiceMethodDefinitionImpl implements ServiceMethodDefinitionService {
	
	@Resource
	private RopModulService ropModulService;
	
	@Resource
	private RopApiService ropApiService;
	
	@Resource
	private RopApiParamsService ropApiParamsService;
	
	@Resource
	private RopServerService ropServerService;
	
	public void doHandleDefinition(ServiceMethodDefinition definition, Map<String, String> attributeMap) {
		
		String group = definition.getMethodGroup();
		String groupTitle = definition.getMethodGroupTitle();
		
		RopModul moudel = ropModulService.getByModulCode(group);
		if(null == moudel) {
			moudel = new RopModul();
			moudel.setModulCode(group);
			moudel.setModulName(groupTitle);
			moudel.setModulDesc(groupTitle);
			ropModulService.save(moudel);
		}

		RopApi api = ropApiService.get(moudel.getId(), definition.getMethod(), definition.getVersion());
		if(null == api) {
			api = new RopApi();
			api.setApiDesc(definition.getMethodTitle());
			api.setApiName(definition.getMethodTitle());
			api.setApiPath(definition.getMethod());
			api.setApiVersion(definition.getVersion());
			api.setModulId(moudel.getId());
			api.setRequestType("POST/GET");
			api.setState(1);
			ropApiService.save(api);
			
		}
		
		for (String key : attributeMap.keySet()) {
			String value = attributeMap.get(key);
			
			RopApiParams apiParam = ropApiParamsService.get(api.getId(), key);
			if(null == apiParam) {
				apiParam = new RopApiParams();
				apiParam.setApiId(api.getId());
				apiParam.setControlType(1);
				apiParam.setDataType(value);
				apiParam.setIsNeed(true);
				apiParam.setParamName(key);
				apiParam.setSort(1);
				apiParam.setLength(10);
				ropApiParamsService.save(apiParam);
			}
		}
		
	}

	@Override
	public void doHandleServer(Map<String, String> serverMap) {
		System.out.println(serverMap);
		
		String port = serverMap.get("web.port");
		String ip = serverMap.get("node.ip");
		
		RopServer server = ropServerService.get(ip, port);
		if(null == server) {
			server = new RopServer();
			server.setServerHost(ip);
			server.setServerPort(port);
			server.setState(1);
			server.setSideType(SideType.IN.getIndex());
			server.setEnvType(EnvType.RELEASE.getIndex());
			ropServerService.save(server);
		}
		
	}
	
}
