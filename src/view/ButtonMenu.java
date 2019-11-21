package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ButtonMenu {
	private JButton button;
	public ButtonMenu(String text, String imgRuta) {
		this.button= new JButton(new ImageIcon(imgRuta));
		this.button.setText(text);
		//this.button.setBounds(2, 2, 50, 50);
	//	ImageIcon logo = new ImageIcon(text);
		
		//this.button.setIcon(new ImageIcon(logo.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH)));// escalar la imagen
		this.button.setVerticalTextPosition(SwingConstants.BOTTOM);
		this.button.setHorizontalTextPosition(SwingConstants.CENTER);
		this.button.setBackground(Color.white);
		this.button.setFont(new Font("aria",Font.PLAIN,12)); 
		this.button.setForeground(Color.getHSBColor(232, 232, 232));
		
		
		

	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
}
