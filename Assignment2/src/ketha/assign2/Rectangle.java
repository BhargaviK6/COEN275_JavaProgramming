package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Rectangle {
	protected double width;
	protected double length;
	public Rectangle(){
		
	}
	public Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}
	//constructors
	public double area(){
		return width*length;
	}
}
