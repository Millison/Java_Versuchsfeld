package guiElemente;

import javax.swing.JFrame;

public class MainKlass {

	public static void main(String[] args) {
		
		//Connection dbCon = Connect.getInstance();
		
		JFrame testPanel = new JFrame();
		testPanel.setLayout(null);
		testPanel.setBounds(100, 10, 400, 500);
		
		KommentAntwortButton antwort = new KommentAntwortButton();
		antwort.setBounds(100, 50, 100, 20);
		testPanel.add(antwort);
		
		KommentBearbeitenButton bearb = new KommentBearbeitenButton();
		bearb.setBounds(200, 50, 100, 20);
		testPanel.add(bearb);
		
		testPanel.setVisible(true);
		testPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}