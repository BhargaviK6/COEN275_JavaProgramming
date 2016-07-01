package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Box extends Block {
	//using inheritance to extend base class
	private String material;
	public Box(){
		
	}
	public Box(double h, double d, double l,String material){
	super(h,d,l);
	this.material=material;	
	}//constructors
	//using super to acces base class constructor
	public String toString(){
		return "Box Height="+super.height+" "+" "+"Box Length="+super.length+" "+" "+"Box Depth="+super.depth+" "+" "+"Box Volume="+super.volume()+" "+" "+"BoxMaterial="+material;
	}//overriding toString method to show contents of object

}
