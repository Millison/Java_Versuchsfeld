package guiElemente;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KommentAntwortButton extends JPanel{
	
	private JButton antwort;
	
	public KommentAntwortButton() {
		this.setLayout(null);
		//this.setBounds(100, 50, 500, 400);
		setKommentAntwortButton();
		this.add(antwort);
		this.setVisible(true);
	}
	
	public void setKommentAntwortButton() {
		this.antwort = new JButton(" Antworten ");
		this.antwort.setLayout(null);
		this.antwort.setFont(new Font("SansSerif", 2, 12));
		this.antwort.setBackground(Color.WHITE);
		this.antwort.setForeground(Color.BLUE);
		this.antwort.setBorder(null);
		this.antwort.setBounds(0, 0, 60, 15);
	}
	
	public void setButtonEigenschaften(int xPosition, int yPosition, int buttonLaenge, int buttonHohe) {
		this.setBounds(xPosition, yPosition, buttonLaenge, buttonHohe);
	}
}

