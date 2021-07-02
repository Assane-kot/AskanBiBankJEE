package sn.Askanbibankjee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sn.Askanbibankjee.domaine.Client;
import sn.Askanbibankjee.utilis.Connexion;

public class IdaoClientImp implements IdaoClient  { 
	Connection con= Connexion.getConnection();
	PreparedStatement pst;
	Statement stmt;
	ResultSet rs;

	

	@Override
	public void save(Client t) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO Client (nom , prenom , adresse , tel ,typepiece ,numpiece ,genre ,sitmat ,nature) VALUES (?,?,?,?,?,?,?,?,?)";
		 try {
			pst  = con.prepareStatement(sql);
			 pst.setString(1, t.getNom());
			 pst.setString(2, t.getPrenom());
			 pst.setString(3, t.getAdresse());
			 pst.setString(4, t.getTel());
			 pst.setString(5, t.getTypepiece());
			 pst.setString(6, t.getNumpiece());
			 pst.setString(7, t.getGenre());
			 pst.setString(8, t.getSitmat());
			 pst.setString(9, t.getNature());
			 pst.execute();
			 
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Client> list() {
		ArrayList<Client> cl = new ArrayList<Client>();
		// TODO Auto-generated method stub
		String sql =" SELECT nom , prenom , adresse ,tel ,nature ";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs == null) {
				return cl;
			}
			while(rs.next()) {
				Client client = new Client();
				client.setNom(rs.getString(1));
				client.setPrenom(rs.getString(2));
				client.setAdresse(rs.getString(3));
				client.setTel(rs.getString(4));
				client.setNature(rs.getString(5));

				cl.add(client);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public Client modifier(Client t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void suprimmer(int idUser) {
		// TODO Auto-generated method stub
		
	}

}
