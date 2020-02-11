package com.skyMill.objectNavigation.stdin;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skyMill.objectNavigation.util.InstructionsConstants;
import com.skyMill.objectNavigation.util.MoveFactory;
import com.skyMill.objectNavigation.util.OperationConstans;

public class Stdin extends OperationConstans implements InstructionsConstants {

	public void stdin() {

		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);

			System.out.print("Enter an Matrix X size: ");
			roomWide = input.nextInt();

			System.out.print("Enter an Matrix Y size: ");
			roomDeep = input.nextInt();

			System.out.print("Enter an Object X Position: ");
			objectDeepLocation = input.nextInt();

			System.out.print("Enter an Object Y Position: ");
			objectWideLocation = input.nextInt();

			// throw away the \n not consumed by nextInt()
			input.nextLine();

			System.out.print("Enter the Navigation Commands: ");
//		int command = 0;
//		while ((command = input.nextInt()) != 0) {
//			navigationPlan += command + "";
//			System.out.println("Enter next navigation command. Enter 0 to exit");	
//		}

			String command = "";
			while (!(command = input.nextLine()).endsWith("0")) {
				System.out.println("Enter next navigation command. Enter 0 to exit");
				navigationPlan += command;
			}

			navigationPlan += removeZerosFromCommand(command);

			if (!navigationPlan.isEmpty()) {
				navigationPlan = inputCommand(navigationPlan);
			}

			report = MoveFactory.calculate_Report();

		} catch (InputMismatchException e) {
			System.out.println("Error: invalid input. Dimensions should be digits only.");
			inputError = true;
			errorReport = "Error: invalid input. Dimensiond should be digits only. ";
		}
	}

	public String inputCommand(String command) {
		String digit = "";

		// remove any space from the string
		String inputCommand = command.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "");

		try {
			if (inputCommand.matches("[0-9]+")) {
				for (int i = 0; i < inputCommand.length(); i++) {
					digit = inputCommand.charAt(i) + "";

					if (Integer.parseInt(digit) < 0 || Integer.parseInt(digit) > 4) {
						throw new NumberFormatException("Invalid input, command should contain only digits [0-4]");
					} else {
						// My logic
					}
				}
			} else {
				throw new NumberFormatException("Invalid input, command should contain only digits [0-4]");
			}
//			System.out.println("The inputCommand is: " + inputCommand);
		} catch (NumberFormatException e) {
			System.out.println("Invalid command: " + e);
		}
		return inputCommand;
	}

	public String removeZerosFromCommand(String command) {

		// remove any zero from the string
		String inputCommand = command.replaceAll("0", "");
//		System.out.println("inputCommand is: " + inputCommand);
		return inputCommand;
	}

}
