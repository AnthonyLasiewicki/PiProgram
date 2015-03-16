package Main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuizQuestions extends JPanel{
	private static final long serialVersionUID = -4115751162886984159L;
	
	private JLabel text;
	private JRadioButton radio1, radio2, radio3, radio4;
	private JButton acceptButton = new JButton("Submit Answer");
	private JButton quizMenuBut = new JButton("Back to Quiz Menu");
	private ButtonGroup group = new ButtonGroup();
	private GridBagConstraints gbc = new GridBagConstraints();
	
	public QuizQuestions(String questionText, String option1, String option2, String option3, String option4, int correctAnswer){
		setBackground(Main.BACKGROUND);
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(10, 10, 10 , 10);
		
		////make components////
		gbc.anchor = GridBagConstraints.WEST;
		radio1 = new JRadioButton(option1, false);
		radio2 = new JRadioButton(option2, false);
		radio3 = new JRadioButton(option3, false);
		radio4 = new JRadioButton(option4, false);
		text = new JLabel(questionText);
		
		///row 1////
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(text, gbc);
		
		gbc.gridy = 1;
		add(radio1, gbc);
		gbc.gridy = 2;
		add(radio2, gbc);
		gbc.gridy = 3;
		add(radio3, gbc);
		gbc.gridy = 4;
		add(radio4, gbc);
		gbc.gridy = 5;
		
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);
		
		acceptButton.addActionListener(e -> {
			switch(correctAnswer){
			case 1:
				if(radio1.isSelected()){
					JOptionPane.showMessageDialog(null, "You are correct! ", "Correct!", JOptionPane.PLAIN_MESSAGE);					
				}else if(radio2.isSelected() || radio3.isSelected() || radio4.isSelected()){
					JOptionPane.showMessageDialog(null, "Sorry, you are incorrect. ", "Incorrect", JOptionPane.PLAIN_MESSAGE);
				}
				break;
			case 2:
				if(radio2.isSelected()){
					JOptionPane.showMessageDialog(null, "You are correct! ", "Correct!", JOptionPane.PLAIN_MESSAGE);					
				}else if(radio1.isSelected() || radio3.isSelected() || radio4.isSelected()){
					JOptionPane.showMessageDialog(null, "Sorry, you are incorrect. ", "Incorrect", JOptionPane.PLAIN_MESSAGE);
				}
				break;
			case 3:
				if(radio3.isSelected()){
					JOptionPane.showMessageDialog(null, "You are correct! ", "Correct!", JOptionPane.PLAIN_MESSAGE);					
				}else if(radio2.isSelected() || radio1.isSelected() || radio4.isSelected()){
					JOptionPane.showMessageDialog(null, "Sorry, you are incorrect. ", "Incorrect", JOptionPane.PLAIN_MESSAGE);
				}
				break;
			case 4:
				if(radio4.isSelected()){
					JOptionPane.showMessageDialog(null, "You are correct! ", "Correct!", JOptionPane.PLAIN_MESSAGE);					
				}else if(radio2.isSelected() || radio3.isSelected() || radio1.isSelected()){
					JOptionPane.showMessageDialog(null, "Sorry, you are incorrect. ", "Incorrect", JOptionPane.PLAIN_MESSAGE);
				}
				break;			
			}			
			
		});
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(acceptButton, gbc);
		
		gbc.gridy = 4;
		quizMenuBut.addActionListener(e -> Main.cL.show(Main.panelContain, "2"));
		add(quizMenuBut, gbc);
	}
}
