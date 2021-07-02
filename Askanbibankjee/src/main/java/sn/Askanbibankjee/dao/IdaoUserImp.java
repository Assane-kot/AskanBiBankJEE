package sn.Askanbibankjee.dao;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import sn.Askanbibankjee.domaine.User;
import sn.Askanbibankjee.utilis.Connexion;

public class IdaoUserImp implements IdaoUser {
	Connection con= Connexion.getConnection();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User modifier(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void suprimmer(int idUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User authentification(String login, String psw) {
		// TODO Auto-generated method stub
		String sql = " SELECT * FROM User WHERE login=?  AND psw=? ";
		boolean connect=false;
		User user = new User();
		try {
		pst = con.prepareStatement(sql);
		//recuperation des donnees 
		pst.setString(1, login); 
		pst.setString(2, psw);
		
		ResultSet rs= pst.executeQuery();		
		if (rs.next()) {
			String userlog = rs.getString("login");
			String userpsw = rs.getString("psw");
			String userrole = rs.getString("role");
			user.setLogin(userlog);
			user.setPsw(userpsw);
			user.setRole(userrole);
			if (user.getLogin().equals(login) && user.getPsw().equals(psw)) {
				connect=true;
				user.setConnectionState(connect);
			}
			
			
		}
	}
		catch ( Exception exception ) {
            throw new RuntimeException( exception );
	
}
		return user;
	}
	

	
	
}
