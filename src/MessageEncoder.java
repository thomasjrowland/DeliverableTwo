import java.util.Scanner;

public class MessageEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		String userInput;
		String codedMessage = "";
		char codeLetter;
		int codeNumber;
		int checksum = 0;
		int i;
		
		System.out.println("Please enter the message you wish to encode:");
		System.out.println("Note that non-letters and spaces will be coded as \"*\"");
		
		userInput = scnr.nextLine();
		
		for (i = 0; i <= userInput.length() - 1; ++i) {
			
			codeLetter = userInput.charAt(i);
			codeLetter = Character.toUpperCase(codeLetter);
			codeNumber = codeLetter;
			
			if (codeNumber >= 65 && codeNumber <=90) {
				codedMessage = codedMessage + String.valueOf(codeNumber - 64);
				//System.out.print(codeNumber - 64);
				checksum = checksum + codeNumber;
			}
			else {
				codedMessage = codedMessage + "*";
				//System.out.print("*");
			}
			
			if (i < userInput.length() - 1) {
				codedMessage = codedMessage + "-";
				//System.out.print("-");
			}
		}
		
		System.out.println();
		System.out.println(codedMessage);
		System.out.println();
		System.out.println("Message Checksum: " + checksum);
		System.out.println("* spaces or non-letter characters.");
		

	}

}
