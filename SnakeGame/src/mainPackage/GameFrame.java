package mainPackage;

import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
		GameFrame() {
//		 GamePanel panel = new GamePanel();  
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
	}

}
