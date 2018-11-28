package com.wipro.spring_annotation;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
	public void getMicroProcessor() {
		System.out.println("MediaTek processor");		
	}


}
