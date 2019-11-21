package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaDespegar extends JFrame{
	public JPanel panelPrincipal;
	ButtonMenu buttonMenu;
	public VentanaDespegar() {
		//setTitle("DESPEGAR");
		this.setSize(1000, 450); //Ancho y largo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE); //CERRAR EN LA VENTANA 
		setTitle("Despegar");
		//setLocation(100, 460);
		setLocationRelativeTo(null);// ESTABLECEMOS EL CENTRO DE LA PANTALLA
		setMinimumSize(new Dimension(200,50)); //minima dimencion de la pantalla
		this.getContentPane().setBackground(Color.white);
	
		setLayout(new GridLayout(3, 1));
		JLabel icono = new JLabel();
		ImageIcon logo = new ImageIcon("Resources/logo.png");
		icono.setBounds(10, 10,271 , 136);
		icono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_SMOOTH)));// escalar la imagen
		
		this.getContentPane().add(icono);
		//JLabel accommodation4= new JLabel("alojamiento",SwingConstants.CENTER); 
		panelMenu();
		JLabepanellMENU(); 
		setVisible(true);
	}
	private void panelPrincipal() {
		panelPrincipal.setSize(800, 100);
		panelPrincipal.setLayout(new GridLayout(2, 1));
		panelMenu();
		//JLabepanellMENU();
		
	}
	private void panelMenu() {
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		
		GridLayout gridLayout = new GridLayout(1, 9);
		gridLayout.setHgap(5);//espacio entre botton;
		panel1.setLayout(gridLayout);
	
		panel1.setLayout(new GridLayout(1, 10));
		
		JButton accommodation=  new ButtonMenu("alojamiento","Resources/alojamientos.png").getButton();
		
		//accommodation.setSize(10,10);
		JButton flights= new ButtonMenu("vuelos","Resources/vuelos.png").getButton(); 	
		JButton packages=  new ButtonMenu("paquetes","Resources/paquetes.png").getButton(); 
		JButton invatible= new ButtonMenu("invatible","Resources/invatible.png").getButton(); 		
		JButton escapadas= new ButtonMenu("escapadas","Resources/escapadas.png").getButton(); 
		JButton actividades= new ButtonMenu("actividades","Resources/actividades.png").getButton(); 
		JButton carros=  new ButtonMenu("carros","Resources/carros.png").getButton();
		JButton disney=new ButtonMenu("Disney","Resources/disney.png").getButton();
		JButton seguros= new ButtonMenu("Seguros","Resources/seguros.png").getButton();
		JButton tranlados= new ButtonMenu("Translados","Resources/tranlados.png").getButton();
		
		
		panel1.add(accommodation);
		panel1.add(flights);
		panel1.add(packages);
		panel1.add(invatible);
		panel1.add(escapadas);
		panel1.add(actividades);
		panel1.add(carros);
		panel1.add(disney);
		panel1.add(seguros);
		panel1.add(tranlados);
		//panel1.setLayout(null);
		//panel1.setBounds(1, 1,600, 100);
		//this.panelPrincipal.add(panel1);
		panel1.setBackground(Color.blue);
		panel2.setBackground(Color.black);
		panel1.setSize(20, 20);		//panel2.add(panel1);
		panel2.add(panel1,BorderLayout.CENTER);
		panel2.add(disney);
		this.getContentPane().add(panel2);
	}
	private JButton ButtonMenu() {
		// TODO Auto-generated method stub
		return null;
	}
	public void JLabepanellMENU() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 10));
		
		JLabel accommodation= new JLabel("alojamiento",SwingConstants.CENTER); 
		JLabel flights= new JLabel("vuenlos",SwingConstants.CENTER); 
		JLabel packages= new JLabel("paquetes",SwingConstants.CENTER); 
		JLabel invatible= new JLabel("invatible",SwingConstants.CENTER); 
		JLabel escapadas= new JLabel("escapadas",SwingConstants.CENTER); 
		JLabel actividades= new JLabel("actividades",SwingConstants.CENTER); 
		JLabel carros=new JLabel("carros",SwingConstants.CENTER); 
		JLabel disney= new JLabel("disney",SwingConstants.CENTER); 
		JLabel seguros=new JLabel("seguros",SwingConstants.CENTER); 
		JLabel tranlados= new JLabel("translados",SwingConstants.CENTER); 
		
		accommodation.setFont(new Font("aria",Font.PLAIN,12)); 
		flights.setFont(new Font("aria",Font.PLAIN,12)); 
		packages.setFont(new Font("aria",Font.PLAIN,12)); 
		invatible.setFont(new Font("aria",Font.PLAIN,12)); 
		escapadas.setFont(new Font("aria",Font.PLAIN,12)); 
		carros.setFont(new Font("aria",Font.PLAIN,12)); 
		disney.setFont(new Font("aria",Font.PLAIN,12)); 
		seguros.setFont(new Font("aria",Font.PLAIN,12)); 
		tranlados.setFont(new Font("aria",Font.PLAIN,12)); 
		
		accommodation.setForeground(Color.getHSBColor(232, 232, 232));
		flights.setForeground(Color.getHSBColor(232, 232, 232));
		packages.setForeground(Color.getHSBColor(232, 232, 232));
		invatible.setForeground(Color.getHSBColor(232, 232, 232));
		escapadas.setForeground(Color.getHSBColor(232, 232, 232));
		accommodation.setForeground(Color.getHSBColor(232, 232, 232));
		carros.setForeground(Color.getHSBColor(232, 232, 232));
		disney.setForeground(Color.getHSBColor(232, 232, 232));
		seguros.setForeground(Color.getHSBColor(232, 232, 232));
		tranlados.setForeground(Color.getHSBColor(232, 232, 232));
		
		panel1.add(accommodation);
		panel1.add(flights);
		panel1.add(packages);
		panel1.add(invatible);
		panel1.add(escapadas);
		panel1.add(carros);
		panel1.add(disney);
		panel1.add(seguros);
		panel1.add(tranlados);
		//this.panelPrincipal.add(panel1);
		this.getContentPane().add(panel1);
	}
	
}
