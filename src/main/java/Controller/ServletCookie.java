package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.ValidateLogin;

@WebServlet("/ServletCookie")
public class ServletCookie extends HttpServlet {
	    public static String pass; 
	   
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			int val=0;
			String email=null;
			Cookie ck[]=req.getCookies();
			for(Cookie c:ck)
			{
				
			    
				if(c.getName().equals("status"))
				{
					val++;
				}
				if(c.getName().equals("password"))
				{
					pass=c.getValue();
					
				}
				if(c.getName().equals("email"))
				{
					email=c.getValue();
				}
					
					
			}
			
			
			
			if(val==1)
			{
				ValidateLogin v=new ValidateLogin();
		        int i=v.Check("",email,"");
		        if(v.flag2==1)
            	{
            	     
		        	req.setAttribute("error_message", "Your Account Has Been Blocked By The Admin");
                    RequestDispatcher rd1=req.getRequestDispatcher("error.jsp");
                    rd1.include(req, resp);
                    RequestDispatcher rd2=req.getRequestDispatcher("Login.jsp");
                    rd2.include(req, resp);
		        	
		       
            		
            	}
		        else
		        {
		        	RequestDispatcher rd=req.getRequestDispatcher("Profile3.jsp");
	    			rd.include(req, resp);
		        }
				
			}
			else
			{
				
				req.setAttribute("error_message", "No data saved");
                RequestDispatcher rd1=req.getRequestDispatcher("error.jsp");
                rd1.include(req, resp);
                RequestDispatcher rd2=req.getRequestDispatcher("Login.jsp");
                rd2.include(req, resp);
			}
		}

	}


