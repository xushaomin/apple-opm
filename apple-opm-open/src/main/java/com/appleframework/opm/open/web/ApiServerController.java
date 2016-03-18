package com.appleframework.opm.open.web;

import java.util.List;

import javax.annotation.Resource;

import com.appleframework.opm.model.ApiBo;
import com.appleframework.opm.model.EnvType;
import com.appleframework.opm.model.ServerBo;
import com.appleframework.opm.open.request.ApiServerRequest;
import com.appleframework.opm.open.response.ApiServerResponse;
import com.appleframework.opm.service.ApiService;
import com.appleframework.opm.service.RopServerService;
import com.appleframework.rop.annotation.NeedInSessionType;
import com.appleframework.rop.annotation.ServiceMethod;
import com.appleframework.rop.annotation.ServiceMethodBean;

@ServiceMethodBean(version = "1.0")
public class ApiServerController {
	
	@Resource
	private ApiService apiService;
	
	@Resource
	private RopServerService ropServerService;

	@ServiceMethod(method = "jz.router.api.server", needInSession = NeedInSessionType.NO)
	public ApiServerResponse apiServer(ApiServerRequest request) throws Exception {
		ApiServerResponse response = new ApiServerResponse();
		String appKey = request.getRopRequestContext().getAppKey();
		String env = request.getEnv();		
		List<ApiBo> list = apiService.getList(appKey);
		response.setApis(list);
		ServerBo defaultServer = ropServerService.getByEnvTypeAndDefault(EnvType.valueOf(env.toUpperCase()));
		response.setDefaults(defaultServer);
		return response;
	}

}
