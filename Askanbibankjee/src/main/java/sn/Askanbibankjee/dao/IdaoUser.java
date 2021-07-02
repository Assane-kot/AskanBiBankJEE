package sn.Askanbibankjee.dao;

import sn.Askanbibankjee.domaine.User;

public interface IdaoUser extends Idao<User> {
	public User authentification ( String login , String psw);

}
