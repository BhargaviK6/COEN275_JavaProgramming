package ketha.assign3;


//Mani Bhargavi Ketha
//Student ID:W1186016
//COEN 275 
//Assignment 1 
//Due Date:April 15,2016
public class EncryptorDecryptor implements Encryptor {
	private String allowableChars="-,.!0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	int total_no_of_allowableCharacters=allowableChars.length();//length of allowable characters->for formula
	private int offset;//initialized in constructor
	public EncryptorDecryptor()
	{
		
	}//argless constructor
	public EncryptorDecryptor(int offset){
		this.offset=offset;
		if(offset<0 || offset>total_no_of_allowableCharacters){
			offset=1;
			System.out.println("Try again! Please enter a valid offset between 0 and 66. Offset has been set to 1.");
		}
	}//parameterized constructor
	
	public String encrypt(String plaintext){
			//int total_no_of_allowableCharacters=allowableChars.length();//length of allowable characters->for formula
			int len=plaintext.length();//length of plainstext
			StringBuilder sb=new StringBuilder();//sb to hold encrypted text
			
			
			
			for(int i=0;i<len;i++){
				char text=plaintext.charAt(i);
				int positionalValue=allowableChars.indexOf(text);
				if(positionalValue<0)
				{
					sb.append(text);
				}
				else{
				int encryptedCharacterIndex=(positionalValue + offset)% total_no_of_allowableCharacters;
				char encryptedtext=allowableChars.charAt(encryptedCharacterIndex);
				sb.append(encryptedtext);
				}
				}
		String encrypted_text=sb.toString();
		//System.out.println(encrypted_text);
		return encrypted_text;
		
	}//where does parameter plaintext come from? Initialized in DocStore?
	
	
	
	public String decrypt(String encryptedText){
		//int total_no_of_allowableCharacters=allowableChars.length();//length of allowable characters->for formula
		int elen=encryptedText.length();//length of plainstext
		StringBuilder sb1=new StringBuilder();//sb1 to hold decrypted text
		for(int k=0;k<elen;k++){
			char dtext=encryptedText.charAt(k);
			int positionalValue=allowableChars.indexOf(dtext);
			if(positionalValue<0)
			{
				sb1.append(dtext);
			}
			else{
			int decryptedCharacterIndex=(positionalValue + total_no_of_allowableCharacters - offset)% total_no_of_allowableCharacters;
			char decryptedtext=allowableChars.charAt(decryptedCharacterIndex);
			sb1.append(decryptedtext);
			}
			}
		String decrypted_text=sb1.toString();
		//System.out.println(decrypted_text);
		return decrypted_text;
		
		
		
	}
	public int getOffset(){
		return offset;
	}

}
