package Main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel{
	private static final long serialVersionUID = -2347361785713406926L;
	
	private JButton noteButton = new JButton("       Notes       ");
	private JButton quizButton = new JButton("   Quiz Questions   ");
	private GridBagConstraints gbc = new GridBagConstraints();
	
	ImageIcon title = new ImageIcon(getClass().getResource("PiProjectTitle.png"));
	JLabel picPanel = new JLabel(title);
	
	public Menu(){
		setBackground(Main.BACKGROUND);
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(10,10,10,10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.CENTER;
				
		add(picPanel, gbc);
		
		noteButton.addActionListener(e -> Main.cL.show(Main.panelContain, "3"));
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridy = 1;
		gbc.weighty = 0.1;
		add(noteButton, gbc);
		
		quizButton.addActionListener(e -> Main.cL.show(Main.panelContain, "2"));
		gbc.gridy = 2;
		gbc.weighty = 0.1;
		add(quizButton, gbc);
				
	}	
}
