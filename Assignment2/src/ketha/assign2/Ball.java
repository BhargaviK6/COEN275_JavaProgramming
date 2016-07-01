package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Ball {
	protected double radius;
	public Ball(){}
	public Ball(double r){
		this.radius=r;
	}
	public double volume(){
		return 4/3 * 3.14 * radius *radius *radius;
	}
	public double get(){
		return radius;
	}

}
