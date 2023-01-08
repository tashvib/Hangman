package Hangman;

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
/**
 * This class draws the answer to the hangman and computes the lives left.
 *
 */
public class LivesLeftPanel extends JPanel{
	private String word;
	private String[] wordChars;
	private String[] display;
	private int amntOfLives;
	public final int MAX_LIVES = 7;
	/**
	 * Takes in a word to perform operations on.
	 * @param word
	 */
	public LivesLeftPanel(String word) {
		this.word = word;
		this.amntOfLives = MAX_LIVES;
		System.out.println(word);
		wordChars = this.word.split(""); //Splits each character of the word into a String[].
		this.display = new String[this.word.length()]; //Display is an empty array.
		for(int x = 0; x<word.length(); x++) { //Fills display[] with blank spaces.
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
		String text = amntOfLives +" lives left";
		g2D.drawString(text, 450-g2D.getFontMetrics().stringWidth(text), 60);
		int x = 0;
		for(int i = 0; i<word.length(); i++) {
			g2D.drawString(display[i], x+=50, 100);
		}
		
	}
	public boolean gameWon() {
		for(int x = 0; x<display.length; x++) {
			if(display[x].equals("__" )) {
				return false;
			}
		}
		return true;
	}
	public boolean compareWordandInput(String theLetter, JFrame jf) {
		boolean tfValue = false;
		for(int x =0; x<word.length(); x++) {
			if(wordChars[x].equals(theLetter)) {
				display[x] = theLetter;
				tfValue = true;
				
			}
			//discrete mathematics!! explain w/test cases 
		}
		if(gameWon()) {
			JFrame loseWindow = new JFrame();
			JLabel youWin = new JLabel("YOU WIN!");
			loseWindow.add(youWin);
			loseWindow.setSize(500, 500);
			loseWindow.setVisible(true);
		}
		if(!tfValue) {
			amntOfLives--;
			if(amntOfLives==0) {
				JFrame loseWindow = new JFrame();
				JLabel youLose = new JLabel("YOU LOSE!");
				loseWindow.add(youLose);
				loseWindow.setSize(500, 500);
				loseWindow.setVisible(true);
			}

		}
		System.out.println("Enter detected");
		update(getGraphics()); 
		jf.repaint();
		System.out.println(tfValue);
		return tfValue;
		
	} 
	public int getAmntOfLives() {
		return amntOfLives;
	}
	
}