package com.skyMill.objectNavigation.impl;


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import com.skyMill.objectNavigation.gui.GuiConstants;
import com.skyMill.objectNavigation.util.OperationConstans;

public class RoomSize_Factory extends OperationConstans implements GuiConstants {

	public static void setRoomDimension() {

		enterWide1.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				try {
					roomWide = Integer.parseInt(enterWide1.getText());
				} catch (NumberFormatException error) {
					error.getMessage();
					inputError = true;
					errorReport = "Error: Enter digit only";
				}			
				System.out.println("Matrix X input: " + roomWide);
				System.out.println("inputError of X input: " + inputError);
			}			
	    });
		
		enterDeep1.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				try {
					roomDeep = Integer.parseInt(enterDeep1.getText());
				} catch (NumberFormatException error) {
					error.getMessage();
					errorReport = "Error: Enter digit only";
					inputError = true;
				}			
				System.out.println("Matrix Y input: " + roomDeep);
				System.out.println("InputError of Y input: " + inputError);
			}	
	    });
		
	}

}
