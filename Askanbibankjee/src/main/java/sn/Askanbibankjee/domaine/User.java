package sn.Askanbibankjee.domaine;


public class User {
	private Integer idUser;
	private Boolean connectionState = false;
	private String login;
	private String psw;
	private String role;
	
	
	public User() {
		super();
	}
	 public User (String login, String psw , String role) {
		 super();
		 this.setLogin(login);
		 this.setPsw(psw);
		 this.setRole(role);		 
	 }
	 public User (String login, String psw  ) {
		 super();
		 this.setLogin(login);
		 this.setPsw(psw);
		 
	 }
	 public Integer getIdUser() {
			return idUser;
		}
	public String getLogin() {
		return login;
	}
	public String getPsw() {
		return psw;
	}
	public String getRole() {
		return role;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public Boolean getConnectionState() {
		return connectionState;
	}
	public void setConnectionState(Boolean connectionState) {
		this.connectionState = connectionState;
	}
	
	

}
