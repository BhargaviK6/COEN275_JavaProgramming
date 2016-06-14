package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Picture {
	protected double length;
	protected double width;
	private String title;
	private String artist;
	public Picture(){}
	public Picture(double l, double w, String t, String a)
	{
		this.length=l;
		this.width=w;
		this.title=t;
		this.artist=a;
	
	}
	public String toString(){
		return "Title:"+this.title+"Artist Name:"+this.artist+"length:"+this.length+"Width"+this.width;
	}
	public double getWidth(){
		return width;
	}
	public double getLength(){
		return length;
	}
}
