package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.IProduitDao;
import dao.ProduitDaoImpl;
import entity.Produit;


@WebServlet (name="cs",urlPatterns= {"/controleur","*.do"})
public class ControleurServlet extends HttpServlet {
	
	 IProduitDao metier;
	 @Override
	public void init() throws ServletException {
		metier = new ProduitDaoImpl();
	}
	 
	@Override
	protected void doGet(HttpServletRequest request,
			             HttpServletResponse response) 
			            throws ServletException, IOException {
		
		String path=request.getServletPath();
		if (path.equals("/index.fa"))
		{
			request.getRequestDispatcher("produits.jsp").forward(request,response);
		}
		else if (path.equals("/chercher.fa"))
		{
			String motCle=request.getParameter("motCle");
			ProduitModele model= new ProduitModele();
			model.setMotCle(motCle);
			List<Produit> prods = metier.produitsParMC(motCle);
			model.setProduits(prods);
			request.setAttribute("model", model);
			request.getRequestDispatcher("produits.jsp").forward(request,response);
		}
		else if (path.equals("/saisie.do")  )
		{
			request.getRequestDispatcher("saisieProduit.jsp").forward(request,response);
		}
		else if (path.equals("/save.fa")  && request.getMethod().equals("POST"))
		{
		    String nom=request.getParameter("nom");
			double prix = Double.parseDouble(request.getParameter("prix"));
			Produit p = metier.save(new Produit(nom,prix));
			request.setAttribute("produit", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		
		else if (path.equals("/supprimer.fa"))
		{
		    Long id= Long.parseLong(request.getParameter("id"));
		    metier.deleteProduit(id);
		    //response.sendRedirect("chercher.fa?motCle=");
					
			request.getRequestDispatcher("produits.jsp").forward(request,response);
		}
		else if (path.equals("/editer.do")  )
		{
			Long id= Long.parseLong(request.getParameter("id"));
		    Produit p = metier.getProduit(id);
		    request.setAttribute("produit", p);
			request.getRequestDispatcher("editerProduit.jsp").forward(request,response);
		}
		else if (path.equals("/update.do")  )
		{
			 Long id = Long.parseLong(request.getParameter("id"));
			 String nom=request.getParameter("nom");
			 double prix = Double.parseDouble(request.getParameter("prix"));
			 Produit p = new Produit();
			 p.setIdProduit(id);
			 p.setNomProduit(nom);
			 p.setPrix(prix);
			 metier.updateProduit(p);
			 request.setAttribute("produit", p);
			 request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else if (path.equals("/saveUser.ec")  && request.getMethod().equals("POST"))
		{
		    //String nom=request.getParameter("nom");
			//String mdp= request.getParameter("mdp");
			//User u = metier.save(new User(nom,mdp));
			//request.setAttribute("user", u);
			request.getRequestDispatcher("produits.jsp").forward(request,response);
		}
		else
		{
			//response.sendError(Response.SC_NOT_FOUND);
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}