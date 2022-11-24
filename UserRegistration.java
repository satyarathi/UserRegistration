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
			System.out.println("Invalid name, Enter again");
		}

		
	}

}
