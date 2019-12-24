package org.test;

public class Array {
public static void main(String[] args) {
	int a[]= {10,30,40,20,10,60,80};
	int  i=0, j=0, temp=0;
	for (int k = 0; k < a.length; k++) {
		for (int k2 = k+1; k2 < a.length; k2++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	for (int k : a) {
		if(k!=a[j])
		System.out.println(k);
	}
	
}
}
