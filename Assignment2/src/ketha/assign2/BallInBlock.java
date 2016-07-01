package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class BallInBlock extends Block{
	//This is a block which contains a ball
	//using extends to inherit properties from base class Block
	//using composition to contain properties of class Ball
	private Ball b1;
	public BallInBlock(){
		
	}
	public BallInBlock(Ball b1, double height, double depth, double length)
	{
		super(height,depth,length);
		this.b1=b1;	//initializing object 
	}//constructors
	//using super to access constructor of base class
	public void check(){
	double r=b1.get(); //get radius
	if(r>super.height || r>super.depth || r>super.length)
	{
		System.out.println("Sorry ball cannot fit in box");
	}
	else{
		System.out.println("Ball fits in box!");
	}//checking whether the ball can fit in the box or not
	}
	public String toString(){
		return "Block Height="+super.height+" "+" "+"Block Depth="+super.depth+" "+" "+"Block Length="+super.length+" "+" "+"Block Volume="+super.volume()+" "+" "+"Ball radius="+b1.get()+" "+" "+"Ball Volume="+b1.volume();
	}//overriding toString method to showcase contents of object


}
