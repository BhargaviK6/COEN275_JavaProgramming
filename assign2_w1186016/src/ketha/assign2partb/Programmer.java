package ketha.assign2partb;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Programmer extends Employee {
	public Programmer(){}
	public Programmer(String name){
		super(name);
	}
	protected double sal=50000;
	protected String service="Code from ";
	public double salary(){
		
		return sal;
	}
	public String service(){
		return service;
	}
	public String name(){
		return super.name();
	}
	public String code(){
		String des=service+super.name();
		return des;
	}
	public String report(){
		String rep=code();
		return rep;
	}
}
