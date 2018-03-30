package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PaisDAO;
import model.Pais;


@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pais pais = new Pais();
		pais.setNome(request.getParameter("nome"));
		pais.setPopulacao(request.getParameter("populacao"));
		pais.setArea(request.getParameter("area"));
		
		PaisDAO pd = new PaisDao();
		pd.criar(pais);
		
		PrintWriter out = response.getWriter();
		out.println(<html>);
		out.println(<body>);
		out.println("cadastrado com sucesso ");
		out.println(</body>);
		out.println(</html>);
		
	}

}
