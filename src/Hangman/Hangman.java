package Hangman;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.io.IOException;

public class Hangman extends JFrame implements MouseListener, KeyListener{
	private int lives;
	private JPanel component;
	private EastPanel EP;
	private String word;
	
	public Hangman() throws IOException {
		lives =7;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(2000, 2000);
		setLayout(new BorderLayout());
		addMouseListener(this);
		addKeyListener(this);
		
		EP= new EastPanel();
		add(EP, BorderLayout.EAST);
		EP.setPreferredSize(new Dimension (500,2000));
		
		
		
//		livesLeft = new JLabel();
//		livesLeft.setText(l + " lives left");
//		livesLeft.setBounds(850, 10, 100, 50);
//		add(livesLeft);
		
		
		
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		//l-=1;
		//livesLeft.setText(l + " lives left");
		
		
		Graphics2D g2D = (Graphics2D) g;
		
		//draw base of hangman
		g2D.drawLine(25, 900, 225, 900);
		//draw hangman pole
		g2D.drawLine(125, 900, 125, 70);
		//draw hangman pole
		g2D.drawLine(125, 70, 325, 70);
		//draw hangman pole
		g2D.drawLine(325, 70, 325, 130);
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
