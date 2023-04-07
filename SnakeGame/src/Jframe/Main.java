package Jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class Main {
	


	public static void main(String[] args) {
	JFrame tela = new JFrame();
	int altura = 700;
	int largura = 700;
	int areaTotal = altura*largura;
	
	JPanel configuracao =  new JPanel() {
		  @Override
		  protected void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    
		    g.setColor(Color.white);
		    g.setFont(new Font("Verdana", Font.BOLD, 15));
		    g.drawString("JakeLine", largura/2, altura/2);
		    
		    this.setBackground(Color.black);
		    
		  }
	};
	
	tela.add(configuracao);
	

	
	
	
	
	
	tela.setTitle("Tela");
	tela.setVisible(true);
	tela.setSize(largura, altura);
	tela.setResizable(false);
	tela.setLocationRelativeTo(null);
	}

}
