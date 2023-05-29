package com.test.testing.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestProgram {

	public static void main(String[] args) {

		int arr[] = new int[] { -1, -1, -1, -1, 1, 9, 3, 2, -1, 4, -1 };
		ArrayMaker(arr);

	}

	public static int[] ArrayMaker(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<>();
	
		for (int i = 0; i <arr.length; i++) {
			
			if(arr[i]>-1)
			hashMap.put(arr[i], arr[i]);
			if(!hashMap.containsKey(i))
				hashMap.put(i, -1);
				
		}
		System.out.println(hashMap);
		return new int[] {};

	}
}


//select e.salary from employee e order by e.salary desc limit 2,2;
