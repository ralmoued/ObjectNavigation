package com.skyMill.objectNavigation.gui.engine;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.skyMill.objectNavigation.gui.InitialObjectLocationPanel;
import com.skyMill.objectNavigation.gui.NavigationControlPanel;
import com.skyMill.objectNavigation.gui.ReportPanel;
import com.skyMill.objectNavigation.gui.RoomSizePanel;

public class GUI_Factory{

	public void look_and_feel() {
		// Windows Look & feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

	
	public void creatGUI() {
		JFrame frame = new JFrame("Object Navigation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 1000);
//		JButton button1 = new JButton("Press");

		RoomSizePanel rs = new RoomSizePanel();
		InitialObjectLocationPanel ir = new InitialObjectLocationPanel();
		NavigationControlPanel navi = new NavigationControlPanel();
		ReportPanel rp = new ReportPanel();

		JPanel internalPanel = new JPanel();
		internalPanel.setLayout(new GridLayout(2, 2));
		internalPanel.add(rs.roomSizeLayout());
		internalPanel.add(ir.initialLocationLayout());

		frame.setLayout(new GridLayout(3, 3));
//		frame.getContentPane().add(rs.roomSizeLayout());
//		frame.getContentPane().add(ir.initialLocationLayout());
		frame.getContentPane().add(internalPanel);
		frame.getContentPane().add(navi.navigationControlLayout());
		frame.getContentPane().add(rp.reportLayout());
//		frame.pack();
		frame.setVisible(true);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
	}
	
}