package com.skyMill.objectNavigation.util;

import java.util.ArrayList;

public class MoveFactory extends OperationConstans implements InstructionsConstants {

	private ArrayList<String> directionList = new ArrayList<String>();
	private String[][] board;
	private String[][] location;

	public String getDirection(String currentDirection, String move) {
		String dir = currentDirection;

		if (move.equalsIgnoreCase(left)) {
			try {
				dir = directionList.get(directionList.indexOf(currentDirection) + 1);
			} catch (IndexOutOfBoundsException e) {
				dir = directionList.get(directionList.indexOf(currentDirection) - 3);
			}
		} else if (move.equalsIgnoreCase(right)) {
			try {
				dir = directionList.get(directionList.indexOf(currentDirection) - 1);
			} catch (IndexOutOfBoundsException e) {
				dir = directionList.get(directionList.indexOf(currentDirection) + 3);
			}
		}
		return dir;
	}

	public void setDirection() {
		directionList.add(north);
		directionList.add(west);
		directionList.add(south);
		directionList.add(east);
	}

	public String creatObjectNavigation(int wide, int deep, int xStart, int yStart, String direction) {

		board = new String[wide][deep];
		location = new String[wide][deep];

		if (xStart < 0 || xStart > wide || yStart < 0 || yStart > deep) {
			System.out.println("Error: invalid inputs. Object's Initial location is out of the border");
			inputError = true;
			errorReport = "Error: invalid inputs. Initial location of the Object is out of the Matrix border";
		}

		String finalLocation = "";
		if (!inputError) {
			System.out.println("Stdin are: " + wide + " " + deep + " " + xStart + " " + yStart + " " + direction);

			String navigation = navigationPlan.toUpperCase();

			char stepDirection = ' ';

			for (int i = 0; i < navigation.length(); i++) {
				stepDirection = navigation.charAt(i);

				try {
					switch (stepDirection) {
					case forward:
						switch (direction) {
						case north:
							location[0][0] = board[xStart][yStart - 1];
							yStart = yStart - 1;
							break;
						case east:
							location[0][0] = board[xStart + 1][yStart];
							xStart = xStart + 1;
							break;
						case south:
							location[0][0] = board[xStart][yStart + 1];
							yStart = yStart + 1;
							break;
						case west:
							location[0][0] = board[xStart - 1][yStart];
							xStart = xStart - 1;
							break;

						default:
						}
						break;

					case backward:
						switch (direction) {
						case north:
							location[0][0] = board[xStart][yStart + 1];
							yStart = yStart + 1;
							break;
						case east:
							location[0][0] = board[xStart - 1][yStart];
							xStart = xStart - 1;
							break;
						case south:
							location[0][0] = board[xStart][yStart - 1];
							yStart = yStart - 1;
							break;
						case west:
							location[0][0] = board[xStart + 1][yStart];
							xStart = xStart + 1;
							break;

						default:
						}

						break;
					default:
						direction = getDirection(direction, Character.toString(navigation.charAt(i)));
					}

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Error: invalid command. Object can not move further");
					inputError = true;
					errorReport = "Error: invalid command. Object can not move further";
					xStart = -1;
					yStart = -1;
					direction = "";
				}
			}

			System.out.println("Object location is: " + xStart + " " + yStart + " " + direction);

			finalLocation = xStart + " " + yStart + " " + direction;
		}
		return finalLocation;
	}

	public static String calculate_Report() {
		MoveFactory move = new MoveFactory();
		move.setDirection();
		String calculationResult = null;

		if (inputError != true) {
			try {
				return move.creatObjectNavigation(roomWide, roomDeep, objectWideLocation, objectDeepLocation,
						directionCommand);
			} catch (NullPointerException err) {
				err.getLocalizedMessage();
			}
		}

		return calculationResult;
	}

}
