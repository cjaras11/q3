package com.cimb.assignment.q3;

import java.util.Scanner;

public class Q3Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter staircase amount.");
		String staircaseAmount = scanner.nextLine();
		
		scanner.close();
		
		try {
			new Q3Application().process(staircaseAmount);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private void process(String staircaseAmount) throws Exception {
		
		validateData(staircaseAmount);
		
	}
	
	private void validateData(String staircaseAmount) throws Exception {
		
		if (staircaseAmount == null || staircaseAmount.isBlank()) {
			System.out.println("Staircase Amount cannot empty.");
			throw new Exception("Invalid Data.");
		}
		
		int iStaircaseAmount = 0;
		
		try {
			iStaircaseAmount = Integer.parseInt(staircaseAmount);
		} catch (NumberFormatException e) {
			System.out.println("Staircase Amount must be a number.");
			throw e;
		}
		
		if (iStaircaseAmount < 1 || iStaircaseAmount > 45) {
			System.out.println("Staircase Amount must be a number between 1 and 45.");
		}
	}

}
