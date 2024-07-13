package Bank.Controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Dao.RegisterDao;
import Bank.Dao.RegisterDaoImpl;
import Bank.Model.Register;

/**
 * Servlet implementation class DisplayAllController
 */
@WebServlet("/DisplayAllController")
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		List<Register>lst=new LinkedList<Register>();
		request.setAttribute("empList",lst);
		RequestDispatcher view = request.getRequestDispatcher("lst.jsp");
		view.forward(request, response);
	}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		Register regobj= new Register();
	//	RegisterDao rdao=new RegisterDaoImpl();
		
	
		/*	RegisterDao rdao=new RegisterDaoImpl();
		
		List<Register>lst=new LinkedList<Register>();
		lst=rdao.list();
		HttpSession session=request.getSession();
		
		session.setAttribute("data", lst);
		response.sendRedirect("DisplayAllView.jsp");
	*/


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
