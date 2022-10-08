package Hangman;

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class LivesLeftPanel extends JPanel{
	private String word;
	public LivesLeftPanel(String word) {
		this.word = word;
		System.out.println(word);
	}

	
	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;
		g2D.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g2D.setColor(Color.BLUE);
		g2D.fillRect(0, 0, getWidth(), getHeight());
		g2D.setColor(Color.BLACK);
		String text = "6 lives left";
		g2D.drawString(text, 450-g2D.getFontMetrics().stringWidth(text), 60);
		int x = 0;
		for(int i = 0; i<word.length(); i++) {
			g2D.drawString("__", x+=50, 100);
		}
	}
}