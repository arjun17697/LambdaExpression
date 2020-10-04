package com.bridgelabz.user;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface RegexValidator {
	boolean validate(String x, String y);
}

public class UserRegis {
	static Scanner sc = new Scanner(System.in);

	
	//LambdaExpression
	static RegexValidator validate = (x, y) -> {
		Pattern pattern = Pattern.compile(x);
		Matcher matcher = pattern.matcher(y);
		return pattern.matcher(y).matches();
		
	};

	// Method to validate first and last name
	private static void validateFirstName(String fname) {

		boolean f = validate.validate("^[A-Z][a-z]{2,}$", fname);
		{
			if (f) {
				System.out.println("Entered name is valid");
			} else {
				System.out.println("Entered name is invalid");
			}

		}
	}

	// Method to validate email
	public static void validateEmail(String mail) {

		boolean m = validate.validate(
				"\\\"^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$\\\"",
				mail);
		if (m) {
			System.out.println("Entered email is valid");
		} else {
			System.out.println("Entered Email is Invalid");
		}

	}

	// Method to validate mobile
	private static void validatemobile(String mobile) {

		boolean mob = validate.validate("^[1-9][0-9]\\s[1-9][0-9]{9}", mobile);
		if (mob) {
			System.out.println("Entered number is valid");
		} else {
			System.out.println("Entered Mobile Number Invalid ");
		}

	}

	// Method to validate password
	private static void validatepassword(String password) {

		boolean pass = validate.validate("^[1-9][0-9]\\s[1-9][0-9]{9}", password);
		if (pass) {
			System.out.println("Entered password is valid");
		} else {
			System.out.println("Password entered is Invalid ");

		}

	}

	public static void main(String[] args) {
		// First Name input
		System.out.println("Please enter first name");
		String fname = sc.next();
		validateFirstName(fname);

		// Last Name Input
		System.out.println("Please enter last name");
		fname = sc.next();
		validateFirstName(fname);

		// Email input
		System.out.println("Please enter email");
		String mail = sc.next();
		validateEmail(mail);

		// Mobile Number Input
		System.out.println("Please enter mobile number");
		String mobile = sc.next();
		validatemobile(mobile);

		// Password Input
		System.out.println("Please enter password");
		String password = sc.next();
		validatepassword(password);

	}

}