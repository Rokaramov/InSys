package packAvt;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packCalc.PercentChange;

@WebServlet(name="Avtor", urlPatterns="/Avtor")

public class Avtor extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestAvtor Avtor;
		try {
			Avtor = RequestAvtor.fromRequestParameters(request);
			Avtor.setAsRequestAttributesAndPaste(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	private static class RequestAvtor {
		private final String loginJava;
		private final String passwordJava;
		private String zero = "0";
		private String one = "1";
		private boolean che = false;
		private boolean adminCheck = false;
		
		private RequestAvtor (String loginReg, String passwordReg) throws Exception {
			this.loginJava = new String(loginReg.getBytes("ISO-8859-1"), "utf-8");
			this.passwordJava = new String(passwordReg.getBytes("ISO-8859-1"), "utf-8");
		}
		
public static RequestAvtor fromRequestParameters(HttpServletRequest request) throws Exception {
return new RequestAvtor(request.getParameter("log"), request.getParameter("pass"));
}
		
		public void setAsRequestAttributesAndPaste(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			try {
				request.setAttribute("log", loginJava);
				request.setAttribute("pass", passwordJava);			
				
				FileReader in = new FileReader("login1.TXT");
				Scanner sc = new Scanner(in);
				FileReader rd = new FileReader("password1.TXT");
				Scanner scan = new Scanner(rd);
				FileReader admi = new FileReader("admin.TXT");
				Scanner adScan = new Scanner(admi);
				
				
				String administrator = new String();
				while(sc.hasNextLine() && scan.hasNextLine() && adScan.hasNextLine()) {
					String login = new String(sc.nextLine().getBytes("ISO-8859-1"), "utf-8");
					String password = new String(scan.nextLine().getBytes("ISO-8859-1"), "utf-8");
					administrator = adScan.nextLine();
	if(loginJava.contentEquals(login) && passwordJava.contentEquals(password) && zero.contentEquals(administrator)) {
		DecimalFormat df = new DecimalFormat("###.##");
		new PercentChange();
		request.setAttribute("firstGlavPercent", df.format(PercentChange.changePercent1));
		request.setAttribute("secondGlavPercent", df.format(PercentChange.changePercent2));
		request.setAttribute("thirdGlavPercent", df.format(PercentChange.changePercent3));
						che = true;
						request.getRequestDispatcher("/Glav.jsp").forward(request, response);
	} 
	if(loginJava.contentEquals(login) && passwordJava.contentEquals(password) && one.contentEquals(administrator)) {
						che = true;
						adminCheck = true;
						request.getRequestDispatcher("/GlavAdm.jsp").forward(request, response);
	}		 
				}
				sc.close();
				scan.close();
				adScan.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
											 }			
					if(!che) {
						request.setAttribute("log", "Неправильный логин или пароль");
						request.getRequestDispatcher("/Avtoriz.jsp").forward(request, response);
					}
	}
}
}