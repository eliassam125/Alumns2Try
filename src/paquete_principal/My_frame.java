package paquete_principal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class My_frame {
	private  JFrame myframe= new JFrame();
	public static PanelTexto paneltexto =new PanelTexto();
	public static PanelImagen panelimagen=new PanelImagen();
	public static PanelScoreBotton panelboton = new PanelScoreBotton();	
	public My_frame(  ) {
	
	myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	myframe.setSize(1280, 720);
	myframe.setLocationRelativeTo(null);
	

	
	JPanel paneltitulo =paneltexto.get_panel();
	myframe.add(paneltitulo);

	JPanel panelimg =panelimagen.get_panel();
	myframe.add(panelimg);
	
	JPanel panelbut =panelboton.get_panel();
	myframe.add(panelbut);
	


	
	myframe.setLayout(null);

	myframe.setResizable(false);
	myframe.setVisible(true);
	myframe.setTitle("alumnos");
	
	}
}
