package com.appleframework.opm.collector.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appleframework.opm.common.util.BeanToMapUtils;
import com.appleframework.opm.model.ServiceMethodDefinition;
import com.appleframework.opm.service.ServiceMethodDefinitionService;
import com.appleframework.web.springmvc.controller.BaseController;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/collect")
public class CollectController extends BaseController {
	
	@Resource
    private ThreadPoolTaskExecutor taskExecutor;
	
	@Resource
    private ServiceMethodDefinitionService serviceMethodDefinitionService;
			
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/api")
	public @ResponseBody String api(final String apis, final String server, Model model) throws Exception {
		try {
			
			taskExecutor.execute(new Runnable() {
		    	@Override  
		    	public void run() {
		    		try {
		            	ObjectMapper mapper = new ObjectMapper();  
		            	List<Map<String, Map>> services = mapper.readValue(apis, List.class);
			    		for (Map<String, Map> map : services) {
			    			Map definitionMap = map.get("definition");
			    			ServiceMethodDefinition definition = (ServiceMethodDefinition)BeanToMapUtils.convertMap(ServiceMethodDefinition.class, definitionMap);			    				
			    			Map<String, String> attributeMap = map.get("attributes");
			    			serviceMethodDefinitionService.doHandleDefinition(definition, attributeMap);
			    		}
			    		Map<String, String> serverMap = mapper.readValue(server, Map.class);
			    		serviceMethodDefinitionService.doHandleServer(serverMap);			    		
					} catch (Exception e) {
						// TODO: handle exception
					}
		    	}  
			});  
			
			return "ok";
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
		
}
