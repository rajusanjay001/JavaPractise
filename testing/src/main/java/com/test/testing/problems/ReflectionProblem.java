package com.test.testing.problems;

import java.lang.reflect.Constructor;

public class ReflectionProblem {

	public static void main(String[] args) {

		DateUtil util1= DateUtil.getDateUtil();
		DateUtil util2 = null;
		
		Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
		
		for(Constructor con:constructors) {
			con.setAccessible(true);
			try {
				util2= (DateUtil) con.newInstance();
			}catch(Exception e) {
				
			}
		}
		
		System.out.println(util1.hashCode());
		System.out.println(util2.hashCode());
	}

}
