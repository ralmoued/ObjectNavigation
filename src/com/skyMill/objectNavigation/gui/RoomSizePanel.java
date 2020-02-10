package com.skyMill.objectNavigation.gui;


import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.skyMill.objectNavigation.gui.Helper.AppearanceHelper;

public class RoomSizePanel implements GuiConstants{

	JPanel panel = new JPanel();
//	JLabel wideLable = new JLabel("Wide");
//	JLabel deepLabel = new JLabel("Deep");
//
//	JTextField enterWide = new JTextField();
//	JTextField enterDeep = new JTextField();

	public JPanel roomSizeLayout() {
		
		TitledBorder border = AppearanceHelper.setCustomBorder("Room Size");
	    panel.setBorder(border);
	    panel.setBorder(border);
	    
		enterWide1.setPreferredSize(new Dimension (60,30));
		enterDeep1.setPreferredSize(new Dimension (60,30));
		
		wideLable1.setFont(AppearanceHelper.setCustomFont());
		deepLabel1.setFont(AppearanceHelper.setCustomFont());
		
		panel.setLayout(new GridLayout(2,2));
		panel.add(wideLable1);
		panel.add(enterWide1);
		panel.add(deepLabel1);
		panel.add(enterDeep1);
		return panel;
	}

}
