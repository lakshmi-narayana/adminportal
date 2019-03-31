package com.admin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.dao.AdminDao;
import com.admin.dto.ConfigurationDto;

@Controller
public class AdminController {

	@Autowired
	AdminDao adminDao;

	@RequestMapping("adminForm")
	public String showForm(Model model) {
		model.addAttribute("command", new ConfigurationDto());
		return "adminForm";
	}
	
	@RequestMapping( value = "/saveConfiguration", method = RequestMethod.POST )
	public String saveConfiguration(@ModelAttribute("configDetails") ConfigurationDto configuationDto) {
		adminDao.save(configuationDto);
		return "redirect:/viewConfigList";
	}

	@ModelAttribute("cloudproviderlist")
	public Map<String, String> getCloudproviderlist() {
		Map<String, String> providerList = new HashMap<String, String>();
		providerList.put("AWS", "Amazon AWS");
		providerList.put("IBMWS", "IBM Web Services");
		providerList.put("WAS", "Windows Azure");
		providerList.put("AdbCl", "Adobe Cloud");
		return providerList;
	}
	
	@ModelAttribute("apigatewaylist")
	public Map<String, String> apigatewaylist() {
		Map<String, String> apiList = new HashMap<String, String>();
		apiList.put("AWSP", "Amazon EC2 API");
		apiList.put("IBMWSP", "IBM Web API");
		apiList.put("WASP", "Windows Azure API");
		apiList.put("AdbClP", "Adobe Cloud API");
		return apiList;
	}
	@ModelAttribute("servicelist")
	public Map<String, String> getServicelist() {
		Map<String, String> sList = new HashMap<String, String>();
		sList.put("AWSPS", "Amazon EC2 API Service");
		sList.put("IBMWSPS", "IBM Web API Service");
		sList.put("WASPS", "Windows Azure API Service");
		sList.put("AdbClPS", "Adobe Cloud API service");
		return sList;
	}
	@ModelAttribute("dashboardlist")
	public Map<String, String> getDashboardlist() {
		Map<String, String> dList = new HashMap<String, String>();
		dList.put("AWSD", "Amazon Dashboard");
		dList.put("IBMWD", "IBM Dasboard");
		dList.put("WASD", "Windows Dashboard");
		dList.put("ADSD", "Adobe Dashboard");
		return dList;
	}
	@ModelAttribute("monitoringlist")
	public Map<String, String> getMonitoringlist() {
		Map<String, String> mList = new HashMap<String, String>();
		mList.put("AWSJ", "Amazon J Monitoring Tool");
		mList.put("IBMWJ", "IBM J Monitoring Tool");
		mList.put("WASJ", "Windows Load Runner");
		mList.put("ADSJ", "Adobe J Runner");
		return mList;
	}
	@ModelAttribute("serverlist")
	public Map<String, String> getServerlist() {
		Map<String, String> mList = new HashMap<String, String>();
		mList.put("AWST", "Tomcat App Server");
		mList.put("IBMW", "IBM Websphere");
		mList.put("WASI", "MS IIS");
		mList.put("ADSLCD", "Adobe BlazeDS");
		return mList;
	}
	@ModelAttribute("storagelist")
	public Map<String, String> getStoragelist() {
		Map<String, String> sList = new HashMap<String, String>();
		sList.put("AWSS", "AWS S3");
		sList.put("IBMW", "IBM RAID");
		sList.put("WASI", "MS AZURE Cloud");
		sList.put("ADSLCD", "Adobe Cloud Elastic");
		return sList;
	}
	@ModelAttribute("databaselist")
	public Map<String, String> getDatabaselist() {
		Map<String, String> dList = new HashMap<String, String>();
		dList.put("AWSD", "AWS Dynamo DB");
		dList.put("IBMD", "Mongo DB");
		dList.put("WASD", "Cassandra");
		dList.put("ADCD", "Hive");
		return dList;
	}
	@ModelAttribute("ssolist")
	public Map<String, String> getSsolist() {
		Map<String, String> sList = new HashMap<String, String>();
		sList.put("AWSS", "EC2");
		sList.put("IBMS", "Buckting");
		return sList;
	}

}
