package packCalc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Writer", urlPatterns="/Writer")

public class PercentWriter extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestRegistration Registration = RequestRegistration.fromRequestParameters(request);
		Registration.setAsRequestAttributesAndPaste(request);
		
		request.getRequestDispatcher("/Glav.jsp").forward(request, response);
	}
	private static class RequestRegistration {
		private final String firstPercent;
		private final String secondPercent;
		private final String thirdPercent;
		
		private RequestRegistration (String firstAdmPercent, String secondAdmPercent, String thirdAdmPercent) {
			this.firstPercent = firstAdmPercent;
			this.secondPercent = secondAdmPercent;
			this.thirdPercent = thirdAdmPercent;
		}
		
public static RequestRegistration fromRequestParameters(HttpServletRequest request) {
return new RequestRegistration(request.getParameter("firstAdmPercent"), request.getParameter("secondAdmPercent"), request.getParameter("thirdAdmPercent"));
}
		
		public void setAsRequestAttributesAndPaste(HttpServletRequest request) {

			try {
				request.setAttribute("firstAdmPercent", firstPercent);
				request.setAttribute("secondAdmPercent", secondPercent);
				request.setAttribute("thirdAdmPercent", thirdPercent);
				
				File file = new File("percent1.TXT");
				file.createNewFile();
				FileWriter writer = new FileWriter(file, false);
				writer.write(firstPercent);
				writer.close();
				
				File file2 = new File("percent2.TXT");
				file2.createNewFile();
				FileWriter writerPassword = new FileWriter(file2, false);
				writerPassword.write(secondPercent);
				writerPassword.close();
				
				File file3 = new File("percent3.TXT");
				file3.createNewFile();
				FileWriter writerAdmin = new FileWriter(file3, false);
				writerAdmin.write(thirdPercent);
				writerAdmin.close();				
				request.setAttribute("firstGlavPercent", firstPercent);
				request.setAttribute("secondGlavPercent", secondPercent);
				request.setAttribute("thirdGlavPercent", thirdPercent);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				request.setAttribute("log", "Регистрация не совершена");		
				}	
		}
	}
}
