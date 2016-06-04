/**
 * 
 */
package us.categorize;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author keefe
 *
 */
public class MessageServlet extends HttpServlet {
	
	private String message;
	public MessageServlet(String message){
		super();
		this.message = message;		
	}
	
	@Override
    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response ) throws ServletException,
                                                        IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Checking that wiring is up?"+message+"</h1>");
    }
	
	@Override
	public void doPut( HttpServletRequest request,
            HttpServletResponse response ) throws ServletException,
    IOException
    {
		
    }
	
	@Override
	public void doPost( HttpServletRequest request,
            HttpServletResponse response ) throws ServletException,
    IOException
    {
		
    }
}
