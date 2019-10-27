import java.util.Scanner;

//NOTE TO SELF: ALLOW PROGRAM TO ACCEPT LESS THAN SEVEN CHARS, CUT OFF AT SEVEN

public class TelephoneNumber2 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in); //scans for input
		
		//ASKS FOR USER INPUT
		System.out.println("Please enter a telephone number using letters : ");
		String userInput = scan.nextLine();
		
		//MODIFIES USER INPUT 
		String cap = userInput.toUpperCase();
		
		//CALCULATES LENGTH OF INPUT
			int count = userInput.length(); //counts length of user's input
			
		//FOR LOOP: CONVERTING LETTERS INTO NUMBERS
		for(int i = 0; i < count; ++i) {
			
			switch (cap.charAt(i)) {
				case ' ':
					cap = cap.replace(cap.charAt(i), ' ');
					break;
					
				case 'A':
				case 'B':
				case 'C':
					cap = cap.replace(cap.charAt(i), '2');
					break;
					
				case 'D':
				case 'E':
				case 'F':
					cap = cap.replace(cap.charAt(i), '3');
					break;
					
				case 'G':
				case 'H':
				case 'I':
					cap = cap.replace(cap.charAt(i), '4');
					break;
					
				case 'J':
				case 'K':
				case 'L':
					cap = cap.replace(cap.charAt(i), '5');
					break;
					
				case 'M':
				case 'N':
				case 'O':
					cap = cap.replace(cap.charAt(i), '6');
					break;
					
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					cap = cap.replace(cap.charAt(i), '7');
					break;
					
				case 'T':
				case 'U':
				case 'V':
					cap = cap.replace(cap.charAt(i), '8');
					break;
					
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					cap = cap.replace(cap.charAt(i), '9');
					break;
			} //END OF SWITCH STATEMENT
		} //END OF FOR LOOP #1
		
		//FORMATTING THE OUTPUT
		String cap2 = cap.replaceAll("\\s+", "");
		int count2 = cap2.length();
		int count3 = count2 - 1;
		
		String first = "null";
		String second = "null";
		String hyp = "-";
		String cap3 = "null";
		
		//IF THERE'S MORE THAN SEVEN CHARACTERS
		if(count2 > 7) {
			first = cap2.substring(0,3);
			second = cap2.substring(3,7);
			cap3 = first + hyp + second;
		}
		
		//IF THERE'S LESS THAN SEVEN
		else if(count2 <= 7) {	
			first = cap2.substring(0,3);
			second = cap2.substring(3, count2);
			cap3 = first + hyp + second;
		}
		
		//HYPENATING AND PRINTING
		//String cap3 = cap.substring(0,3);
		//cap3 = cap3.concat("-");
		//cap3 = cap3.concat(cap.substring(3,count3));
		System.out.println(cap3);
		
	
	} //END OF CLASS: main
} //END OF CLASS: TelephoneNumber