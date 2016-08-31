import java.util.Scanner;

public class mathRandomQuizzer
	{
	static int range = (int)(Math.random() * 10) + 1;
	static int range2 = (int)(Math.random() * 10) + 1;
	static int generate1 = (int)(Math.random() * 10) + 1;
	static int generate2 = (int)(Math.random() * 10) + 1;
	// take outside and add/subtract from inside thing
	public static void question()
		{
		System.out.println("Given: int randomNumber = (int)(Math.random() * " + range2 + ") + " + range + ", what is the lower number in the range?");
		}
	public static void question2()
		{
		System.out.println("What is the higher number in the range?");
		}
	public static void question3()
		{
		System.out.println("If you want to generate numbers between " + generate2 + " and " + generate1 + ", what would you put in the blank of: int randomNumber = (int)(Math.random() * __x__) + y?");
		}
	public static void question4()
		{
		System.out.println("What would you put in this blank: int randomNumber = (int)(Math.random() * x ) + __y__ ?");
		}
	public static void main(String[] args) throws InterruptedException
		{
		Scanner introduction = new Scanner(System.in);
		System.out.println("Today you will be quizzed on the Math.random() method. You will be quizzed in sets of four questions. How many sets would you like to complete?");
		int numberOfQuestions = introduction.nextInt();
		Scanner answer = new Scanner(System.in);
		int counter = 0;
		int counter2 = 0;
		for(int i = 0; i < numberOfQuestions; i++)
			{
			question();
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
			question2();
			int userAnswer2 = answer2.nextInt();
			if(userAnswer2 == range2)
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
			question3();
			int userAnswer3 = answer3.nextInt();
			if(userAnswer3 == generate1 - generate2)
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
			question4();
			int userAnswer4 = answer4.nextInt();
			if(userAnswer4 == generate2)
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
			// I need to know how to say starting next set only if the for loop remains true
			// If you have time, try to change feedback i.e. good work or try harder based on the grade. Most likely use modulus
			// Thread.sleep(2000);	
			// Why won't it generate new numbers
			}	
		if(counter2 == 1)
			{
			System.out.println("You answered " + counter2 + " question right out of " + counter + ". You might need to practice a little bit more.");
			}
		else
			{
			System.out.println("You answered " + counter2 + " questions right out of " + counter + ".");
			if(counter2 / counter > 0.5)
				{
				System.out.println("You got it! It can't hurt to keep practicing like a college student, though.");
				}
			else if(counter2 / counter < 0.5)
				{
				System.out.println("You might need a little bit more practice.");
				}
		// new variable for math with counter
			}
		}
	}
