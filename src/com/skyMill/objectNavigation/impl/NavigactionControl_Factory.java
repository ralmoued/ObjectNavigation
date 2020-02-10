package com.skyMill.objectNavigation.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.skyMill.objectNavigation.gui.GuiConstants;
import com.skyMill.objectNavigation.util.OperationConstans;

public class NavigactionControl_Factory extends OperationConstans implements GuiConstants  {

//	static String direction = "";

	public static void  navigationControl() {
		clear_dir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigationPlan = "";
				navigationInstruction.setText(navigationPlan);
			}
		});

		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigationPlan += "3";
				navigationInstruction.setText(navigationPlan);
			}
		});
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigationPlan += "4";
				navigationInstruction.setText(navigationPlan);
			}
		});
		
		forward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigationPlan += "1";
				navigationInstruction.setText(navigationPlan);
			}
		});
		
		backward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigationPlan += "2";
				navigationInstruction.setText(navigationPlan);
			}
		});

	}

}
