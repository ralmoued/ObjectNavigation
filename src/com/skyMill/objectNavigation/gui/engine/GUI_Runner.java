package com.skyMill.objectNavigation.gui.engine;

import com.skyMill.objectNavigation.gui.GuiConstants;
import com.skyMill.objectNavigation.impl.NavigactionControl_Factory;
import com.skyMill.objectNavigation.impl.Report_Factory;
import com.skyMill.objectNavigation.impl.Object_Ini_Location_Factory;
import com.skyMill.objectNavigation.impl.RoomSize_Factory;

public class GUI_Runner implements GuiConstants{

//	private static GUI_Factory guiFactory = new GUI_Factory();
	
public static void main(String args[]) {
	GUI_Factory guiFactory = new GUI_Factory();
	guiFactory.look_and_feel();
	guiFactory.creatGUI();

//		clear_dir.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				navigationInstruction.setText("");
//				// navigationInstruction.setText(null); //or use this
//			}
//		});
	
	try {
		
	RoomSize_Factory.setRoomDimension();
	Object_Ini_Location_Factory.setIntital_Location();
	NavigactionControl_Factory.navigationControl();
	Report_Factory.finalReport();
	
	}catch(Exception e) {
		e.getStackTrace();
	}
		

	}
}