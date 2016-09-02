package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.webservice.ComentarioProduto;
import br.com.fiap.webservice.IAtivComentarioProdutoEndpointProxy;

/**
 * Servlet implementation class Ativ_ECommerceServlet
 */
@WebServlet("/Ativ_ECommerceServlet")
public class AtivECommerceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AtivECommerceServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Calendar dtHoje = Calendar.getInstance();
		try {
			String data = request.getParameter("data");
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");			
			dtHoje.setTime(formato.parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String titulo = request.getParameter("titulo");
		String assunto = request.getParameter("assunto");
		int avaliacao = Integer.parseInt(request.getParameter("avaliacao"));
		String comentario = request.getParameter("comentario");
		

		PrintWriter out = response.getWriter();
		try {
			ComentarioProduto comentarioProduto = new ComentarioProduto();
			comentarioProduto.setData(dtHoje);
			comentarioProduto.setTitulo(titulo);
			comentarioProduto.setAssunto(assunto);
			comentarioProduto.setComentarioProduto(comentario);
			comentarioProduto.setAvaliacao(avaliacao);

			IAtivComentarioProdutoEndpointProxy proxy = new IAtivComentarioProdutoEndpointProxy();
			proxy.inserirComentarioProduto(comentarioProduto);

			request.setAttribute("lista", proxy.listarComentariosProduto());
			request.getRequestDispatcher("lista.jsp").forward(request, response);
		} catch (Exception e) {
			out.print(e.getMessage());
		}
	}

}
