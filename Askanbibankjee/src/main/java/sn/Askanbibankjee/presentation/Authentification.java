package sn.Askanbibankjee.presentation;

import java.io.IOException;

//import javax.security.auth.message.callback.PrivateKeyCallback.Request;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.tomcat.jni.User;

//import sn.Askanbibankjee.dao.IdaoUser;
import sn.Askanbibankjee.dao.IdaoUserImp;
import sn.Askanbibankjee.domaine.User;

/**
 * Servlet implementation class Authentification
 */
@WebServlet("/authentification")
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private User sessionUser ;
       
    public User getSessionUser() {
		return sessionUser;
	}

	public void setSessionUser(User sessionUser) {
		this.sessionUser = sessionUser;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath() + "jsp/login.jsp");
		HttpSession sesssion = request.getSession(false);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");
		String password = request.getParameter("psw");
		//creation d'un objet session
		HttpSession session = request.getSession();
		
		// mise en memoire des informations de user 
		session.setAttribute("login", login);
		//session.setAttribute("role", role);
		
		IdaoUserImp daoUser = new IdaoUserImp(); 
		sessionUser = new User();
		
		User Userconnect = 	daoUser.authentification (login , password);
		//recuperation de la session 
		String role = Userconnect.getRole();
		session.setAttribute("role", role);

		
		if (Userconnect.getConnectionState()) {
			//sessionUser = 	daoUser.recupUser(login, password);
			//System.out.println(sessionUser.getLogin());
			request.getRequestDispatcher("/jsp/accueil.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			System.out.println("les informations saisir son incorrecte");
		}
		
		
		
		
		//doGet(request, response);
		
	}

}
