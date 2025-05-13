package com.Project;
class Deer{
	private  String name;
	private String color;
	private int height;

Deer(){
	name="charlie";
	color="white";
	height= 120;
}
Deer(String name,String color,int height){
	this.name=name;
	this.color=color;
	this.height=height;
}
void display() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(height);
}

}

public class Super {

	public static void main(String[] args) {
		Deer d1=new Deer();
		 d1.display();
		 Deer d2=new Deer( "Rocky","Brown",150);
		 d2.display();
		

	}

}
