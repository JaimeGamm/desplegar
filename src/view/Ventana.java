package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Ventana extends JFrame {
	public JPanel panel;
	public Ventana() {
		this.setSize(1000, 720); //Ancho y largo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE); //CERRAR EN LA VENTANA 
		//setTitle("Despegar");
		setLocation(500, 360);
		setLocationRelativeTo(null);// ESTABLECEMOS EL CENTRO DE LA PANTALLA
		setMinimumSize(new Dimension(200,200)); //minima dimencion de la pantalla
		this.getContentPane().setBackground(Color.white);
		iniciarComponentes();
	}
	private void iniciarComponentes() {
		colocarPaneles();
		colocarEtiquetas();
		colocarBotoene();
	}
	
	public void colocarBotoene() {
		JButton accommodation= new JButton(new ImageIcon("Resources/alojamientos.png"));
		accommodation.setBounds(50,150,89,48);
		accommodation.setEnabled(true);//enceder el boton
		panel.add(accommodation);

		//panel.add(accommodation,BorderLayout.WEST);
	}
	private void colocarPaneles() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		//panel.setLayout(new FlowLayout(FlowLayout.LEADING));// ordenar por direcion 
		//panel.setLayout(new FlowLayout(FlowLayout.LEADING,23,234));
		//panel.setLayout(null);
		panel.setSize(100, 200);
		//panel.setBackground(Color.BLACK);
		this.getContentPane().add(panel);// agragamos el panel a la ventana
		JLabel accommodation= new JLabel("alojamiento",SwingConstants.CENTER); // ALINIACION DE TEXTO
		//accommodation.setOpaque(true);// para activa el color de la etiqueta
		//accommodation.setBackground(Color.black);
		accommodation.setForeground(Color.getHSBColor(232, 232, 232));//color de la etiqueta
		accommodation.setFont(new Font("aria",Font.PLAIN,12)); // tipo de lectra
		accommodation.setBounds(40, 110, 100, 200);
		panel.add(accommodation);
	}
	public void colocarEtiquetas() {
		JLabel icono = new JLabel();
		ImageIcon logo = new ImageIcon("Resources/logo.png");
		icono.setBounds(10, 10,371 , 136);
		icono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));// escalar la imagen
		//JLabel icono = new JLabel(new ImageIcon("Resources/logo.png"));
		panel.add(icono);
		
	}
}
