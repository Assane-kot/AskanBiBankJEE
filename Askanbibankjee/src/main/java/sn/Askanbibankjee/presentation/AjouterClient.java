package sn.Askanbibankjee.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.Askanbibankjee.dao.IdaoClientImp;
import sn.Askanbibankjee.domaine.Client;

/**
 * Servlet implementation class AjouterClient
 */
@WebServlet("/ajouterclient")
public class AjouterClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String tel = request.getParameter("tel");
		String typepiece = request.getParameter("typepiece");
		String numpiece = request.getParameter("numpiece");
		String genre = request.getParameter("genre");
		String sitmat = request.getParameter("sitmat");
		String nature = request.getParameter("nature");
		Client client = new Client (nom,prenom,adresse,tel,typepiece,numpiece,genre,sitmat,nature);
		IdaoClientImp dao = new IdaoClientImp();
		dao.save(client);
		request.getRequestDispatcher("jsp/ListeClient.jsp").forward(request, response);
		//doGet(request, response);
	}

}
