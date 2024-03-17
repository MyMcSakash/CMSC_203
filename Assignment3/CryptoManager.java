/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Function for encrypting and decrypting ceaser ciphers and bellaso cipher
 * Due: 2/27/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sakash Khanna
*/


public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for (int i=0; i<plainText.length(); i++) {
			if((((int)(LOWER_RANGE))>((int)(plainText.charAt(i)))) || (((int)(UPPER_RANGE))<((int)(plainText.charAt(i)))) ) {
				return false;
			}
		}
		return true;
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		//Reassigning / Setting Values
		int temp;
		String finalizedEncryption="";
		
		//checking if plainText is in range
		if(!(isStringInBounds(plainText))) {
			return "The selected string is not in bounds, Try again.";
		}//if

		//for loop for creating a string.
		for (int i=0; i<plainText.length(); i++) {
			//establishing ascii numbers combined
			temp=((int)(plainText.charAt(i)))+key;
			
			//looping so we stay in range
			while(temp>((int)(UPPER_RANGE))) {
				temp-=RANGE;
			}//while
			
			//assigning values to string
			finalizedEncryption+=""+((char)(temp));
		}//for

		//returning string
		return finalizedEncryption;
		
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		//variables
		int currentLength=0, bellasoStrVarHolder=0, bellasoStrMax=bellasoStr.length();
		int combinedTotal, currentPlainTextVar, currentBellasoStr;
		String finalizedEncryption="";
		
		//while
		while (currentLength<plainText.length()) {
			//get currentValue
			currentPlainTextVar=((int)(plainText.charAt(currentLength)));
			currentBellasoStr=((int)(bellasoStr.charAt(bellasoStrVarHolder)));
			
			//combine both bellasoStr and plainText int ascii values
			combinedTotal=currentBellasoStr+currentPlainTextVar;
			
			//makes sure total isn't over UPPER_RANGE
			while((combinedTotal)>((int)(UPPER_RANGE))) {
				combinedTotal-=RANGE;
			}//while
			
			//assign variable
			finalizedEncryption+=""+((char)(combinedTotal));
			
			//increment
			bellasoStrVarHolder++;
			currentLength++;
			
			//if bellasoStr comes to an end
			if(bellasoStrVarHolder==bellasoStrMax) {
				bellasoStrVarHolder=0;
			}//if
		}//while
		return finalizedEncryption;
		
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		//Reassigning / Setting Values
		int temp;
		String finalizedDecryption="";
			
		//checking if encryptedText is in range
		if(!(isStringInBounds(encryptedText))) {
			return "The selected string is not in bounds, Try again.";
		}//if

		//for loop for creating a string.
		for (int i=0; i<encryptedText.length(); i++) {
			//establishing ascii numbers subtracted from key
			temp=((int)(encryptedText.charAt(i)))-key;
					
			//looping so we stay in range
			while(temp<((int)(LOWER_RANGE))) {
				temp+=RANGE;
			}//while
					
			//assigning values to string
			finalizedDecryption+=""+((char)(temp));
		}//for

		//returning string
		return finalizedDecryption;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		//variables
		int currentLength=0, bellasoStrVarHolder=0, bellasoStrMax=bellasoStr.length();
		int subtractedTotal, currentEncryptedTextVar, currentBellasoStr;
		String finalizedDecryption="";
				
				//while
		while (currentLength<encryptedText.length()) {
			//get currentValue
			currentEncryptedTextVar=((int)(encryptedText.charAt(currentLength)));
			currentBellasoStr=((int)(bellasoStr.charAt(bellasoStrVarHolder)));
					
			//subtract both bellasoStr and plainText int ascii values
			subtractedTotal=currentEncryptedTextVar-currentBellasoStr;
					
			//makes sure total isn't over UPPER_RANGE
			while((subtractedTotal)<((int)(LOWER_RANGE))) {
				subtractedTotal+=RANGE;
			}//while
					
			//assign variable
			finalizedDecryption+=""+((char)(subtractedTotal));
					
			//increment
			bellasoStrVarHolder++;
			currentLength++;
					
			//if bellasoStr comes to an end
			if(bellasoStrVarHolder==bellasoStrMax) {
				bellasoStrVarHolder=0;
			}//if
		}//while
				
		return finalizedDecryption;
	}
}
