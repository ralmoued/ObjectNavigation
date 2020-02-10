package com.skyMill.objectNavigation.gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public interface GuiConstants {

	// Room Size
	JLabel wideLable1 = new JLabel("Wide");
	JLabel deepLabel1 = new JLabel("Deep");
	JTextField enterWide1 = new JTextField();
	JTextField enterDeep1 = new JTextField();

	// Initial Object direction
	JLabel wideLable2 = new JLabel("Wide");
	JLabel deepLabel2 = new JLabel("Deep");
	JTextField enterWide2 = new JTextField();
	JTextField enterDeep2 = new JTextField();
	String[] directions = {"N", "E", "S", "W" };
	JComboBox<String> navigations = new JComboBox<String>(directions);
	JLabel iniDir = new JLabel("Initial direction");

	// Navigation Control
	JButton right = new JButton("Right #3");
	JButton left = new JButton("Left #4");
	JButton forward = new JButton("Forward #1");
	JButton backward = new JButton("Backward #2");
	JButton clear_dir = new JButton("Clear directions");
	JLabel navigationInstructionText = new JLabel("Navigation Instruction: ");
	JLabel navigationInstruction = new JLabel("");

	//Report
	JLabel roportText = new JLabel("Report: ");
	JLabel  roport = new JLabel("");
	JLabel  errorRoport = new JLabel("");
//	JTextArea  errorRoport = AppearanceHelper.setCustomAreaText();
	JButton claculate = new JButton("Calculate  #0");
	JButton clear_all = new JButton("Clear All");
}
