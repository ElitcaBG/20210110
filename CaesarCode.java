import java.util.Locale;
import java.util.Scanner;

public class CaesarCode {

	public static String crypt(int n, String word) {
		char [] letters =word.toCharArray();
        for(int i=0;i<letters.length;i++){ 
        	int ascii = (int)letters[i];
        	ascii = ascii+n;
        	letters[i]=(char)ascii;
        	}
        	word= word.copyValueOf(letters);
        	System.out.println(word.toUpperCase());
        	return word;
	}
	public static String decrypt(int n, String word) {
		char [] letters =word.toCharArray();
		for(int i=0;i<letters.length;i++){ 
        	int ascii = (int)letters[i];
        	ascii = ascii-n;
        	letters[i]=(char)ascii;
        	
        }
        word= word.copyValueOf(letters);
        System.out.println(word.toUpperCase());
        return word;
		
	} 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
		String word;
		System.out.println("Напишете съответната дума: ");
		word= in.next();
		int n;
		System.out.println("Въведете броя позиции: ");
		n = in.nextInt();
		word = crypt( n, word); 
		decrypt(n,word);
        
	}

}
