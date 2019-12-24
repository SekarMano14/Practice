package org.test;

public class Stringclass {
	public static void main(String[] args) {
		
	
	String name="welcome to java class";
	
	StringBuffer b= new StringBuffer(name);
	
	for(int i=0; i<name.length(); i++) {
		char g=b.charAt(i);
		if(Character.isUpperCase(g)) {
			b.setCharAt(i, Character.toLowerCase(g));
			}
			
			
			else {b.setCharAt(i, Character.toUpperCase(g));
			}
		}
			System.out.println(b.toString());
		
		
		}
	
	
	
	

}
