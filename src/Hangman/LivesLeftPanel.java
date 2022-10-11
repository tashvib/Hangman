package Hangman;

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class LivesLeftPanel extends JPanel{
	private String word;
	private String[] wordChars;
	private String[] display;
	String theLetter;
	int indexToBeChanged;
	public LivesLeftPanel(String word) {
		this.word = word;
		System.out.println(word);
		wordChars = this.word.split("");
		this.display = new String[this.word.length()]; //display is an empty array
		for(int x = 0; x<word.length(); x++) {
			display[x] = "__";
		}
	}

	
	@Override
	public void paint(Graphics g2D)
	{
		g2D.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g2D.setColor(Color.BLUE);
		g2D.fillRect(0, 0, getWidth(), getHeight());
		g2D.setColor(Color.BLACK);
		//String text = "6 lives left";
		//g2D.drawString(text, 450-g2D.getFontMetrics().stringWidth(text), 60);
		int x = 0;
		for(int i = 0; i<word.length(); i++) {
			g2D.drawString(display[i], x+=50, 100);
		}
		
	}
	public void compareWordandInput(String theLetter) {
		for(int x =0; x<word.length(); x++) {
			if(wordChars[x].equals(theLetter)) {
				display[x] = theLetter;
			}
		}
	}
	
}