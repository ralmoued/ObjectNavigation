package com.skyMill.objectNavigation.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.skyMill.objectNavigation.gui.Helper.AppearanceHelper;

public class ReportPanel implements GuiConstants{

	JPanel panel = new JPanel();
//	JLabel roportText = new JLabel("Report: ");
//	JLabel roport = new JLabel();
//	JButton claculate = new JButton ("Calculate");
//	JButton clear_all = new JButton ("Clear");
	
	
	public JPanel reportLayout() {
		claculate.setPreferredSize(new Dimension (100,40));
		clear_all.setPreferredSize(new Dimension (100,40));
		roportText.setFont(AppearanceHelper.setCustomFont());
		roport.setFont(AppearanceHelper.setCustomFont());
		roport.setForeground(AppearanceHelper.setCustomColor());
		errorRoport.setForeground(AppearanceHelper.setCustomErrorColor());
		
		TitledBorder border = AppearanceHelper.setCustomBorder("Final Location");
	    panel.setBorder(border);
	    
	    JPanel internalPanel = new JPanel();	    
	    internalPanel.add(roportText);
	    internalPanel.add(roport);
	    internalPanel.add(errorRoport);
		
	    panel.setLayout(new GridLayout(4,2));
	    
		panel.add(internalPanel);
		panel.add(claculate);
		panel.add(clear_all);
		
		return panel;
	}
}