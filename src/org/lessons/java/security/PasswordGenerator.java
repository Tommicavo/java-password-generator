package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write your first name: ");
		String firstName = in.nextLine();
		
		System.out.println("Write your last name: ");
		String lastName = in.nextLine();
		
		System.out.println("Write your favourite color: ");
		String favColor = in.nextLine();
		
		System.out.println("Write your birth date");
		System.out.println("Year: ");
		int year = Integer.valueOf(in.nextLine());
		System.out.println("Month: ");
		int month = Integer.valueOf(in.nextLine());
		System.out.println("Day: ");
		int day = Integer.valueOf(in.nextLine());
		
		in.close();
		
		int sumDate = year + month + day;
		
		String password = firstName + "-" + lastName + "-" + favColor + "-" + sumDate;
		System.out.println("Your password is: " + password);
	}
}
