package ketha.assign1;
//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 1 
//Due Date:April 15,2016
public class DocStore {
	private final int capacity=7;
	private int index=0;
	
	private Document[] store=new Document[capacity];//creating an array of objects
	private EncryptorDecryptor encryptor;//initialized in the constructor

	
	public DocStore()
	{
		
	}
	public DocStore(EncryptorDecryptor enc)
	{
		 this.encryptor=enc;
	}//constructor

	
	
	public void saveDoc(Document doc){		
		int Id=doc.getdocumentId();
		String text=doc.getContent(Id);
		String encrypted_text=encryptor.encrypt(text);
		doc.setContent(encrypted_text);
		if(index > capacity-1){
			throw new ArrayIndexOutOfBoundsException("Maximum Array Space in store!!!! Please create a new object!");
			//System.out.println("Error");
			
		}
		else{
			store[index]=doc;
			index++;	
			
		}
	
	}

	public Document getDoc(int id){
		for(int i=0;i<index;i++){
			int did=store[i].getdocumentId();
			//int did=doc.getdocumentId();
			//System.out.println(did);
			//System.out.println(id);
			if(id==did){
				//store[i].getContent(id);
				//System.out.println(encrypt);
				//System.out.println(store[i]);
				//System.out.println(i); WORKING GETTING CORRECT ID==DID
				String stext=store[i].getContent(id);
				System.out.println(stext);
				return store[i];
				
				}
			else{
				System.out.println(i+" :Wrong Id. Please try again");
			}
		}
		
		return null;
	}
	
	
	public Document getDoc(int id,int key){
		//int j=0;
		for(int i=0;i<index;i++){
			int did=store[i].getdocumentId();
			int offsets=encryptor.getOffset();
			//int did=doc.getdocumentId();
			//System.out.println(did);
			//System.out.println(id);
			if(id==did){
				if(offsets==key){
				String text=store[i].getContent(id);
				String decrypted_text=encryptor.decrypt(text);
				//encryptor.decrypt(text);
				System.out.println(decrypted_text);
				//j=i;
				return store[i];
				
				}
				else{
					System.out.println("Please try again with the correct Id and key!");
				}
			}
				
				
			
		}
		
		return null;
		//return store[j];
	}

}
