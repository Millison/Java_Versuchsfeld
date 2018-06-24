/*package guiElemente;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private JLabel labelTitel;
	private JLabel labelBenutzername;
	private JLabel labelPasswort;
	private JLabel labelIP;
	private JTextField textFeldBenutzername;
	private JTextField textFeldIP;
	private JPasswordField passwortFeld;
	private JCheckBox checkRemote;
	private JCheckBox checkNeuAnmeldung;
	private JButton buttonAusfuehren;
	
	private boolean lokal = true;
	private boolean neuAnmeldung = false;
	private String address;
	
	public LoginFrame() {
		this.setSize(new Dimension(320, 300));
		this.setTitle("Login!");
		this.setLayout(null);
		setLabelTitel();
		setLabelBenutzername();
		setLabelPasswort();
		setLabelIP();
		setTextFeldBenutzername();
		setPasswortFeld();
		setCheckRemote();
		setTextFeldIP();
		setCheckNeuAnmeldung();
		setButtonAnmelden();
		this.setVisible(true);
		checkRemote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lokal = !lokal;
//				System.out.println("Remout: " + checkRemout);
				anwendungIP(lokal);
			}
		});
		checkNeuAnmeldung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				neuAnmeldung = !neuAnmeldung;
				System.out.println("Neu-Anmeldung: " + neuAnmeldung);
			}
		});
		buttonAusfuehren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ausfuehern();
				System.exit(0);
			}
		});
		
	}
	
	void setLabelTitel() {
		this.labelTitel = new JLabel("Login!");
		this.labelTitel.setBounds(100, 20, 120, 15);
		this.labelTitel.setFont(new Font("Arial", 1, 12));
		this.add(labelTitel);
	}
	
	void setLabelBenutzername() {
		this.labelBenutzername = new JLabel("Benutzername:");
		this.labelBenutzername.setBounds(20, 55, 120, 10);
		this.labelBenutzername.setFont(new Font("Arial", 1, 12));
		this.add(labelBenutzername);
	}
	
	void setLabelPasswort() {
		this.labelPasswort = new JLabel("Passwort:");
		this.labelPasswort.setBounds(20, 85, 100, 10);
		this.labelPasswort.setFont(new Font("Arial", 1, 12));
		this.add(labelPasswort);
	}
	
	void setLabelIP() {
		this.labelIP = new JLabel("IP:");
		this.labelIP.setBounds(105, 115, 120, 10);
		this.labelIP.setFont(new Font("Arial", 1, 12));
		this.add(labelIP);
	}
	
	void setTextFeldBenutzername() {
		this.textFeldBenutzername = new JTextField();
		this.textFeldBenutzername.setBounds(125, 50, 120, 20);
		this.add(textFeldBenutzername);
	}
	
	void setPasswortFeld() {
		this.passwortFeld = new JPasswordField();
		this.passwortFeld.setBounds(125, 80, 120, 20);
		this.add(passwortFeld);
	}
	
	void setCheckRemote() {
		this.checkRemote = new JCheckBox("Remout?");
		this.checkRemote.setBounds(17, 112, 85, 15);
		this.checkRemote.setFont(new Font("Arial", 1, 12));
		this.add(checkRemote);
	}
	
	void setTextFeldIP() {
		this.textFeldIP = new JTextField();
		this.textFeldIP.setBounds(125, 110, 120, 20);
		this.textFeldIP.setEditable(false);
		this.add(textFeldIP);
	}
	
	void setCheckNeuAnmeldung() {
		this.checkNeuAnmeldung = new JCheckBox("Neu-Anmeldung");
		this.checkNeuAnmeldung.setBounds(100, 150, 125, 15);
		this.checkNeuAnmeldung.setFont(new Font("Arial", 1, 12));
		this.add(checkNeuAnmeldung);
	}
	
	void setButtonAnmelden() {
		this.buttonAusfuehren = new JButton("Ausf�hren");
		this.buttonAusfuehren.setBounds(90,180,105,20);
		this.add(buttonAusfuehren);
	}
	
	void anwendungIP(boolean lokal) {
		if ( lokal == false ) {
			this.textFeldIP.setEditable(true);
		} else {
			this.textFeldIP.setEditable(false);
		}
	}
	
	void ausfuehern() {
		if ( this.lokal == true ) {
			System.out.println("Lokal: " + lokal);
		} else {
			System.out.println("Lokal: " + lokal);
			this.address = textFeldIP.toString();
			System.out.println("IP: " + textFeldIP.getText());
		}
		//Benutzer neueBenutzer = new Benutzer(textFeldBenutzername.getText(), passwortFeld.getPassword());
		//System.out.println(neueBenutzer);
	}

}
*/