package com.skyMill.objectNavigation.impl;


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import com.skyMill.objectNavigation.gui.GuiConstants;
import com.skyMill.objectNavigation.util.OperationConstans;

public class Object_Ini_Location_Factory extends OperationConstans implements GuiConstants {

	public static void setIntital_Location() {

		enterWide2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				try {
					objectWideLocation = Integer.parseInt(enterWide2.getText());
				} catch (NumberFormatException error) {
					error.getMessage();
					errorReport = "Error: Enter digit only";
					inputError = true;
				}
				System.out.println("Object X Location: " + objectWideLocation);
				System.out.println("InputError of X Location: " + inputError);
			}
		});

		enterDeep2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				try {
					objectDeepLocation = Integer.parseInt(enterDeep2.getText());
				} catch (NumberFormatException error) {
					error.getMessage();
					errorReport = "Error: Enter digit only";
					inputError = true;
				}
				System.out.println("Object Y Location: " + objectDeepLocation);
				System.out.println("InputError of Y Location: " + inputError);
			}
		});

		navigations.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				try {
					directionCommand = String.valueOf(navigations.getSelectedItem());
				} catch (NumberFormatException error) {
					error.getMessage();
					
				}
				System.out.println("Navi: " + directionCommand);
			}
		});

	}

}
