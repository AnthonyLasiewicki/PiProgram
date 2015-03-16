package Main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NotesMenu extends JPanel{
	private static final long serialVersionUID = -4355214869960568186L;
	
	private JButton backMenu = new JButton("   Back to Main Menu   ");
	private GridBagConstraints gbc = new GridBagConstraints();
	
	private JButton n0 = new JButton("Note #1");
	private JButton n1 = new JButton("Note #2");
	private JButton n2 = new JButton("Note #3");
	private JButton n3 = new JButton("Note #4");
	private JButton n4 = new JButton("Note #5");
	
	static String note0 = "Every trigonometric function has a reciprocal counterpart:\n"
			+ "sin - csc \ncos - sec \ntan - cot \n\nYou can find the reciprocals by dividing 1 by the coresponding trigonometric function.";
	static String note1 = "The unit circle is a very important tool in finding various angles, regardless \nof if they're in degrees or radians.";
	static String note2 = "It can sometimes be useful to put complex trigonometric functions into their basic sin and cos components.\nFor instance cot = cos / sin.";
	static String note3 = "When you take the arcsin of a fraction, you can split that fraction up and put it into a triangle.\n"
			+ "This can help in solving for that triangle.";
	static String note4 = "Simple Harmonic waves have a period and an amplitude or maximum displacement \njust like any sine wave"
			+ "You can actually describe these waves with sin and cos functions.";
	
	static NotesPane no0 = new NotesPane(note0);
	static NotesPane no1 = new NotesPane(note1);
	static NotesPane no2 = new NotesPane(note2);
	static NotesPane no3 = new NotesPane(note3);
	static NotesPane no4 = new NotesPane(note4);
	
	public NotesMenu(){
		setBackground(Main.BACKGROUND);
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(10,10,10,10);
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.weightx = 1;
		gbc.weighty = 3;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		backMenu.addActionListener(e -> Main.cL.show(Main.panelContain, "1"));
		add(backMenu, gbc);
		
		n0.addActionListener(e -> Main.cL.show(Main.panelContain, "9"));
		n1.addActionListener(e -> Main.cL.show(Main.panelContain, "10"));
		n2.addActionListener(e -> Main.cL.show(Main.panelContain, "11"));
		n3.addActionListener(e -> Main.cL.show(Main.panelContain, "12"));
		n4.addActionListener(e -> Main.cL.show(Main.panelContain, "13"));
		gbc.weighty = 1;
		gbc.gridy = 1;
		add(n0, gbc);
		gbc.gridy = 2;
		add(n1, gbc);
		gbc.gridy = 3;
		add(n2, gbc);
		gbc.gridy = 4;
		add(n3, gbc);
		gbc.gridy = 5;
		add(n4, gbc);
		
	}	
}