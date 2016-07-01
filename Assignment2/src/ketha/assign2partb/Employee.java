package ketha.assign2partb;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
abstract class Employee implements Team {
	private String name;
	public abstract double salary();
	public abstract String service();
	//public abstract String report();
	public Employee(){}
	public Employee(String name){
		this.name=name;
	}
	public String name(){
		return name;
	}
}

