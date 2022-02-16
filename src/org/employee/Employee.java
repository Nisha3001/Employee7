package org.employee;

public class Employee {

	public static void main(String[] args) {
		int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[3]=60;
		System.out.println(a[3]);
		int length = a.length;
		System.out.println(length);
		System.out.println("****************");
		System.out.println("forloop");
		for (int i = 0; i<5; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("             ");
		for (int i : a) {
			System.out.println(i);
			
		}
		
				
		
		
	}
	
		


}
