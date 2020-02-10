package com.skyMill.objectNavigation.gui;


import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.skyMill.objectNavigation.gui.Helper.AppearanceHelper;

public class NavigationControlPanel implements GuiConstants{

	private JPanel panel = new JPanel();

	public JPanel navigationControlLayout() {
		right.setPreferredSize(new Dimension (100,40));
		left.setPreferredSize(new Dimension (100,40));
		forward.setPreferredSize(new Dimension (100,40));
		backward.setPreferredSize(new Dimension (100,40));
		clear_dir.setPreferredSize(new Dimension (100,40));
		navigationInstructionText.setFont(AppearanceHelper.setCustomFont());
		navigationInstruction.setFont(AppearanceHelper.setCustomFont());
		navigationInstruction.setForeground(AppearanceHelper.setCustomColor());
		
		TitledBorder border = AppearanceHelper.setCustomBorder("Navigation Control");
	    panel.setBorder(border);
	    
//	    JPanel internalPanel1 = new JPanel();	
	    
	    JPanel northPanel = new JPanel();
	    JPanel midPanel = new JPanel();
	    JPanel southPanel = new JPanel();
	    
	    northPanel.add(forward);
	    midPanel.add(left);
	    midPanel.add(right);
	    southPanel.add(backward);
	    
   
//	    internalPanel1.setLayout(new GridLayout(3,3, 0,5));
//	    internalPanel1.add(northPanel);
//	    internalPanel1.add(midPanel);
//	    internalPanel1.add(southPanel);
	    
//	    internalPanel.add(backward);
//	    internalPanel.add(left);
//	    internalPanel.add(forward);
//	    internalPanel.add(right);
	    
		
	    JPanel internalPanel2 = new JPanel();	
	    internalPanel2.add(navigationInstructionText);
	    internalPanel2.add(navigationInstruction);
	    
	    
	    panel.setLayout(new GridLayout(5,3));
	    
	    panel.add(northPanel);
	    panel.add(midPanel);
	    panel.add(southPanel);
//	    panel.add(internalPanel1);
	    panel.add(internalPanel2);
		panel.add(clear_dir);
		
		return panel;
	}
}
