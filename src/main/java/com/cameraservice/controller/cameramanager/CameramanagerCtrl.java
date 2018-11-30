package com.cameraservice.controller.cameramanager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import com.ac.util.CommonForm;
import com.ac.util.jsonresult.JsonResult;

import com.cameraservice.dao.entity.DevicedirectoryEty;
import com.cameraservice.dao.mapper.base.DevicedirectoryMapper;

/**
 * camera manager
 */
@Controller
@RequestMapping("/cameramanager/CameramanagerCtrl/")
public class CameramanagerCtrl {

	@Autowired
	private DevicedirectoryMapper devicedirectoryMapper;		
	
	/**
	 * 查询
	 */
    @ResponseBody
	@RequestMapping(value="search")
	public JsonResult search(@RequestBody CommonForm<DevicedirectoryEty> devicedirectoryEty) throws Exception {
		long count = devicedirectoryMapper.selectLimitCount(devicedirectoryEty.getData());
		List<DevicedirectoryEty> list = devicedirectoryMapper.selectByLimit(devicedirectoryEty.getData(), devicedirectoryEty.getExtLimit());
		return JsonResult.pager(list, count);
	}
	
	/**
	 * 保存
	 */
    @ResponseBody
	@RequestMapping(value="save")
	public JsonResult save(@RequestBody DevicedirectoryEty devicedirectoryEty) throws Exception {
		if(devicedirectoryEty.getId() == null) {
			devicedirectoryMapper.insert(devicedirectoryEty);
		}
		else {
			devicedirectoryMapper.updateById(devicedirectoryEty);
		}
		return JsonResult.success();
	}
	
	/**
	 * 删除
	 */
    @ResponseBody
	@RequestMapping(value="delete")
	public JsonResult delete(@RequestParam("id") long id) {
		devicedirectoryMapper.deleteById(id);
		return JsonResult.success();
	}
	
	/**
	 * 得到详细信息
	 */
    @ResponseBody
	@RequestMapping(value="getDetailInfo")
	public JsonResult getDetailInfo(@RequestParam("id") long id) throws Exception {
		DevicedirectoryEty devicedirectoryEty = devicedirectoryMapper.selectById(id);
		return JsonResult.success(devicedirectoryEty);
	}
	
}