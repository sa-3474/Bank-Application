package Bank.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bank.Dao.RegisterDao;
import Bank.Dao.RegisterDaoImpl;
import Bank.Model.Register;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int regNo=Integer.parseInt(request.getParameter("regno"));
		String custName=request.getParameter("custname");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		float accBalance=Float.parseFloat(request.getParameter("accbalance"));

		Register regobj=new Register(regNo, custName, userName, password, accBalance);
		RegisterDao regdao=new RegisterDaoImpl();
		List<Register> lstreg=new ArrayList<Register>();
		lstreg.add(regobj);
		int i=regdao.createRecord(lstreg);
		if(i>0) {
			response.sendRedirect("HomePage.html");
		}
		else {
			response.sendRedirect("Error.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
