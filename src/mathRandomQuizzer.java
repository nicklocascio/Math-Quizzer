import java.util.Scanner;

public class mathRandomQuizzer
	{
	public static void main(String[] args) throws InterruptedException
		{
		// Just ask about questions in sets of four
		// Also figure out the last part concerning feedback
		// What's up with question four and do I need to have that counter be less? 
		// What is the math process for question four?
		Scanner introduction = new Scanner(System.in);
		System.out.println("Today you will be quizzed on the Math.random() method. You will be quizzed in sets of four questions. How many sets would you like to complete?");
		int numberOfQuestions = introduction.nextInt();
		int counter = 0;
		int counter2 = 0;
		for(int i = 0; i < numberOfQuestions; i++)
			{
			int range = (int)(Math.random() * 10) + 1;
			int range2 = (int)(Math.random() * 10) + 1;
			int generate1 = (int)(Math.random() * 10) + 1;
			int generate2 = (int)(Math.random() * 10) + 1;
			Scanner answer = new Scanner(System.in);
			System.out.println("Given: int randomNumber = (int)(Math.random() * " + range2 + ") + " + range + ", what is the lower number in the range?");		
			int userAnswer = answer.nextInt();
			if(userAnswer == range)
				{
				System.out.println("Correct!");	
				counter ++;
				counter2++;
				}
			else
				{
				System.out.println("I'm sorry but that's wrong.");
				counter ++;
				}
			Scanner answer2 = new Scanner(System.in);
			System.out.println("What is the higher number in the range?");
			int userAnswer2 = answer2.nextInt();
			if(userAnswer2 == (range2-1) + range)
				{
				System.out.println("Correct!");
				counter ++;
				counter2++;
				}
			else
				{
				System.out.println("I'm sorry but that's wrong.");	
				counter ++;
				}
			Scanner answer3 = new Scanner(System.in);
			System.out.println("If you want to generate numbers between " + generate2 + " and " + generate1 + ", what would you put for x: int randomNumber = (int)(Math.random() * y) + __x__?");			
			int userAnswer3 = answer3.nextInt();
			if(userAnswer3 == generate2)
				{
				System.out.println("Correct!");
				counter ++;
				counter2++;
				}
			else
				{
				System.out.println("I'm sorry but that's wrong.");
				counter ++;
				}
			Scanner answer4 = new Scanner(System.in);
			System.out.println("What would you put for y: int randomNumber = (int)(Math.random() * __y__ ) + x ?");
			int userAnswer4 = answer4.nextInt();
			if(userAnswer4 == (generate1 - 1) - generate2)
				{
				System.out.println("Correct!");
				counter ++;
				counter2++;
				}
			else
				{
				System.out.println("I'm sorry but that's wrong.");	
				counter ++;
				}
			}	
		int numberOfQuestionsRight = counter2 / counter;
		if(counter2 == 1)
			{
			System.out.println("You answered " + counter2 + " question right out of " + counter + ". You might need to practice a little bit more.");
			}
		else
			{
			System.out.println("You answered " + counter2 + " questions right out of " + counter + ".");
			if(numberOfQuestionsRight > 0.5)
				{
				System.out.println("You got it! It can't hurt to keep practicing like a college student, though.");
				}
			else if(numberOfQuestionsRight <= 0.5)
				{
				System.out.println("You might need a little bit more practice.");
				}
			}
		}
	}
