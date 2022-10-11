package Hangman;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Color;

public class LetterInput extends JPanel implements KeyListener{
	private String letter;
	private LivesLeftPanel userSpace;
	public LetterInput() {
		this.letter = "";
		addKeyListener(this);
		requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		letter=String.valueOf(e.getKeyChar());
		System.out.println(letter);
		this.update(getGraphics());
	}
	
	@Override
	public void paint(java.awt.Graphics g) {
		//erase
		g.setColor(Color.PINK);
		g.fillRect(0,0,getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawString(letter, 50, 50);
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void setLivesPanel(LivesLeftPanel theActualPanel) {
		//sets inputed letter in LetterInput/Hangman to one of the spaces in livesLeftPanel
		this.userSpace = livesLeft;
		
	}
	
}
