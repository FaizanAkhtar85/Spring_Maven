package com.wipro.spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	//@Qualifier("mediaTek")
	MobileProcessor microProcessor;

	public void config() {
		System.out.println("Samsung Note 8 pro with 6 GB Ram and 20 MP Camera ");
		microProcessor.getMicroProcessor();
	}

}
