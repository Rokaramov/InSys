package packInf;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packCalc.PercentChange;

@WebServlet(name="Inf", urlPatterns="/Inf")

public class Information extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestAvtor Avtor = RequestAvtor.fromRequestParameters(request);
		Avtor.setAsRequestAttributesAndPaste(request, response);
		
		request.getRequestDispatcher("/Glav.jsp").forward(request, response);
	}
	private static class RequestAvtor {
		private final String l;
		private final String p;
		
		private RequestAvtor (String eg, String g) {
			this.l = eg;
			this.p = g;
		}
		
public static RequestAvtor fromRequestParameters(HttpServletRequest request) {
return new RequestAvtor(request.getParameter("l"), request.getParameter("p"));
}
		
		public void setAsRequestAttributesAndPaste(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DecimalFormat df = new DecimalFormat("###.##");
		new PercentChange();
		request.setAttribute("firstGlavPercent", df.format(PercentChange.changePercent1));
		request.setAttribute("secondGlavPercent", df.format(PercentChange.changePercent2));
		request.setAttribute("thirdGlavPercent", df.format(PercentChange.changePercent3));
	}
}
}