package ketha.assign2partb;
import java.util.ArrayList;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 2 
//Due Date:May 3,2016
public class Manager extends Employee {
	private int index=0;
	protected double sal=60000;
	protected String service="Manages";
	@SuppressWarnings("unused")
	private Team team;
	//Team [] Techlist=new Team[50];
	ArrayList<Team> Techlist=new ArrayList<Team>();
	public Manager(){}
	public Manager(String name){
		super(name);
	}
	public String name(){
		return super.name();
	}
	public double salary(){
		return sal;
	}
	public String service(){
		return service;
	}

	public void manage(Team team,int action){
		this.team=team;
		 
		if(action==1){
			Techlist.add(index,team);
			index++;
			System.out.println(index+".Added!");
			//System.out.println(index);
			//System.out.println(team.report());
		}
		else
			if(action==0){
				Techlist.remove(team);
				System.out.println(index+".Removed!");
			}
	
	}
	public String report(){
			String word="";
		for(int i=0;i<Techlist.size();i++){
			//System.out.println(team.report());
			System.out.println(Techlist.get(i).report());
			//System.out.println(Techlist.get(i).report());
		//System.out.println("In report method");
			
			}
		return word;
		}
	
}

