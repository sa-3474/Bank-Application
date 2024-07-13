package Bank.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Dao.RegisterDaoImpl;
import Bank.Model.Register;

/**
 * Servlet implementation class SearchController
 */
public class RetriveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rno=Integer.parseInt(request.getParameter("regNo"));
		RegisterDaoImpl dao=new RegisterDaoImpl();
		int regNo = 0;
		Register r=(Register) dao.RetriveRecord(regNo);
		System.out.println(r.getRegNo()+"\t"+r.getCustName());
		
		if(r!=null){
			HttpSession session=request.getSession();
			session.setAttribute("sdata",r);
			response.sendRedirect("RetrivewView.jsp");
			
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
