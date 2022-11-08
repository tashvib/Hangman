package Hangman;

import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Color;

public class LetterInput extends JPanel implements KeyListener{
	private String letter;
	private LivesLeftPanel llp;
	private JFrame jframe;
	private ArrayList<String> wordBank;
	
	public LetterInput(LivesLeftPanel p, JFrame jf) {
		jframe = jf;
		llp = p;
		wordBank = new ArrayList<String>();
		this.letter = "";
		addKeyListener(this);
		requestFocus();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	
	}
	
	@Override
	public void paint(java.awt.Graphics g) {
		int x = 0;
		int y = 0;
		//erase
		g.setColor(Color.PINK);
		g.fillRect(0,0,getWidth(), getHeight());
		g.setColor(Color.BLACK);
		/*x+=30;
		if(x>400) {
			x = 50;
			y+=50;
		}
		g.drawString(letter, x+50, y+50);*/
		//for loop that runs each time user presses key, ini that for lo
		for(int i = 0;i<wordBank.size(); i++) {
			g.drawString((wordBank.get(i)), x, y);
			System.out.println(wordBank.get(i));
			x+=30;
			if(x>400) {
				x = 50;
				y+=50;
			}
		}
		g.drawString(letter, x+50,y+50);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_ENTER) {
			wordBank.add(letter);
			llp.compareWordandInput(letter, jframe);
			return;
		}
		letter=String.valueOf(e.getKeyChar());
		System.out.println(letter);
		this.update(getGraphics());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public String getLetter() {
		return letter;
	}
	
}
