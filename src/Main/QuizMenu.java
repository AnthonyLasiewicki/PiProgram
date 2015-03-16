package Main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class QuizMenu extends JPanel{
	private static final long serialVersionUID = 7974355254377870074L;
	
	JButton menuBack = new JButton("Back to Main Menu");
	private GridBagConstraints gbc = new GridBagConstraints();
	
	private JButton q1 = new JButton("Question 1");
	private JButton q2 = new JButton("Question 2");
	private JButton q3 = new JButton("Question 3");
	private JButton q4 = new JButton("Question 4");
	private JButton q5 = new JButton("Question 5");
	
	static QuizQuestions qu1 = new QuizQuestions("The reciprocal of cos is ", "A. csc", "B. sec", "C. arccos", "D. cot", 2);
	static QuizQuestions qu2 = new QuizQuestions("What quadrant is π / 2 in?", "A. Quadrant 1", "B. Quadrant 2", "C. Quadrant 3", "None of the above", 4);
	static QuizQuestions qu3 = new QuizQuestions("What is equivalent to sin(x) * sec(x)?", "A. cos(x)", "B. cot(x)", "C. tan(x)", "csc(x)", 3);
	static QuizQuestions qu4 = new QuizQuestions("What is tan(arcsin(4/5))?", "A. 3/5", "B. 4/3", "C. 3/4", "D. 2/5", 2);
	static QuizQuestions qu5 = new QuizQuestions("<html>What is the maximum displacement for a wave<br> described by the function: y=7sin(x-(π/2))?</html>",
			"A. 7", "B. 2π", "C. π", "D. 1", 1);
	
	
	public QuizMenu(){
		setBackground(Main.BACKGROUND);
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(10,10,10,10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 3;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		
		menuBack.addActionListener(e -> Main.cL.show(Main.panelContain, "1"));
		add(menuBack, gbc);
		
		q1.addActionListener(e -> Main.cL.show(Main.panelContain, "4"));
		q2.addActionListener(e -> Main.cL.show(Main.panelContain, "5"));
		q3.addActionListener(e -> Main.cL.show(Main.panelContain, "6"));
		q4.addActionListener(e -> Main.cL.show(Main.panelContain, "7"));
		q5.addActionListener(e -> Main.cL.show(Main.panelContain, "8"));
		gbc.weighty = 1;
		gbc.gridy = 1;
		add(q1, gbc);
		gbc.gridy = 2;
		add(q2, gbc);
		gbc.gridy = 3;
		add(q3, gbc);
		gbc.gridy = 4;
		add(q4, gbc);
		gbc.gridy = 5;
		add(q5, gbc);		
	}	
}