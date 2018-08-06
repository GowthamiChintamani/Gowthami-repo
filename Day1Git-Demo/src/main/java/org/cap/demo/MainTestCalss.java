package org.cap.demo;

public class MainTestCalss {
public static void main(String[] args) {
	SalesClass class1=new SalesClass();

	Subraction sub=new Subraction();

	Addition add=new Addition();

	System.out.println("hello world");
	greet();
	class1.show();

	sub.subnum(5,2);

	add.addShow(4,5);

}

private static void greet() {
	System.out.println("hi");
	System.out.println("github");
	System.out.println("hello");
	
}
}
