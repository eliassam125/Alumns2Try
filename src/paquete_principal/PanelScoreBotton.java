package paquete_principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelScoreBotton {
	JButton button = new JButton("siguiente");
	JLabel label = new JLabel("score: ");
	JPanel panel = new JPanel();
	PanelScoreBotton(){
	label.setFont(new Font("Arial", Font.PLAIN, 45));
	button.setFont(new Font("Arial", Font.PLAIN, 45));
	button.setBounds(759, 591, 300, 100);
	label.setBounds(214, 591, 300, 100);
	panel.setBounds(0, 0, 9000, 9000);
	
	
	button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Llamar a la función personalizada cuando se presione el botón
            AccionBotton.accion();
        }
    });

	
	
	
	panel.add(button);
	panel.add(label);
	panel.setLayout(null);
	}
	JPanel get_panel() {
		return panel;
	}
	JLabel get_label() {
		return label;
	}
}
