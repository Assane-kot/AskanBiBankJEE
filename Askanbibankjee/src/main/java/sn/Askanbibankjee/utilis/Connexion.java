package sn.Askanbibankjee.utilis;

import java.sql.DriverManager;
import java.sql.Connection;

public class Connexion {
	private static String Driver ="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:8889/bdbanque";
	private static String login="root";
	private static String password ="Estg2021";
	private static Connection con;
	
	private Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {
		
	try {
		Class.forName(Driver);
		System.out.println("chemin à la base de données trouvée");
		try {
			con=DriverManager.getConnection(url, login, password);
			System.out.println("connexion à la base de données réussie");
			
		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println("connextion à la base de données non réussie");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("chemin à la base de données non trouvée");
	}	
	return con;
	
	}
	
	

}
