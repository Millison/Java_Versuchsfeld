package datenBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	private static Connection con = null;
	private static String dbHost = "localhost"; // Hostname
	private static String dbPort = "3306"; // Port -- Standard: 3306
	private static String dbName = "gaestebuch"; // Datenbankname
	private static String dbUser = "root"; // Datenbankuser
	private static String dbPass = ""; // Datenbankpasswort

	private Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Datenbanktreiber für JDBC
													// Schnittstellen laden.

			// Verbindung zur JDBC-Datenbank herstellen.
			con = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?" + "user="
					+ dbUser + "&" + "password=" + dbPass);
		} catch (ClassNotFoundException e) {
			System.out.println("Treiber nicht gefunden");
		} catch (SQLException e) {
			System.out.println("Verbindung nicht moglich");
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}

	public static Connection getInstance() {
		if (con == null)
			new Connect();
		return con;
	}

	// Gebe Tabelle in die Konsole aus
	public static void ausgabeDetTabelleninhaltenInCnsole() {
		con = getInstance();

		if (con != null) {
			// Abfrage-Statement erzeugen.
			Statement query;
			try {
				query = con.createStatement(); /* class mit SQL-Operationen */

				// Tabelle anzeigen
				String sql = "SELECT * FROM benutzer;";
				ResultSet result = query.executeQuery(sql);

				// Ergebnisstabelle durchforsten
				while (result.next()) {
					String logname = result.getString("logname");
					String vorname = result.getString("vorname");
					String nachname = result.getString("nachname");
					String rechte = result.getString("rechte");
					String info = logname + ", " + vorname + ", " + nachname + ", " + rechte;

					System.out.println(info);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
