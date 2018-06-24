package guiElemente;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KommentBearbeitenButton extends JPanel {
	
	private JButton edit;
	
	public KommentBearbeitenButton() {
		this.setLayout(null);
//		this.setBounds(170, 50, 500, 400);
		setKommentEditButton();
		this.add(edit);
		this.setVisible(true);
	}
	
	public void setKommentEditButton() {
		this.edit = new JButton(" Bearbeiten ");
		this.edit.setLayout(null);
		this.edit.setFont(new Font("SansSerif", 2, 12));
		this.edit.setBackground(Color.WHITE);
		this.edit.setForeground(Color.BLUE);
		this.edit.setBorder(null);
		this.edit.setBounds(0, 0, 67, 15);
	}
}
