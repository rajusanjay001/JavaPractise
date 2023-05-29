package com.test.testing.problems;

public class TestingEnum {
public static void main(String[] args) {
	EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
	System.out.println(instance.getName());
	instance.setName("Raju");
	System.out.println(instance.getName());
	instance.setName("man");
	System.out.println(instance.getName());
	
	Log log = Log.INSTANCE;
	log.log(log.hashCode()+"");
	log.log(log.hashCode()+"");
}
}
