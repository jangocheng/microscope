package com.vipshop.microscope.hbase.domain;


public class AppTrace {

	private String appName;
	
	private String traceName;

	public AppTrace(String appName, String traceName) {
		super();
		this.appName = appName;
		this.traceName = traceName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getTraceName() {
		return traceName;
	}

	public void setTraceName(String traceName) {
		this.traceName = traceName;
	}

	@Override
	public String toString() {
		return "App [appName=" + appName + ", traceName=" + traceName + "]";
	}

}
