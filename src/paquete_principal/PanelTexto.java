package paquete_principal;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTexto {
	JPanel panel= new JPanel();
	JLabel label =new JLabel("Konnata");
	public PanelTexto(){
		
		
		label.setFont(new Font("Arial", Font.PLAIN, 45));
		panel.add(label);
		panel.setBounds(310, 0, 600, 120);
	}
	JPanel get_panel() {
		return panel;
	}
	JLabel get_label() {
		return label;
	}
}
