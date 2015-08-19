package com.onlineinteract.app;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		Predicate<String> p1 = s -> s.length() < 20;
		Predicate<String> p2 = s -> s.length() > 10;

		Predicate<String> p3 = p1.and(p2);

		// The following are all of course true.
		System.out.println("*** p1 - is string length passed in < 20: "
				+ p1.test("abcde"));
		System.out.println("*** p2 - is string length passed in > 10: "
				+ p2.test("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("*** p3 - is string length passed in < 20 and > 10: "
				+ p3.test("abcdefghijkl"));
		
		System.out.println();
		
		// The following are all of course false.
		System.out.println("*** p1 - is string length passed in < 20: "
				+ p1.test("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("*** p2 - is string length passed in > 10: "
				+ p2.test("abcde"));
		System.out.println("*** p3 - is string length passed in < 20 and > 10: "
				+ p3.test("abc"));
	}
}
