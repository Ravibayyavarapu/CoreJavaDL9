package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {

		// Assignment Operators += -= *= /= %=
		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a += b); // 30 //a = a+b // a = 10+20 = 30
		System.out.println("In Memory: " + a);
		System.out.println(a -= c); // 20 // a = a-c // a = 30-10 = 20
		System.out.println("In Memory: " + a);
		System.out.println(a *= b); // 400 // a = a*b // a = 20 * 20 = 400
		System.out.println("In Memory: " + a);
		System.out.println(a /= b); // 20
		System.out.println(a %= b); // 0 

		int x = 15;
		int y = 3;
		System.out.println(x /= y); // 5
		System.out.println(x %= y); // 0
	}

}
