package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Square extends Rectangle {
	//inheritance through base class Rectangle
	public Square(){
		
	}
	public Square(double side){
		super(side,side);
	}//using super to access base class constructor
	
	//constructors
	public String toString(){
		return "Side="+super.length+""+""+"Area="+super.area();
	}//overriding toString method to return contents of object
	
	

}
