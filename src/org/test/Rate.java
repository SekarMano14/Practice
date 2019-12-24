package org.test;

public class Rate {
public static void main(String[] args) {
	for (int i = 4; i <5; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print(j);
		
	}System.out.println();
	}
	
	String s="Hello135461";
	char[] g=s.toCharArray();
	
	String rs="";
	for (char c : g) {
		if(Character.isAlphabetic(c)) {
		rs=rs+c;
	
		}	
		 
		
		
	}
	System.out.println(rs);
	
	
		
	
	String s1="Hello";
	char[] g1=s1.toCharArray();
	int count=0;
	String res="";
	for (char c : g1) {
		if(!res.contains(String.valueOf(c))) {
		res=res+c;
		count++;
	
		}	
	
		
		
	}
	System.out.println(res);
	System.out.println(count);
	
		
	
		
	
}

}
