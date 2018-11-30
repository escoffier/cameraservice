package com.cameraservice.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.ac.util.SessionUtil;
import com.ac.util.jsonresult.JsonResult;

@Controller
public class AppCtrl {


	@ResponseBody
	@RequestMapping(value="/sys/login")
	public JsonResult login(@RequestBody Map<String, String> paraMap) {
		String userNmae = paraMap.get("username");
		SessionUtil.login(userNmae);
		return JsonResult.success();
	}
	
	@RequestMapping(value="/sys/logout")
	public String login() {
		SessionUtil.logout();
		return "redirect:/login";
	}

	@ResponseBody
	@RequestMapping("/sys/route")
	public List<Map<String, String>> route(HttpServletRequest request) throws Exception {
		List<Map<String, String>> routeList = Lists.newArrayList();
		Map<String, String> route = null;
	
		route = Maps.newHashMap();
		routeList.add(route);
		route.put("name", "camera manager");
		route.put("ctrl", "CameramanagerCtrl");
		route.put("path", "/module/cameramanager");
		route.put("templateUrl", request.getContextPath() + "/modules/module/CameramanagerListTpl.html?v=");
		route.put("files", request.getContextPath() + "/modules/module/CameramanagerCtrl.js");
		return routeList;
	}

	@ResponseBody
	@RequestMapping("/sys/menus")
	public List<Map<String, Object>> ngMenus() throws Exception {
		List<Map<String, Object>> menuList = Lists.newArrayList();
		Map<String, Object> menu = null;
		Map<String, String> subMenu = null;
		List<Map<String, String>> subMenuList = null;
	
		menu = Maps.newHashMap();
		menuList.add(menu);
		menu.put("name", "camera manager");
		menu.put("type", "link");
		menu.put("showTip", "false");
		menu.put("icon", "fa-file-o");
		menu.put("path", "/module/cameramanager");
		
		
		return menuList;
	}
}
