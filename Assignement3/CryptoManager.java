package ASSIGNMENT3;

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		for(int i=0; i < plainText.length(); i++) {
			if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND)
				return false;
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
	public static String encryptCaesar(String plainText, int key) {
		//convert the string to an array of characters
		char[] charArray = plainText.toCharArray(); 
		
		//If the result is out of bounds, subtract the upper bound until it is in range
		for(int i = 0; i < charArray.length; i++) {
			charArray[i]+=key;
		}
		//put them back in bounds
		charArray = Check(charArray);
		
		//Convert the character array back to a string
		String str = new String(charArray);
		return str;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		int num = 0;
		String str ="";
		while (str.length()!=plainText.length()) {
			str +=bellasoStr.charAt(num);
			num++;
			if (num == bellasoStr.length()) {
				num =0;
			}
		}
		String encrypt="";
		for(int i=0;i<plainText.length();i++) {
			int num1 =plainText.charAt(i)+str.charAt(i);
			if(num1>UPPER_BOUND){ 
				while(num1>UPPER_BOUND) {
					num1-=RANGE;
				}
			}
			encrypt += (char)num1;
		}
		return encrypt;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		//convert the string to an array of characters
		char[] Array = encryptedText.toCharArray(); 
		for(int i = 0; i < Array.length; i++) {
			Array[i]-=key;
		}
		//put them back in bounds
		Array = Check(Array);
		
		//Convert the character array back to a string
		String str = new String(Array);
		return str;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		int num = 0;
		String str ="";
		while (str.length()!=encryptedText.length()) {
			str +=bellasoStr.charAt(num);
			num++;
			if (num == bellasoStr.length()) {
				num =0;
			}
		}
		String decrypted="";
		for(int i=0;i<encryptedText.length();i++) {
			int num1 =encryptedText.charAt(i)-str.charAt(i);
			if(num1<LOWER_BOUND){ 
				while(num1<LOWER_BOUND) {
					num1+=RANGE;
				}
			}
			decrypted += (char)num1;
		}
		return decrypted;
	}
	//This constructor check if the bounds are correct if not this will put them in bounds
	public static char[] Check(char[] Array) {
		for (int i = 0; i < Array.length; i++) {
			while(Array[i] < LOWER_BOUND) {
				Array[i]+=RANGE; 
			}
			while(Array[i] > UPPER_BOUND) {
				Array[i]-=RANGE; 
			}
		}
		return Array;
	}
}
