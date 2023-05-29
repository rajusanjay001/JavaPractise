package com.test.testing.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
public static void main(String[] args) {
int [] array = twosumproblem(new int []{ 44,3,4,5,6},11);
	for(int a:array)
		System.out.println(a);
}
public static int [] twosumproblem(int[] arr,int num) {//{22,3,4,5,6},9
	
	Map<Integer,Integer>hashMap = new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
		if(hashMap.containsKey(num-arr[i]))
			return new int[] {hashMap.get(num-arr[i]),i};
		hashMap.put(arr[i], i);
		
	}
	return new int[] {};
}
}
