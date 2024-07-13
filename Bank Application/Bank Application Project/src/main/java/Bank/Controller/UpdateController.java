package Bank.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bank.Dao.RegisterDao;
import Bank.Dao.RegisterDaoImpl;
import Bank.Model.Register;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int regNo = Integer.parseInt(request.getParameter("regNo"));
		 float accbal = Float.parseFloat(request.getParameter("accbal"));
		 Register regobj=new Register(regNo,getServletName(),getServletName(),getServletInfo(),accbal);
		 regobj.setRegNo(regNo);
		 regobj.setAccBalance(accbal);
		 RegisterDao regdao = new RegisterDaoImpl();
		 int i = regdao.updateRecord(regobj);
		 if(i>0) {
			 response.sendRedirect("HomePage.html");
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
