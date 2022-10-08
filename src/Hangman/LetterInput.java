package Hangman;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Color;

public class LetterInput extends JPanel implements KeyListener{
	private String letter;
	public LetterInput() {
		setBackground(Color.RED);
		this.letter = "";
		addKeyListener(this);
		requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		letter=String.valueOf(e.getKeyChar());
	}
	@Override
	public void paint(java.awt.Graphics g) {
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
	
}
