package com.skyMill.objectNavigation.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.skyMill.objectNavigation.gui.Helper.AppearanceHelper;

public class InitialObjectLocationPanel implements GuiConstants{

	JPanel panel = new JPanel();
//	String[] directions = { "North", "East", "South", "West" };
//	JComboBox<String> navigations = new JComboBox<String>(directions);
//	JLabel iniDir = new JLabel("Initial direction");
	
	public JPanel initialLocationLayout() {
		enterWide2.setPreferredSize(new Dimension (60,30));
		enterDeep2.setPreferredSize(new Dimension (60,30));
		
		wideLable2.setFont(AppearanceHelper.setCustomFont());
		deepLabel2.setFont(AppearanceHelper.setCustomFont());
		iniDir.setFont(AppearanceHelper.setCustomFont());
		
		TitledBorder border = AppearanceHelper.setCustomBorder("Initial Robot Location");
	    panel.setBorder(border);
		
		panel.setLayout(new GridLayout(3,3));
		
		panel.add(wideLable2);
		panel.add(enterWide2);
		panel.add(deepLabel2);
		panel.add(enterDeep2);
		
		panel.add(iniDir);
		panel.add(navigations);
		
		return panel;
	}

}
