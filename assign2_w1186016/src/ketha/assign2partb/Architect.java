package ketha.assign2partb;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Architect extends Employee {
	protected double sal=20000;
	protected String service="Design from ";
	public Architect(){}
	public Architect(String name){
		super(name);
		
	}
	public String name(){
		return super.name();
	}
	public double salary(){
		
		return sal;
	}
	public String service(){
		return service;
	}
	public String design(){
		String name1=super.name();
		return service+name1;
	}
	public String report(){
		
		String rep=design();
		return rep;
	}
}
