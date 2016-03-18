package com.appleframework.opm.common.web;

import java.util.Date;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.appleframework.model.Operator;
import com.appleframework.model.OperatorType;
import com.appleframework.web.bean.Message;
import com.appleframework.web.bean.Message.Type;
import com.appleframework.web.freemarker.directive.FlashMessageDirective;
import com.appleframework.opm.common.util.DateEditor;

public class BaseController {
	
	protected static final String ERROR_VIEW = "/commons/error";
	
	protected static final String ERROR_AJAX = "/commons/error_ajax";
	
	protected static final String SUCCESS_VIEW = "/commons/success";
	
	protected static final String SUCCESS_AJAX = "/commons/success_ajax";
	
	protected static final Message ERROR_MESSAGE = Message.error("操作错误");

	protected static final Message SUCCESS_MESSAGE = Message.success("操作成功");

	private static final String CONSTRAINT_VIOLATIONS_ATTRIBUTE_NAME = "constraintViolations";

	@Resource(name = "validator")
	private Validator validator;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		binder.registerCustomEditor(Date.class, new DateEditor(true));
	}

	protected boolean isValid(Object target, Class<?>... groups) {
		Set<ConstraintViolation<Object>> constraintViolations = validator.validate(target, groups);
		if (constraintViolations.isEmpty()) {
			return true;
		} else {
			RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
			requestAttributes.setAttribute(CONSTRAINT_VIOLATIONS_ATTRIBUTE_NAME, constraintViolations, RequestAttributes.SCOPE_REQUEST);
			return false;
		}
	}

	protected boolean isValid(Class<?> type, String property, Object value, Class<?>... groups) {
		Set<?> constraintViolations = validator.validateValue(type, property, value, groups);
		if (constraintViolations.isEmpty()) {
			return true;
		} else {
			RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
			requestAttributes.setAttribute(CONSTRAINT_VIOLATIONS_ATTRIBUTE_NAME, constraintViolations, RequestAttributes.SCOPE_REQUEST);
			return false;
		}
	}

	/*protected String message(String code, Object... args) {
		return SpringUtils.getMessage(code, args);
	}*/

	protected void addFlashMessage(RedirectAttributes redirectAttributes, Message message) {
		if (redirectAttributes != null && message != null) {
			redirectAttributes.addFlashAttribute(FlashMessageDirective.FLASH_MESSAGE_ATTRIBUTE_NAME, message);
		}
	}
	
	protected void addSuccessMessage(Model model, String content, String url) {
		if ( model != null) {
			Message message = new Message(Type.success, content, url);
			model.addAttribute(FlashMessageDirective.FLASH_MESSAGE_ATTRIBUTE_NAME, message);
		}
	}
	
	protected void addSuccessMessage(Model model, String url) {
		if ( model != null) {
			Message message = new Message(Type.success, url);
			model.addAttribute(FlashMessageDirective.FLASH_MESSAGE_ATTRIBUTE_NAME, message);
		}
	}
	
	protected void addErrorMessage(Model model, String content) {
		if ( model != null) {
			Message message = new Message(Type.error, content, "");
			model.addAttribute(FlashMessageDirective.FLASH_MESSAGE_ATTRIBUTE_NAME, message);
		}
	}
	
	protected String ajax(String content) {
		return content.trim();
	}

	/*protected void addLog(String content) {
		if (content != null) {
			RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
			requestAttributes.setAttribute(Log.LOG_CONTENT_ATTRIBUTE_NAME, content, RequestAttributes.SCOPE_REQUEST);
		}
	}*/
	
	protected Operator getOperatorForDev(HttpServletRequest request) {
		return Operator.creat(OperatorType.OSS, "1");
	}
	
	/*protected Operator getOperator(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute(CasFilter.SESSION_USER_KEY);
		return Operator.creat(OperatorType.OSS, user.getUsername());
	}
	
	public User getUser(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute(CasFilter.SESSION_USER_KEY);
		return user;
	}*/
	/*@SuppressWarnings("unchecked")
	protected List<String> getRightsForCity(HttpServletRequest request){
		List<String> cityRts = (List<String>)request.getSession().getAttribute(OssFilter.SESSION_RTS_KEY);
		return cityRts;
	}*/
	
	/*protected String getRightsForCityWithString(HttpServletRequest request){
		List<String> cityRts = this.getRightsForCity(request);
		if(cityRts.size() > 0) {
			String cityRtsString = cityRts.toString();
			cityRtsString = cityRtsString.substring(1, cityRtsString.length()-1);
			System.out.println("rights="+cityRtsString);
			return cityRtsString;
		} else {
			return null;
		}
	}*/
	
	/*protected List<OperateCity> getAllOperateCity() {
		try {
			return operateCityService.findAll();
		} catch (AppleException e) {
			return null;
		}
	}
	
	protected List<OrderBookType> getTypeBookList() {
		return Arrays.asList(OrderBookType.values());
	}
	
	protected List<OrderStateType> getOrderStateList() {
		return Arrays.asList(OrderStateType.values());
	}
	
	public List<MemberVerifyState> getMemberVerifyStateList() {
		return Arrays.asList(MemberVerifyState.values());
	}
	
	public List<RegloginSource> getRegloginSourceList() {
		return Arrays.asList(RegloginSource.values());
	}
	
	protected List<Configuration> getGoodsTypeList() {
		return configurationService.findByGroup(ConfigurationGroup.GROUP_GOODS_TYPE);
	}
	
	protected List<Configuration> getSpecialNeedsList() {
		return configurationService.findByGroup(ConfigurationGroup.GROUP_SPECIAL_NEEDS);
	}

	protected String getTmpPath(HttpServletRequest request){
		return request.getRealPath("/tmp")+File.separator;
	}*/
}
