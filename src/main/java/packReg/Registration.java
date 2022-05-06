package packReg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Registration", urlPatterns="/Registration")

public class Registration extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestRegistration Registration;
		try {
			Registration = RequestRegistration.fromRequestParameters(request);
			Registration.setAsRequestAttributesAndPaste(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/Avtoriz.jsp").forward(request, response);
	}
	private static class RequestRegistration {
		private final String loginJava;
		private final String passwordJava;
		
		private RequestRegistration (String loginReg, String passwordReg) throws Exception {
			this.loginJava = new String(loginReg.getBytes("ISO-8859-1"), "utf-8");
			this.passwordJava = new String(passwordReg.getBytes("ISO-8859-1"), "utf-8");
		}
		
public static RequestRegistration fromRequestParameters(HttpServletRequest request) throws Exception {
return new RequestRegistration(request.getParameter("loginReg"), request.getParameter("passwordReg"));
}
		
		public void setAsRequestAttributesAndPaste(HttpServletRequest request) {

			try {
				request.setAttribute("loginReg", loginJava);
				request.setAttribute("passwordReg", passwordJava);
				
				File file = new File("login1.TXT");
				file.createNewFile();
				FileWriter writer = new FileWriter(file, false);
				writer.write(loginJava + "\n");
				writer.close();
				
				File file2 = new File("password1.TXT");
				file2.createNewFile();
				FileWriter writerPassword = new FileWriter(file2, false);
				writerPassword.write(passwordJava + "\n");
				writerPassword.close();
				
				File file3 = new File("admin.TXT");
				file3.createNewFile();
				FileWriter writerAdmin = new FileWriter(file3, false);
				if (request.getParameter("gender").equals("admin")) {
					writerAdmin.write("1" + "\n");
					writerAdmin.close();
				} else {
					writerAdmin.write("0" + "\n");
					writerAdmin.close();
				}					
				request.setAttribute("log", loginJava);
				request.setAttribute("pass", passwordJava);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				request.setAttribute("log", "рег");		
				}	
		}
	}
}
