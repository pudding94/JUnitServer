package com.schedule.junit.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.schedule.junit.service.JunitTestWebService", serviceName = "junitTestWebService")
public class JunitTestWebServiceImpl implements JunitTestWebService {

	@Override
	public String execute(String script) {
		// TODO Auto-generated method stub
		return script+"sb";
	}

}