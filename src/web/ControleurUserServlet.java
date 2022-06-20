package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IUserDao;
import dao.UserDaoImpl;
import entity.Produit;
import entity.User;



@WebServlet (name="cus",urlPatterns= {"/controleurUser","*.do"})
public class ControleurUserServlet extends HttpServlet {
	 IUserDao metier;
	 @Override
	public void init() throws ServletException {
		metier = new UserDaoImpl();
	}
	 @Override
		protected void doGet(HttpServletRequest request,
				             HttpServletResponse response) 
				            throws ServletException, IOException {
			String path=request.getServletPath();
			//if (path.equals("/saveUser.do"))
			//{
				//request.getRequestDispatcher("produits.jsp").forward(request,response);
			//}
			 if (path.equals("/saveUser.do")  && request.getMethod().equals("POST"))
			{
			    String nom=request.getParameter("nom");
				String mdp= request.getParameter("mdp");
				User u = metier.save(new User(nom,mdp));
				request.setAttribute("user", u);
				request.getRequestDispatcher("produits.jsp").forward(request,response);
			}
	
}
}
