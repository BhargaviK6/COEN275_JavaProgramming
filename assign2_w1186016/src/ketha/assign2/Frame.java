package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Frame {
		protected double length;
		protected double width;
		private String material;
		public Frame(){
			
		}
		public Frame(double l, double w, String m){
			this.length=l;
			this.width=w;
			this.material=m;
			}//constructors
		public double area(){
			return length*width;
		}
		//overriding toString method to return contents of object
		public String toString(){
			return "Length"+this.length+"Width"+width+"Material"+this.material;
		}
	
	

}
