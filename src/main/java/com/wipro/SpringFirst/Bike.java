package com.wipro.SpringFirst;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
public void drive() {
	System.out.println("Bike is running....");
}
}
