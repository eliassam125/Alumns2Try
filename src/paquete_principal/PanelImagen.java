package paquete_principal;


import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImagen {
	JPanel panel= new JPanel();
	ImageIcon icon = new ImageIcon("img\\tsukasa.png");    
	JLabel label = new JLabel(icon);
	 public PanelImagen(){
		 panel.setLayout(null);

		 label.setBounds(400,130, 425, 425);
		 panel.setBounds(0,0, 1000, 550);
		 panel.add(label); 
		 
	}
	JPanel get_panel(){
		return panel;
	}
	JLabel get_label() {
		return label;
	}
	
}
