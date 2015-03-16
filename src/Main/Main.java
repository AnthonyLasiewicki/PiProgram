package Main;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
	private static final long serialVersionUID = 650884965169115918L;
	public static final String NAME = "Pi Program ALPHA";
	public static final int WIDTH = 640;
	public static final int HEIGHT = 400;
	public static final Color BACKGROUND = Color.WHITE;
	
	private Menu menu = new Menu();
	private QuizMenu quiz = new QuizMenu();
	private NotesMenu notesMenu = new NotesMenu();
	public static CardLayout cL = new CardLayout();
	public static JPanel panelContain = new JPanel();
	
	public Main(){
		super(NAME);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Main.WIDTH, Main.HEIGHT);
		setResizable(false);
		
		///////////////adding components//////////////////////////
		
		panelContain.setLayout(cL);
		panelContain.add(menu, "1");	panelContain.add(quiz, "2");
		panelContain.add(notesMenu, "3");	panelContain.add(QuizMenu.qu1, "4");
		panelContain.add(QuizMenu.qu2, "5");	panelContain.add(QuizMenu.qu3, "6");
		panelContain.add(QuizMenu.qu4, "7");	panelContain.add(QuizMenu.qu5, "8");
		panelContain.add(NotesMenu.no0, "9");	panelContain.add(NotesMenu.no1, "10");
		panelContain.add(NotesMenu.no2, "11");	panelContain.add(NotesMenu.no3, "12");
		panelContain.add(NotesMenu.no4, "13");
		add(panelContain);		
	
		cL.show(panelContain, "1");			
	}	
		
	public static void main(String[] args){
		Main window = new Main();
		window.setVisible(true);
		
	}
	
}