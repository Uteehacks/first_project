
package computerassistedinstruction2;
import java.util.Scanner;
import java.util.Random;

public class ComputerAssistedInstruction2
{
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	
	static int answerCount;
	static int correctCount;
	
	public static void main(String[] args)
	{
		System.out.println("\nWelcome to the Computer-Assisted Instruction Program");
		System.out.println("Type <Ctrl> C at any time to quit.");
		
		boolean isChoiceValid = false;
		int noOfDigits = 0;
		int operation;
		
		while(!isChoiceValid)
		{
			System.out.println();
			System.out.println("1. Single digit");
			System.out.println("2. Two digit");
			System.out.println("3. Three digit");
			System.out.print("Choose a difficulty level: ");
			noOfDigits = input.nextInt();
			
			if(noOfDigits < 1 || noOfDigits > 3)
				System.out.println("Wrong choice.");
			else
				isChoiceValid = true;
		}
		
		isChoiceValid = false;
		while(!isChoiceValid)
		{
			System.out.println();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Random");
			System.out.print("Choose an arithmetic type: ");
			operation = input.nextInt();
			
			if(operation < 1 || operation > 5)
				System.out.println("Wrong choice.");
			else
			{
				isChoiceValid = true;
				while(true)
					generateQuestion(noOfDigits, operation);
			}
		}
	}
	
	public static void generateQuestion(int noOfDigits, int operation)
	{
		int num1 = 0;
		int num2 = 0;
		int correctAnswer = 0;
		
		switch(noOfDigits)
		{
			case 1:
				num1 = 1 + rand.nextInt(9);
				num2 = 1 + rand.nextInt(9);
				break;
			
			case 2:
				num1 = 1 + rand.nextInt(99);
				num2 = 1 + rand.nextInt(99);
				break;
				
			case 3:
				num1 = 1 + rand.nextInt(999);
				num2 = 1 + rand.nextInt(999);
				break;
		}
		
		if(operation == 5)
		{
			operation = 1 + rand.nextInt(4);
		}
		switch(operation)
		{
			case 1:
				correctAnswer = num1 + num2;
				System.out.printf("\nHow much is %d plus %d? ", num1, num2);
				break;
				
			case 2:
				correctAnswer = num1 - num2;
				System.out.printf("\nHow much is %d minus %d? ", num1, num2);
				break;
				
			case 3:
				correctAnswer = num1 * num2;
				System.out.printf("\nHow much is %d times %d? ", num1, num2);
				break;
				
			case 4:
				correctAnswer = num1 / num2;
				System.out.printf("\nHow much is %d divided by %d? ", num1, num2);
				break;
		}
		
		int answer = input.nextInt();
		answerCount++;
		
		int correctResponse;
		int incorrectResponse;
		
		while(answer != correctAnswer)
		{
			incorrectResponse = 1 + rand.nextInt(4);
			
			switch(incorrectResponse)
			{
				case 1:
					System.out.print("No, please try again: ");
					break;
				case 2:
					System.out.print("Wrong. Try once more: ");
					break;
				case 3:
					System.out.print("Don't give up!: ");
					break;
				case 4:
					System.out.print("No. Keep trying: ");
					break;
			}
			answer = input.nextInt();
			answerCount++;
		}
		
		if(answer == correctAnswer)
		{
			correctResponse = 1 + rand.nextInt(4);
			correctCount++;
			
			switch(correctResponse)
			{
				case 1:
					System.out.println("Very good!");
					break;
				case 2:
					System.out.println("Excellent!");
					break;
				case 3:
					System.out.println("Nice work!");
					break;
				case 4:
					System.out.println("Keep up the good work!");
					break;
			}
		}
		
		if(answerCount >= 10)
		{
			double percentage = (double)correctCount / answerCount * 100;
			
			if(percentage >= 75)
				System.out.println("\n***Congratulations, you are ready to go to the next level!***");
			else
				System.out.println("\n***Please ask your teacher for extra help.***");
			
			answerCount = 0;
			correctCount = 0;
		}
	}
}


