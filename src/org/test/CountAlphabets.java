package org.test;

public class CountAlphabets {
	public static void main(String[] args) {
		String n="ABCD134 xyz546";
		int count=0;
		char[] h= n.toCharArray();
		for (char c : h) {
			if (Character.isAlphabetic(c)) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
