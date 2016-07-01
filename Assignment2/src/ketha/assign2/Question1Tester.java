package ketha.assign2;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016


public class Question1Tester {
	public static void main(String [] args){
		System.out.println("TESTING");
		System.out.println("");
		System.out.println("RECTANGLE");
		Rectangle rec=new Rectangle(12,2);
		System.out.println(rec.area());//Testing to show area of rectangle
		System.out.println("");
		System.out.println("");
		System.out.println("BALL");//Testing to show volume of ball
		Ball ba=new Ball(5);
		System.out.println("Radius= "+ba.get());
		System.out.println("Volume= "+ba.volume());
		System.out.println("");
		System.out.println("");
		System.out.println("PICTURE");//Testing to show contents of picture
		Picture p1=new Picture(20,15,"Dante's Inferno","Dante");
		System.out.println(p1.toString());
		System.out.println("");
		System.out.println("FRAME");//Testing to show frame area and contents
		Frame f1=new Frame(15,15,"Plastic");
		System.out.println("Area= "+f1.area());
		System.out.println(f1.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("BLOCK");//Testing to show volume of block
		Block b1=new Block(5,10,15);
		System.out.println("Volume= "+b1.volume());
		System.out.println("");
		System.out.println("");
		System.out.println("SQUARE");//Testing to show area of square
		Rectangle sq=new Square(5);
		System.out.println("Area= "+sq.area());
											//System.out.println(rec.area());
											//System.out.println(rec.toString());
		System.out.println(sq.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("BOX");
		Block bo=new Box(5,5,5,"Cardboard");
		System.out.println("Volume= "+bo.volume());
		System.out.println(bo.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("FRAMED PICTURE");
		FramedPicture fra=new FramedPicture(50,50,"plastic",p1);//passing instance of Picture p1 as parameter here
		fra.check();//checking whether the picture can fit in the frame
		System.out.println(fra.toString());//showing contents of object
		System.out.println("");
		System.out.println("");
		System.out.println("BALL IN BLOCK");
		BallInBlock bob1= new BallInBlock(ba,5,5,5);//passing instance of Ball ba here as parameter
		bob1.check();//checking whether the ball can fit in the box
		System.out.println(bob1.toString());//showing contents of object
		System.out.println("");
		System.out.println("");
		System.out.println("PICTURE BOX");
		PictureBox pb=new PictureBox(50, 50 , 50 , "plastic", p1);
		pb.check();
		System.out.println(pb.toString());
		
		
		
	}

}
