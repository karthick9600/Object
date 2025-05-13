package com.Project;
class Dogs{
	private String name;
	private String color;
	private int cost;

public Dogs(String x,String y,int  z){
	
	name = x;
	color =y;
    cost =z;
	
}
void display() {
	System.out.println( name);
	System.out.println( color);
	System.out.println( cost);
}



}
public class Constructor {
	public static void main(String[] args){
		Dogs d=new Dogs("Rocky","white",100000);
		d. display();
		
	}
	}