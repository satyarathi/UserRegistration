package com.user_registration;

import java .util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String fname = sc.next();
		String regex1 = "^[A-Za-z]{3,}";

		Pattern p1 = Pattern.compile(regex1);
		Matcher match1 = p1.matcher(fname);

		if (match1.matches()) {
			System.out.println("First name is correct");
		}else {
			System.out.println("Invalid name");
		}

		System.out.println("Enter last name : ");
		String lname = sc.next();
		String regex2 = "^[A-Za-z]{3,}";

		Pattern p2 = Pattern.compile(regex2);
		Matcher match2 = p2.matcher(lname);

		if (match2.matches()) {
			System.out.println("Last name is correct");
		}else {
			System.out.println("Invalid name");
		}

		System.out.println("Enter email id : ");
		String emailid = sc.next();
		String regex3 = "^[a-z]{3,}(.[a-z]*)?@([a-z]){2,}.[a-z]+(.in)*";

		Pattern p3 = Pattern.compile(regex3);
		Matcher match3 = p3.matcher(emailid);

		if (match3.matches()) {
			System.out.println("Email id is correct");
		}else {
			System.out.println("Invalid Email id");
		}

		System.out.println("Enter Mobile number : ");
		String mobilenumber = sc.next();
		String regex4 = "^(\\\\d{1,2}( )?)\\\\d{10}$";

		Pattern p4 = Pattern.compile(regex4);
		Matcher match4 = p4.matcher(mobilenumber);

		if (match2.matches()) {
			System.out.println("Mobile no is correct");
		}else {
			System.out.println("Invalid Mobile no");
		}
	
		System.out.println("Enter password : ");
		String password = sc.next();
		String regex5 = "(?=.*[A-Z])(?=.*[0-9])(?=.*[*.!@$%^&(){}[\\]:;<>,.?\\/~_+\\-=|#]).{8,}";

		Pattern p5 = Pattern.compile(regex5);
		Matcher match5 = p5.matcher(password);

		if (match5.matches()) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Invalid Password");
		}
	}

}
