package com.appleframework.opm.directive;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.appleframework.opm.entity.RopApi;
import com.appleframework.opm.service.RopApiService;
import com.appleframework.web.freemarker.directive.BaseDirective;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Component("apiDirective")
public class ApiDirective extends BaseDirective {

	private static final String VARIABLE_NAME = "apis";
	
	@Resource
	private RopApiService ropApiService;

	@SuppressWarnings({ "rawtypes" })
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) 
			throws TemplateException, IOException {		
		//SimpleNumber modulIdNumber = (SimpleNumber)params.get("modulId");
		Object modulIdN = params.get("modulId");
		Object keywordS = params.get("keyword");
		String keyword = null;
		if(null != keywordS)
			keyword = keywordS.toString();
		List<RopApi> apiList = 
				ropApiService.findListByModulIdAndKeyword(Long.parseLong(modulIdN.toString()), keyword);
		setLocalVariable(VARIABLE_NAME, apiList, env, body);
	}

}