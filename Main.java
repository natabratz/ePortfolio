import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean running = true;
		boolean finished = false;
		boolean begin = true;
		
		String mode = "";
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		
		while(running) {
		
		if(begin) {
		mode = scan.nextLine();
		//begin = false;
		}
		
		//STANDARD CALCULATOR
		if(mode.equalsIgnoreCase("Standard")) {
			begin = false;
			boolean valid = false;
			char operand = 'n';
			
			do {
				
				System.out.println("\nEnter \'+\' for addition, \'-\' for subtraction, \'*\' for multiplication, \'/\' for division: ");
				String standardOperation = scan.nextLine();
				
				if(standardOperation.equals("+")) {
					 valid = true;
					 operand = '+';
					 break;
					 
				} //ADDITION
				
				else if(standardOperation.equals("-")) {
					valid = true;
					operand = '-';
					break;
					
				} //SUBTRACTION
				
				else if(standardOperation.equals("*")) {
					valid = true;
					operand = '*';
					break;
					
				} //MULTIPLICATION
				
				else if(standardOperation.equals("/")) {
					valid = true;
					operand = '/';
					break;
					
				} //DIVISION
			
				else {System.out.println("Invalid operation entered");}
				
			} while (!valid); //END OF DO WHILE LOOP: DETERMINE OPERATION
		
			int howMany = 0;
			
			switch(operand) {
			
			case '+': //ADDITION
				System.out.println("\nHow many numbers do you want to add: ");
				howMany = scan.nextInt();
				double sum = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				for(int i = 0; i < howMany; ++i) {
					double newNumber = scan.nextDouble();
					sum += newNumber;
				}
				
				System.out.println("Result: " + sum);
				finished = true;
				break;
				
			case '-': //SUBTRACTION
				System.out.println("How many numbers do you want to subtract: ");
				howMany = scan.nextInt();
				double sum2 = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				
				double newNumber2 = scan.nextDouble();
				sum2 = newNumber2;
				
				if(howMany > 1) {
					int howMany2 = howMany - 1;
					
					for(int i = 0; i < howMany2; ++i) {
						newNumber2 = scan.nextDouble();
						sum2 -= newNumber2;
					}
				
				}
				System.out.println("Result: " + sum2);
				finished = true;
				break;
				
			case '*': //MULTIPLICATION
				System.out.println("How many numbers do you want to multiply: ");
				howMany = scan.nextInt();
				double sum3 = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				
				double newNumber3 = scan.nextDouble();
				sum3 = newNumber3;
				
				if(howMany > 1) {
					int howMany2 = howMany - 1;
				
					for(int i = 0; i < howMany2; ++i) {
						newNumber3 = scan.nextDouble();
						sum3 *= newNumber3;
					}
					
				}
				System.out.println("Result: " + sum3);
				finished = true;
				break;
				
			case '/': //DIVISION
				System.out.println("How many numbers do you want to divide: ");
				howMany = scan.nextInt();
				double sum4 = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				
				double newNumber4 = scan.nextDouble();
				sum4 = newNumber4;
				
				if(howMany > 1) {
					int howMany2 = howMany - 1;
				
					for(int i = 0; i < howMany2; ++i) {
						newNumber4 = scan.nextDouble();
						sum4 /= newNumber4;
					}
					
				}
				System.out.println("Result: " + sum4);
				finished = true;
				break;
				
			} //END OF SWITCH STATEMENT
			
		} //END OF STANDARD MODE
			
		else if(mode.equalsIgnoreCase("Scientific")) {
			begin = false;
			boolean valid = false;
			char operand = 'n';
			
			do {
				
				System.out.println("Enter \'+\' for addition, \'-\' for subtraction, \'*\' for multiplication, \'/\' for division, \'sin\' for sin x, \'cos\' for cos x, \'tan\' for tan x: ");
				String scientificOperation = scan.nextLine();
				
				if(scientificOperation.equals("+")) {
					valid = true;
					operand = '+';
					break;
				}
				
				else if(scientificOperation.equals("-")) {
					valid = true;
					operand = '-';
					break;
				}
				
				else if(scientificOperation.equals("*")) {
					valid = true;
					operand = '*';
					break;
				}
				
				else if(scientificOperation.equals("/")) {
					valid = true;
					operand = '/';
					break;
				}
				
				else if(scientificOperation.equals("sin")) {
					valid = true;
					operand = 's';
					break;
				}
				
				else if(scientificOperation.equals("cos")) {
					valid = true;
					operand = 'c';
					break;
				}
				
				else if(scientificOperation.contentEquals("tan")) {
					valid = true;
					operand = 't';
					break;
				}
				
				else {System.out.println("Invalid operation entered");}
				
			} while (!valid); //END OF DO WHILE LOOP: DETERMINE OPERATION
		
			int howMany = 0;
			double radians = 0.0;
			
			switch (operand) {
			
			case '+':
				System.out.println("How many numbers do you want to add: ");
				howMany = scan.nextInt();
				double sum = 0;
				
				System.out.println("Enter" + howMany + " numbers: ");
				for(int i = 0; i < howMany; ++i) {
					double newNumber = scan.nextDouble();
					sum += newNumber;
				}
				
				System.out.println("Result: " + sum);
				finished = true;
				break;
				
			case '-':
				System.out.println("How many numbers do you want to subtract: ");
				howMany = scan.nextInt();
				double sum2 = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				
				double newNumber2 = scan.nextDouble();
				sum2 = newNumber2;
				
				if(howMany > 1) {
					int howMany2 = howMany - 1;
					
					for(int i = 0; i < howMany2; ++i) {
						newNumber2 = scan.nextDouble();
						sum2 -= newNumber2;
					}
					
				}
				
				System.out.println("Result: " + sum2);
				finished = true;
				break;
				
			case '*':
				System.out.println("How many numbers do you want to multiply: ");
				howMany = scan.nextInt();
				double sum3 = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				
				double newNumber3 = scan.nextDouble();
				sum3 = newNumber3;
				
				if(howMany > 1) {
					int howMany2 = howMany - 1;
				
					for(int i = 0; i < howMany2; ++i) {
						newNumber3 = scan.nextDouble();
						sum3 *= newNumber3;
					}
					
				}
				System.out.println("Result: " + sum3);
				finished = true;
				break;
				
			case '/':
				System.out.println("How many numbers do you want to divide: ");
				howMany = scan.nextInt();
				double sum4 = 0;
				
				System.out.println("Enter " + howMany + " numbers: ");
				
				double newNumber4 = scan.nextDouble();
				sum4 = newNumber4;
				
				if(howMany > 1) {
					int howMany2 = howMany - 1;
					
					for(int i = 0; i < howMany2; ++i) {
						newNumber4 = scan.nextDouble();
						sum4 /= newNumber4;
					}
					
				}
				System.out.println("Result: " + sum4);
				finished = true;
				break;
				
			case 's':
				System.out.println("Enter number in radians to find sin: ");
				radians = scan.nextDouble();
				double sinx = Math.sin(radians);
				
				System.out.println("Result: " + sinx);
				finished = true;
				break;
				
			case 'c':
				System.out.println("Enter number in radians to find cos: ");
				radians = scan.nextDouble();
				double cosx = Math.cos(radians);
				
				System.out.println("Result: " + cosx);
				finished = true;
				break;
				
			case 't':
				System.out.println("Enter number in radians to find tan: ");
				radians = scan.nextDouble();
				double tanx = Math.tan(radians);
				
				System.out.println("Result: " + tanx);
				finished = true;
				break;
			
			} // END OF SWITCH STATEMENT
			
		} //END OF SCIENTIFIC MODE
		
		if(finished) {
			System.out.println("Start over? Y/N");
			String startOver = scan.next();
			
				if(startOver.equalsIgnoreCase("Y")) {
					finished = false;
					begin = true;
					running = true;
					System.out.println("Enter the calculator mode: Standard/Scientific?");
					continue;
				}
			
				else if (startOver.equalsIgnoreCase("N")){
					break;}
				
			} //END OF IF STATEMENT: FINISHED?
		
		}//END OF WHILE LOOP: RUN PROGRAM
		
	} //END OF MAIN CLASS
} //END OF PROJECT
