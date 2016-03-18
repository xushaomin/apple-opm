package com.appleframework.opm.service;

import java.util.Map;

import com.appleframework.opm.model.ServiceMethodDefinition;

public interface ServiceMethodDefinitionService {
	
	public void doHandleDefinition(ServiceMethodDefinition definition, Map<String, String> attributeMap);
	
	public void doHandleServer(Map<String, String> serverMap);

}
