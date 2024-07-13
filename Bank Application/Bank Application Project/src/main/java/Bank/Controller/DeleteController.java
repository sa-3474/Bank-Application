package Bank.Controller;

import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Dao.RegisterDao;
import Bank.Dao.RegisterDaoImpl;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int regNo = Integer.parseInt(request.getParameter("regno"));
		    
		    // Create an instance of your DAO implementation
		    RegisterDao regdao = new RegisterDaoImpl();
		    
		    // Attempt to delete the record by registration number
		    int success = regdao.deleteRecord(regNo);
		    
		    // Check if the record was successfully deleted
		    if (success==1) {
		        // Record deleted successfully, you can set a success message if needed
		        HttpSession session = request.getSession();
		        session.setAttribute("message", "Record with Registration Number " + regNo + " deleted successfully.");
		        response.sendRedirect("DeleteView.jsp"); // Redirect to a success page
		    } else {
		        // Record not found or deletion failed, you can set an error message if needed
		        HttpSession session = request.getSession();
		        session.setAttribute("error", "Record with Registration Number " + regNo + " not found or deletion failed.");
		        response.sendRedirect("DeleteView.jsp"); // Redirect to an error page
		    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}