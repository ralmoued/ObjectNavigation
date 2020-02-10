package com.skyMill.objectNavigation.gui.Helper;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class AppearanceHelper {

	public static TitledBorder setCustomBorder(String title) {
		TitledBorder border = new TitledBorder(title);
		border.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		border.setTitleJustification(TitledBorder.LEFT);
		border.setTitlePosition(TitledBorder.TOP);
		border.setTitleColor(Color.BLUE);
		border.setTitleFont(new Font("Arial", Font.CENTER_BASELINE, 14));
		
		return border;
	}
	
	public static Font setCustomFont() {
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 14);
		return font;
	}
	
	public static Color setCustomColor() {
		Color color = Color.blue;
		return color;
	}
	
	public static Color setCustomErrorColor() {
		Color color = Color.red;
		return color;
	}
	
	public static JTextArea setCustomAreaText() {
		JTextArea textArea = new JTextArea(2, 20);
		textArea.setWrapStyleWord(true);
//	    textArea.setLineWrap(true);
	    textArea.setOpaque(false);
	    textArea.setEditable(false);
	    textArea.setFocusable(false);
	    textArea.setBackground(UIManager.getColor("Label.background"));
	    textArea.setFont(UIManager.getFont("Label.font"));
	    textArea.setBorder(UIManager.getBorder("Label.border"));
	    
	    return textArea;
	}
}
