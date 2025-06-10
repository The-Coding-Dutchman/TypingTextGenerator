package Main;

import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String... args){

		StringBuilder charsToLearn;
		StringBuilder alphabet = new StringBuilder("aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ");
		StringBuilder punctuation = new StringBuilder(".,");
		StringBuilder symbols = new StringBuilder("=@$%!+*&<>~_-:;|\"\'\\/");
		StringBuilder numbers = new StringBuilder("0123456789");

		HashMap<String, String> userSelection = new HashMap<>();

		Scanner userInput = new Scanner(System.in);

		System.out.println("");
		System.out.println("Welcome to the text generator. Please select all the componennts you want to test. They will be listed one by one");
		System.out.println("Continue?");
		System.out.println("Y/N");
		if(userInput.nextLine().toUpperCase() == "Y") {


		}




	}
}
