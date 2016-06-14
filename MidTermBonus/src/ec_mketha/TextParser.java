package ec_mketha;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//MidTerm Bonus Assignment 
//Due Date:May 22,2016
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
//import com.google.common.collect.*;

public class TextParser {
	public static void main( String[] args ) throws IOException
	{
		ArrayList<String> Category=new ArrayList<String>();
		ArrayList<CategoryContent> Techlist=new ArrayList<CategoryContent>();
		ArrayList<String> Distinct=new ArrayList<String>();
		double sum=0;
		double sum1=0;
		double sum2=0;
		double sum3=0;
		double sum4=0;
		double count=0;
		double count1=0;
		double count2=0;
		double count3=0;
		double count4=0;
		int index=0;
		double Average=0;
		double Average1=0;
		double Average2=0;
		double Average3=0;
		double Average4=0;

		
		CategoryContent CategoryContent;
		 String filePath;
			try {
				InputStreamReader in= new InputStreamReader(System.in);
				BufferedReader input = new BufferedReader(in);
				System.out.print("Write the filepath here and press Enter:");
				while ((filePath = input.readLine()) != null)
				{
					//System.out.println(filePath);
				
				  

	        

			
		    //String filePath = "/Users/Bhargavi/Downloads/EC_mketha/Expenses.txt";
		    String regex="[,\\s]+";

		    String line;
		    BufferedReader reader = new BufferedReader(new FileReader(filePath));
		    while ((line = reader.readLine()) != null)
		    {
		        try{
		        	String[] parts = line.split(regex, 2);
		        	
		        if (parts.length >= 2)
		        {
		            String key = parts[0];
		            //System.out.println(key);
		            
		            Double value = Double.parseDouble(parts[1]);
		            //System.out.println(value);
	            CategoryContent=new CategoryContent(key,value);
	            Techlist.add(index,CategoryContent);
	            String cat=CategoryContent.getCategory();
	            //System.out.println(cat);
	           
	      
	            	Category.add(cat);
	            	
	        
	           
				index++;
	          
	        }

	         
	        else {
	           //System.out.println("Ignoring line");
	        }
	        
	       
	         }   catch(java.lang.NumberFormatException e){
	        	
	   }
	    }

	    for(int k=0;k<Category.size();k++){
	    		boolean isDistinct = false;
	    			for(int l=0;l<k;l++){
	    				if(Category.get(k).equals(Category.get(l))){
	    					
	    					isDistinct = true;
	    					break;
	    					}
	    			}
	    			if(!isDistinct){
	    				Distinct.add(Category.get(k));
	    				//System.out.print(Category.get(k)+" ");
	    			}
	    }
//////////////////////////////////////////////////////////////////////////////   
	    Collections.sort(Distinct);
	    for(int i=0; i<Distinct.size(); i++){
	       // System.out.println(Distinct.get(i));
	    	}
	    System.out.println("Category"+"		"+"Total"+"		"+"Average");
	    System.out.println("------------------------------------------------------------");
	for(int j=0;j<Distinct.size();j++)
	{
		
		for(int i=0;i<Techlist.size();i++)
		{	
			Double value=Techlist.get(i).getContent();
			if(Techlist.get(i).getCategory().equals(Distinct.get(j)))
				{
					sum=sum+value;
					count++;
        	
				}
	  
		}
		Average=sum/count;
		//System.out.println(Distinct.get(j)+"			"+sum+"		"+Average);
		//System.out.format("%32s%10f%16f", Distinct.get(j), sum, Average);
		System.out.format("%20s"+"%15f"+"$"+"%15f"+"$"+"%n",Distinct.get(j), sum, Average);
	
	
		
	
	
		sum=0;
		count=0;
		Average=0;
	}

//////////////////////////////////////////////////////////////////////////////
		    reader.close();}
		}
		 
		
        catch (IOException io) {

           io.printStackTrace();

       }
			
	
	    
	     


	     
		//Testing Purposes		
			
    
   
	         
			 
		
	}
}

	



