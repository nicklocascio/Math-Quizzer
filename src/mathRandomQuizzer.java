import java.util.Scanner;

public class mathRandomQuizzer
	{
	static int range = (int)(Math.random() * 50) + 1;
	public static void question()
		{
		System.out.println("Given: int randomNumber = (int)(Math.random() * " + range + ") + 1, what is the range of the generated numbers?");
		}
	public static void question2()
		{
		System.out.println();
		}
	public static void main(String[] args)
		{
		Scanner introduction = new Scanner(System.in);
		System.out.println("Today you will be quizzed on the Math.random() method. How many questions would you like to complete?");
		int numberOfQuestions = introduction.nextInt();
//		Scanner agree/disagree ADD LATER
//		System.out.println("You want to answer " + numberOfQuestions + "questions. Correct?");
		Scanner answer = new Scanner(System.in);
		for(int i = 0; i < numberOfQuestions; i++)
			{
			question();
			int userAnswer = answer.nextInt();
			if(userAnswer == 1 - range)
				{
				System.out.println("Correct!");
				}
			else
				{
				System.out.println("I'm sorry but that's wrong. Keep practicing!");
				}
			}
		Scanner answer2 = new Scanner(System.in);
		
		}
	}
