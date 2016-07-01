package ketha.docsafe;
import ketha.assign1.*;
// Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 1 
//Due Date:April 15,2016
public class DocSafeTester {
	public static void test(){
		Encryptor ob= new EncryptorDecryptor(1);
		System.out.println("Testing individual classes:");
		System.out.println("Testing Encryptor class");
		System.out.println("Calling encrypt method to encrypt Bhargavi");
		System.out.println(ob.encrypt("Bhargavi*"));
		System.out.println("");
		System.out.println("Calling decrypt method to decrypt encrypted version of Bhargavi");
		System.out.println(ob.decrypt("Cib*shbwj"));
		System.out.println("---------------------");
		System.out.println("This will return a message saying to enter a valid  offset.");
		Encryptor ob2= new EncryptorDecryptor(70);
		ob2.encrypt("Hello");
		System.out.println("");
		System.out.println("Calling document method");
		Document ob1=new Document(1,"Bhargavi Testing");
		//System.out.println(ob1.getContent(ob1));
		System.out.println(ob1.getContent(1));
		//System.out.println(ob1.getId());
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Running usage scenario:");
		System.out.println("Testing ArryaIndexOutOfBounds exception");
		EncryptorDecryptor en=new EncryptorDecryptor(5);
		DocStore sto=new DocStore(en);
		Document doc1=new Document(2,"Bhargavi");
		Document doc2=new Document(3,"Hello");
		Document doc3=new Document(4,"Mani");
		Document doc4=new Document(5,"Ketha");
		Document doc5=new Document(6,"Varsha Pullabhotla");
		Document doc6=new Document(7,"JAVA");
//		Document doc7=new Document(8,"COEN 275");
//		Document doc8=new Document(9,"Programming");
		//System.out.println(doc1.getdocumentId());
		sto.saveDoc(doc1);
		sto.saveDoc(doc2);
		sto.saveDoc(doc3);
		sto.saveDoc(doc4);
		sto.saveDoc(doc5);
		sto.saveDoc(doc6);
//		sto.saveDoc(doc7);
//		sto.saveDoc(doc8);
		
		//System.out.println(sto.getDoc(2,5).getContent());
		System.out.println("Case 1: sto.getDoc(5); Inputting only the id. This will return only encrypted content.");
		sto.getDoc(5);
		System.out.println();
		System.out.println();
		System.out.println("Case 2: sto.getDoc(8); Inputting the wrong id and no key. This will give an error message.");
		sto.getDoc(8);
		System.out.println();
		System.out.println();
		System.out.println("Case 3: sto.getDoc(2,5); Inputting the correct id and key. This will return the correct encrypted document content!!");
		sto.getDoc(2,5);
		System.out.println();
		System.out.println();
		System.out.println("Case 4: sto.getDoc(2,2); Inputting the correct id but wrong key. This will give an error message.");
		sto.getDoc(2,2);
		System.out.println("Case 5: When the capacity of error is crossed, an exception will be thrown!");
		System.out.println();
		System.out.println();
	
		
	}
}
