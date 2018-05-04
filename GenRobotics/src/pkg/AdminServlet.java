package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Comment;
import dao.Datab;

/**
 * Servlet implementation class Form
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		System.out.println("okay");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String website=request.getParameter("website");
		String comment=request.getParameter("comment");
		Comment c=new Comment(name,email,website,comment);
		Datab d=new Datab();
		boolean result=d.insert(c);
		if (result) {
			out.println("<script type=\"text/javascript\">");
		   out.println("alert('Inserted successfully');");
		   out.println("location='single.jsp';");
		   out.println("</script>");			//out.write("success");
	}
		else{
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('Sorry, datat cannot be entered');");
			   //out.println("location='home.jsp';");
			   out.println("</script>");
		}
		
		
		
		doGet(request, response);
	}

}
