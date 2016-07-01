package ketha.assign2;

public class PictureBox extends Box {
//It is a type of Box which contains pictures
	private Picture p1;
	public PictureBox(double h, double d, double l,String material,Picture p1){
		super(h,d,l,material);
		this.p1=p1;
		}//constructors
		//using super to acces base class constructor
	public void check(){
		double w=p1.getWidth();
		double l=p1.getLength();
		//checking to see whether dimensions of picture fit in box or not
		if(w>super.height || w>super.depth || w>super.length||l>super.height || l>super.depth || l>super.length){
			System.out.println("Picture does not fit in Box");
		}
		else
			System.out.println("Picture fits in Box!");
	}
	
	public double getLength(){
		return super.length;
	}
	public double getHeight(){
		return super.height;
	}
	public String toString(){
		double w=p1.getWidth();
		double l=p1.getLength();
		return "Box Length="+super.length+" "+" "+"Box Height="+super.height+" "+" "+"Box Depth="+super.depth+" "+"Picture Width "+w+" "+" Picture Length"+l;
	}//overriding toString method to show contents of object
}
