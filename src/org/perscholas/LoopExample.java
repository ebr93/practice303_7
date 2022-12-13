package org.perscholas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		// Question 1 Try-catch
		divide();

		// Question 2
		TypingPractice type = new TypingPractice();
		type.typeABC();
	}

	/*
	 * Question 1 Create a static void method named divide that has no parameters.
	 * Let the user input two integers and print the value of dividing the two
	 * integers. Use a try-catch block to catch an ArithmeticException and
	 * InputMismatchException. If you have an ArithmeticException print “Please do
	 * not use zero”. If you have an InputMismatch print “Please only use integers.
	 * Use a while loop and a boolean to make sure if the user inputs an
	 * ArithmeticException or InputMismatchException the program does not terminate
	 * but lets the user try again.
	 */

	public static void divide() {
		boolean loopAgain = true;
		while (loopAgain) {
			try {
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a / b);
				loopAgain = false;
			} catch (InputMismatchException ime) {
				System.out.println("Please only use integers");
				// continue;
			} catch (ArithmeticException ae) {
				System.out.println("Please do not use zero");
				// continue;
			}
		}
	}

}

/*
 * Question 2 Create a class called MyException that extends Exception. Create a
 * constructor but from the super class that will let you print out a message.
 * Create a class called TypingPractice. Create a method called typeABC. Let the
 * user type a String and if the String does not match “abc” throw new
 * MyException() with a String as a parameter that says “incorrect input”. Let
 * the user try again until they type “abc”. Don’t let the program terminate
 * after the exception is called.
 */

class MyException extends Exception {
	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}
}

class TypingPractice {

	public void typeABC() {
		String string;
		boolean loopAgain = true;

		while (loopAgain) {
			Scanner sc = new Scanner(System.in);
			string = sc.nextLine();
			if (!(string.equals("abc"))) {
				try {
					throw new MyException("incorrect input");
				} catch (MyException me) {
					System.out.println(me.getMessage());
				}
			} else {
				loopAgain = false;
				sc.close();
			}
		}
	}
}
