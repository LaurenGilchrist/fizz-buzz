import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's play FizzBuzz!");
		System.out.println("Choose a number to play!");
		int number = input.nextInt();
		
		FizzBuzz play = new FizzBuzz();
		
		System.out.println(play.response(number));
		
		input.close();

	}

}
