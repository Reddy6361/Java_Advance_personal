package p1;

/*
 * Servlets:
 * 1)servlets is a java class.
 * 2) it is a subclass of HTTP servlets, it is used to perform 
 * Back-end coding of the application.
 * 
 * Note:
 * 1) @WebServlet("/newRegs") this should be same as that of the
 *  name which is present in form action.
 * 2) request is an reference variable which points to request object
 *  where all the data is stored as mentioned in the form.
 * */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newRegs")
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewRegistration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("firstname");
		String city = request.getParameter("ecity");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mbNumber");
		System.out.println(name);
		System.out.println(city);
		System.out.println(email);
		System.out.println(mobile);
	}

}
