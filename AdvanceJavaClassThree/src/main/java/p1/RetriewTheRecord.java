package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstservlet")
public class RetriewTheRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RetriewTheRecord() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4pm_demo_db_1", "root", "6361");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from registration");
			
			PrintWriter out = response.getWriter();
			out.println("<table border= solid>");
			out.println("<tr>");
			out.println("<th>");
			out.println("name");
			out.println("</th>");
			out.println("<th>");
			out.println("city");
			out.println("</th>");
			out.println("<th>");
			out.println("email");
			out.println("</th>");
			out.println("<th>");
			out.println("mobile");
			out.println("</th>");
			out.println("</tr>");
			out.println("</table>");
			while(result.next()) {
				out.println("<table border= solid>");
				out.println("<tr>");
				out.println("<td>");
				out.println(result.getString(1) );
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(2) );
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(3) );
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(4) );
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
