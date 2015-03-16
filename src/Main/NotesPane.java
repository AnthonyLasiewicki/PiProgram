package Main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NotesPane extends JPanel{
	private static final long serialVersionUID = 8742426358498798736L;
	
	private JButton menuBack = new JButton("Back to Notes Menu");
	private JTextArea textArea;
	private GridBagConstraints gbc = new GridBagConstraints();
	
	public NotesPane(String noteContent){
		setBackground(Main.BACKGROUND);
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(10,10,10,10);
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.weightx = 0;
		gbc.weighty = .5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		menuBack.addActionListener(e -> Main.cL.show(Main.panelContain, "3"));
		add(menuBack, gbc);
		
		gbc.gridy = 1;
		gbc.weighty = 1;
		textArea = new JTextArea(noteContent);
		add(textArea, gbc);
		
		
	}
}
