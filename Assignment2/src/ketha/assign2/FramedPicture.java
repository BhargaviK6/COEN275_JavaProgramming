package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class FramedPicture extends Frame {
	//using extends to inherit from base class Frame
	//using composition to contain properties of class Picture
	private Picture p1;
	public FramedPicture(){
		
	}
	public FramedPicture(double length, double width, String material, Picture pic)
	{
		super(length,width,material);
		this.p1=pic;//initializing object
		
	}//constructors
	//using super to access constructor of base class 
	public void check(){
		double w=p1.getWidth();
		double l=p1.getLength();
		//checking to see whether dimensions of picture fit in frame or not
		if(w>super.width || l>super.length){
			System.out.println("Picture does not fit in Frame");
		}
		else
			System.out.println("Picture fits in frame!");
	}
	
	public double getLength(){
		return super.length;
	}
	public double getWidth(){
		return super.width;
	}
	public String toString(){
		double w=p1.getWidth();
		double l=p1.getLength();
		return "Frame Length="+super.length+" "+" "+"Frame Width="+super.width+" "+" "+"Frame Area="+super.area()+" "+"Picture Width "+w+" "+" Picture Length"+l;
				
	}//overriding toString method to show contents of object
}
