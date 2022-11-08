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

public class Hangman extends JFrame implements MouseListener{
	//implements MouseListener = Hangman reacts to the actions your mouse takes
	
	private JPanel component;
	private EastPanel EP;
	private String word;
	
	public Hangman() throws IOException {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(2000, 2000);
		setLayout(new BorderLayout());
		addMouseListener(this); //adds instance of MouseListener 
								//(this is an instance of MouseListener due to implements)
								//(polymorphism)
		EP= new EastPanel(this);
		add(EP, BorderLayout.EAST);
		EP.setPreferredSize(new Dimension (600,2000));
		
		addKeyListener(EP.getLI());		
		
		
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
		if(EP.getlivesLeft().getAmntOfLives() <= 6) {
			//draw head
			g2D.drawOval(290, 130, 70, 70);
		}
		if(EP.getlivesLeft().getAmntOfLives() <= 5) {
			//draw body
			g2D.drawLine(325, 200, 325, 300);
		}
		if(EP.getlivesLeft().getAmntOfLives() <= 4) {
			//draw arm
			g2D.drawLine(325, 250, 375, 200);
		}
		if(EP.getlivesLeft().getAmntOfLives() <= 3) {
			//draw arm
			g2D.drawLine(325, 250, 275, 200);
		}
		if(EP.getlivesLeft().getAmntOfLives() <= 2) {
			//draw leg
			g2D.drawLine(325, 300, 300, 370);
		}
		if(EP.getlivesLeft().getAmntOfLives() <= 1) {
			//draw leg
			g2D.drawLine(325, 300, 350, 370);
		}
		if(EP.getlivesLeft().getAmntOfLives() <= 0) {
			//draw leg
			g2D.drawOval(310, 150, 10, 10);
			g2D.drawOval(330, 150, 10, 10);
			g2D.fillArc(310, 180, 30, 20, 0, 180);
			
		}
		
	
		
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
