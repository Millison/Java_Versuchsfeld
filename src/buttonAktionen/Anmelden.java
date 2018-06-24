/*package buttonAktionen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import datenBase.Benutzer;
import datenBase.Connect;

public class Anmelden {
	
	private Connection con = null;
	private Benutzer benutzer;
	private String logname;
	private char[] pass;
	private String loginMeldung;
	
	public Anmelden(String logname, char[] pass) {
		this.logname = logname;
		this.pass = pass;
		benutzerTest();
	}
	
	private void benutzerTest() {
		String sqlSatz = "SELECT * FROM benutzer WHERE logname='" + this.logname + "';";
		this.con = Connect.getInstance();
		
		Statement query;
		try {
			query = con.createStatement();
			ResultSet zeile = query.executeQuery(sqlSatz);
			
			this.benutzer = new Benutzer();
			while (zeile.next()) {
				this.benutzer.setLogname(zeile.getString("logname"));
				this.benutzer.setVorname(zeile.getString("vorname"));
				this.benutzer.setNachname(zeile.getString("nachname"));
				this.benutzer.setBenutzerID(zeile.getInt("benutzer_id"));
				this.benutzer.setPasswort(zeile.getString("passwort"));
				this.benutzer.setBerechtigung(zeile.getInt("rechte"));
			}
			 wenn der Lognaem und den Passwort aus dem Formular
			 * gleich dem Benutzername und dem Passwort aus DB, dann "OK".
			 * Ansonsten eine Meldung im Anmeldeform ausgeben. 
			if (this.logname.equals(zeile.getString("logname"))) {
				if (this.pass.equals(zeile.getString("passwort"))) {
					
				} else {
					this.loginMeldung = "Passwort ist falsch!";
				}
			} else {
				this.loginMeldung = "Benutzer mit dem Logname " + this.logname + " ist nicht bekannt.";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getLogin() {
		return this.loginMeldung;
	}
}
*/