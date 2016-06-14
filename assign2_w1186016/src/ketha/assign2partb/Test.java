package ketha.assign2partb;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team arch=new Architect("Bhargavi");	
		Team prog=new Programmer("Varsha");	
		Team dev=new Developer("Mary");
		Team dev1=new Developer("John");
		Team man=new Manager("Mohan");
		//1 is to add and 0 is to delete
		((Manager) man).manage(arch,1);//adding arch
		((Manager) man).manage(prog,1);//adding prog
		((Manager) man).manage(dev,1);//adding dev
		((Manager) man).manage(dev1,1);//adding dev1
		((Manager) man).manage(dev,0);//deleting dev
		man.report();//calling report of all instances in TechList
		
	}

}
