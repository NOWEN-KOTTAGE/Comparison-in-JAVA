//Fig. 2.15: Comparision.java
//Compare integers using if statements, relational operators
//and equivalent operators.
 import java.util.Scanner;//program uses class Scanner
 public class Main {
//main method  begins execution
	 public static void main(String[] args) {
		 //create Scanner to obtain input from command line
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter first integer: "); //prompt
		 int number1 = input.nextInt(); //read first number from user
		 
		 System.out.println("Enter second integer: ");
		 int number2 = input.nextInt(); //read the second number from he user
		 
		 if(number1 == number2) {
			 System.out.printf("%d == %d%n", number1, number2);
	 }
		 if(number1 != number2) {
			 System.out.printf("%d != %d%n", number1, number2);
		 }
	 
		 if(number1 < number2) {
			 System.out.printf("%d < %d%n", number1, number2);
		 }
		 
		 if(number1 > number2) {
			 System.out.printf("%d > %d%n", number1, number2);
		 }
		 
		 if(number1 <= number2) {
			 System.out.printf("%d <= %d%n", number1, number2);
		 }
		 if(number1 >= number2) {
			 System.out.printf("%d >= %D%n", number1, number2);
		 }
	 
	 }//end main method
 }//end class main