import java.util.Scanner;


public class NewSwitchNumber {

	public static void main(String[] args) {

		//create scanner to accept input from user - declare variables
		Scanner scanner = new Scanner(System.in);
		int myNumber;
		int newNumber = 0;

		//output request for integer from user
		System.out.println("Enter an integer value : ");

		myNumber = scanner.nextInt();

		scanner.close();

		//loop through number
		while (myNumber != 0) {
			//multiply newNumber by 10 and add last digit 
			newNumber = newNumber * 10 + myNumber % 10;
			
			//drop last digit by dividing by 10
			myNumber = myNumber / 10;
		}

		System.out.println("Your new number : " + newNumber);
	}

}
