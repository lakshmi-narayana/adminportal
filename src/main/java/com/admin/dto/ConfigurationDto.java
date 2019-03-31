package com.admin.dto;

import java.io.Serializable;

public class ConfigurationDto implements Serializable{
	
	private String cloudProviderName;
	private String apiGateway;
	private String serviceDiscovery;
	private String dashBoard;
	private String monitoring;
	private String server;
	private String storgae;
	private String dataBase;
	private String sso;
	
	public String getCloudProviderName() {
		return cloudProviderName;
	}
	public void setCloudProviderName(String cloudProviderName) {
		this.cloudProviderName = cloudProviderName;
	}
	public String getApiGateway() {
		return apiGateway;
	}
	public void setApiGateway(String apiGateway) {
		this.apiGateway = apiGateway;
	}
	public String getServiceDiscovery() {
		return serviceDiscovery;
	}
	public void setServiceDiscovery(String serviceDiscovery) {
		this.serviceDiscovery = serviceDiscovery;
	}
	public String getDashBoard() {
		return dashBoard;
	}
	public void setDashBoard(String dashBoard) {
		this.dashBoard = dashBoard;
	}
	public String getMonitoring() {
		return monitoring;
	}
	public void setMonitoring(String monitoring) {
		this.monitoring = monitoring;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getStorgae() {
		return storgae;
	}
	public void setStorgae(String storgae) {
		this.storgae = storgae;
	}
	public String getDataBase() {
		return dataBase;
	}
	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}
	public String getSso() {
		return sso;
	}
	public void setSso(String sso) {
		this.sso = sso;
	}
	
}
