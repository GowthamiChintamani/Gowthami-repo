package org.cap.demo;

public class SalesClass {
	int[] arr= {1,2,3,4,5}; 
	int sum=0;
public void show() {
	for (int i : arr) {
		sum+=i;
		System.out.println(i);
	}
System.out.println(sum);
}
}
