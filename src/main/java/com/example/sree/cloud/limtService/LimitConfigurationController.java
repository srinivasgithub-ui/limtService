package com.example.sree.cloud.limtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sree.cloud.limtService.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private LimitDynamicConfiguration configuration;
	
	@GetMapping(path="/limit")
	public LimitConfiguration limitconfiguration(){
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
