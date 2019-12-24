package org.test;

public class Constructor {
	int i=10;
	String Name="ravi";
	
	public Constructor() {
		System.out.println("Deafault");
		
	}
	
	public Constructor(int i, String n) {
		int rollno = i;
		String name=n;
		
		
	}
	private void print() {
		System.out.println("rollno is" + i);
		System.out.println("name is"+ Name);
			}
	
	public static void main(String[] args) {
		Constructor o=new Constructor();
		o.print();
		Constructor o1=new Constructor(200,"mk");
		o.print();
		o1.print();
		Constructor o2=new Constructor(56,"kkm");
		o.print();o1.print();o2.print();
		
	}

}
