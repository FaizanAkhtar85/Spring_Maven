package com.wipro.spring_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor{
	public void getMicroProcessor() {
		System.out.println("Snapdragon processor");
	}

}
