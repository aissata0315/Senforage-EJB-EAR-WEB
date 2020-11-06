package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IVillageLocal;
import entities.Village;


@WebServlet("/Village")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private IVillageLocal villagedao;
	
	//public Village village = new Village(3,"drk");
       
   
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//request.setAttribute("villages", villagedao);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nom = request.getParameter("nomVillage").toString();
		Village village = new Village();
		village.setNom(nom);
		System.out.println("le nom du village:" + " "+nom);
		
		villagedao.add(village);
		
	}

}
