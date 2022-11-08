package Hangman;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Color;
import java.io.IOException;

public class EastPanel extends JPanel{
	private LivesLeftPanel livesLeft;
	private LetterInput LI;
	public EastPanel(JFrame jf) throws IOException{
		GenerateWord thing = new GenerateWord();
		String word = thing.getAnswer();
		this.setLayout(new GridLayout(2, 1));
		this.setBackground(Color.PINK);
		livesLeft = new LivesLeftPanel(word);
		add(livesLeft);
		LI = new LetterInput(livesLeft, jf);
		add(LI);
		
	}
	public LetterInput getLI() {
		return LI;
	}
	public LivesLeftPanel getlivesLeft() {
		return livesLeft;
	}
}
