package com.skyMill.objectNavigation.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.skyMill.objectNavigation.gui.GuiConstants;
import com.skyMill.objectNavigation.util.MoveFactory;
import com.skyMill.objectNavigation.util.OperationConstans;

public class Report_Factory extends OperationConstans implements GuiConstants {

	public static void finalReport() {

		claculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				report = MoveFactory.calculate_Report();
				if (inputError != true) {
					roport.setText(report);
					errorRoport.setText("");
					errorReport = "";
				}else {
					report = "";
					roport.setText(report);
					errorRoport.setText(errorReport);
					errorReport = "";
					inputError = false;
				}

			}
		});

		clear_all.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWide1.setText("");
				enterDeep1.setText("");
				enterWide2.setText("");
				enterDeep2.setText("");
				navigations.setSelectedIndex(0);
				navigationInstruction.setText("");
				roport.setText("");
				errorRoport.setText("");

				navigationPlan = "";
				try {
				roomWide =  null;
				roomDeep = 0;
				objectDeepLocation = 0;
				objectWideLocation = 0;
				}catch(NullPointerException err) {
					err.getLocalizedMessage();
				}
				directionCommand = "";
				report = "";
				errorReport = "";
				inputError = false;
			}
		});
	}
}
