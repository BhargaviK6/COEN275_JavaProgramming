package ketha.assign3;



//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 1 
//Due Date:April 15,2016


public class Document {
	private int documentId;
	private String content;
	//Constructor
	
	public Document(){
		
	}
	public Document(int documentId,String content){
		this.documentId=documentId;
		this.content=content;
		
	}
	//Constructor end
	public int getdocumentId(){
		return documentId;
	}


	public void setContent(String encrypted_text)
	{
		this.content=encrypted_text;
		//System.out.println(this.content);
		
		
	}
	public String getContent(int documentId){
		
			return content;
		
		
	}
	public String getDocContent(Document doc){
		
			return content;
		
		
	}
	public String getContent()
	{
		return content;
	}
	
}