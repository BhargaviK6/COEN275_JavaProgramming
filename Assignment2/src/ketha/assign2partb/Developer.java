package ketha.assign2partb;
import java.util.Date;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Developer extends Architect {
	private Programmer prog;
	public Developer(){}
	public Developer(String name){
		super(name);
		prog=new Programmer(name);
	}
	protected double sal=40000;
	protected String service="Develops";
	public String name(){
		return super.name();
	}
	public double salary(){
		
		return sal;
	}
	public String service(){
		return service;
	}
	public String develop(){
		String des=super.design()+" "+prog.code();
		return des;
	}
	public String report(){
		Date date = new Date();
		String rep=develop();
		return rep+" "+date.toString();
	}
}
