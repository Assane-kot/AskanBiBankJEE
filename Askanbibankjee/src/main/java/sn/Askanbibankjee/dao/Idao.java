package sn.Askanbibankjee.dao;

import java.util.ArrayList;



public interface Idao <T> {
	//public void connexion (String login , String psw);
	public void save (T t);
	public ArrayList <T> list ();
	public T modifier (T t);
	public void suprimmer (int idUser);

}
