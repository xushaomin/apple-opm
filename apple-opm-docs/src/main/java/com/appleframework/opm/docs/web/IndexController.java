package com.appleframework.opm.docs.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appleframework.model.page.Pagination;
import com.appleframework.opm.common.web.BaseController;
import com.appleframework.opm.entity.RopApi;
import com.appleframework.opm.entity.RopApiParams;
import com.appleframework.opm.entity.RopApiSystemParams;
import com.appleframework.opm.entity.RopModul;
import com.appleframework.opm.service.RopApiParamsService;
import com.appleframework.opm.service.RopApiService;
import com.appleframework.opm.service.RopApiSystemParamsService;
import com.appleframework.opm.service.RopModulService;

/**
 * 节目的controller
 *
 */
@Controller
@RequestMapping("/apidoc")
public class IndexController extends BaseController {
	
	@Resource
	private RopApiService ropApiService;
	
	@Resource
	private RopApiParamsService ropApiParamsService;
	
	@Resource
	private RopApiSystemParamsService ropApiSystemParamsService;
	
	@Resource
	private RopModulService ropModulService;
	
	private String viewModel = "apidoc/";
	
	@RequestMapping(value = "/index")
	public String index(Model model, String keyword) {
		try {
			List<RopModul> list = ropModulService.findAll();
			model.addAttribute("moduls", list);
			model.addAttribute("keyword", keyword);
			return viewModel + "index";
		} catch (Exception e) {
			e.printStackTrace();
			addErrorMessage(model, e.getMessage());
			return ERROR_VIEW;
		}
	}
	
	@RequestMapping(value = "/detail")
	public String detail(Model model, Long page_id, String keyword) {
		try {
			RopApi api = ropApiService.get(page_id);
			
			List<RopApiParams> paramList = ropApiParamsService.findListByApiId(page_id);
			List<RopApiSystemParams> systemParamList = ropApiSystemParamsService.findAll();
			
			model.addAttribute("api", api);
			model.addAttribute("params", paramList);
			model.addAttribute("systemParams", systemParamList);
			return viewModel + "detail";
		} catch (Exception e) {
			e.printStackTrace();
			addErrorMessage(model, e.getMessage());
			return ERROR_VIEW;
		}
	} 
	
	@RequestMapping(value = "/introduction")
	public String introduction(Model model, Pagination page, String keyword) {
		try {
			return viewModel + "introduction";
		} catch (Exception e) {
			e.printStackTrace();
			addErrorMessage(model, e.getMessage());
			return ERROR_VIEW;
		}
	}
	
}

