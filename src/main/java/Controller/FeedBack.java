package Controller
;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.InsertFeedback;

@WebServlet("/ccc")
public class FeedBack extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String feedback = req.getParameter("feedback");
		InsertFeedback ins = new InsertFeedback();
		ins.Insert(feedback);
		req.setAttribute("success_message", "Feedback Sent Successfully...!!");
        RequestDispatcher rd1=req.getRequestDispatcher("success.jsp");
        rd1.include(req, resp);
        
        RequestDispatcher rd2=req.getRequestDispatcher("feedback.jsp");
        rd2.include(req, resp);
		
		
		
		
		
		
		
	}

}
