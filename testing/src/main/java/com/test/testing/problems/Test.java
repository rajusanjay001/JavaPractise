package com.test.testing.problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil util = DateUtil.getDateUtil();

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("/Users/apple/Documents/singleton/dateUtil.ser")));
		oos.writeObject(util);
		DateUtil util1 = null;
		System.out.println(util);
		ObjectInputStream is = new ObjectInputStream(
				new FileInputStream(new File("/Users/apple/Documents/singleton/dateUtil.ser")));
		util1 = (DateUtil) is.readObject();
		
		oos.close();
		is.close();
		System.out.println(util==util1);
	}
}
