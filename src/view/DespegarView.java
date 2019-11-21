package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DespegarView  extends JFrame{
	
	public void DespegarView()  {
		//this.setSize(720, 800); //Ancho y largo de la ventana
		//setDefaultCloseOperation(EXIT_ON_CLOSE); //CERRAR EN LA VENTANA 
		//setTitle("Despegar");
		//setLocation(500, 360);
		//setLocationRelativeTo(null);// ESTABLECEMOS EL CENTRO DE LA PANTALLA
		//setMinimumSize(new Dimension(200,50)); //minima dimencion de la pantalla
		//this.getContentPane().setBackground(Color.white);
		//setLayout(new BorderLayout());
		//add(new VentanaDespegar(),BorderLayout.NORTH);
		//VentanaDespegar ventana= new VentanaDespegar();
		//ventana.setVisible(true);
		//this.getContentPane().add(ventana);
		//setLayout(new GridLayout(2, 1));
	
	}
	public static void main(String[] args) {
		DespegarView despegarView =new DespegarView();
		//despegarView.setVisible(true);
		//Ventana ventana =new Ventana();
		// JOptionPane.showMessageDialog();
		VentanaDespegar ventana= new VentanaDespegar();
		ventana.setVisible(true);
	}

}
