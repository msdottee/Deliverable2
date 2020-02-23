import java.util.Scanner;

public class MessageEncoder {

    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);

	int checksum = 0;
	String message = "";

	System.out.print("What is your message?");
	String input = scnr.next();

	scnr.close();

	input = input.toUpperCase();
	System.out.print("Your encoded message is ");
	for (int i = 0; i < input.length(); i++) {
	    char character = input.charAt(i);
	    int inum = character - 64;
	    String numString = Integer.toString(inum);
	    message = message + numString;
	    checksum = checksum + character;
	    if (i < input.length() - 1) {
		message = message + "-";
	    }
	}
	System.out.println(message);
	System.out.print("Message checksum is " + checksum);
    }

}
