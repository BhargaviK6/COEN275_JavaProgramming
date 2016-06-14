package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Block {
	protected double height;
	protected double depth;
	protected double length;
	public Block(){
		
	}
	public Block(double h,double d, double l){
		this.height=h;
		this.depth=d;
		this.length=l;	
	}//constructors
	public double volume(){
		return height*depth*length;
	}

}
