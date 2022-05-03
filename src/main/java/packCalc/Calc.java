package packCalc;

import java.io.IOException;
import java.text.DecimalFormat;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/Calc")

public class Calc extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		
		request.getRequestDispatcher("/Glav.jsp").forward(request, response);
	}
	
	private static class RequestCalc {
		private final String first_calc;
		private final String second_calc;
		private final String third_calc;
		private final String fourth_calc;
		private double result;
		private double result2;
		private double result3;
		private double result4;
		private double result5;
		
		private RequestCalc (String first, String second, String third, String fourth) {
			this.first_calc = first;
			this.second_calc = second;
			this.third_calc = third;
			this.fourth_calc = fourth;
		}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
					request.getParameter("first"), 
					request.getParameter("second"),
					request.getParameter("third"),
					request.getParameter("fourth"));
		}
		
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			request.setAttribute("first", first_calc);
			request.setAttribute("second", second_calc);
			request.setAttribute("third", third_calc);
			request.setAttribute("fourth", fourth_calc);
			double first_try;
			double second_try;
			double third_try;
			double fourth_try;
			try {
				first_try=Double.parseDouble(first_calc);
			}
			catch (NumberFormatException e) {
				first_try=0;
			}
			try {
				second_try=Double.parseDouble(second_calc)/100;
			}
			catch (NumberFormatException e) {
				second_try=0;
			}
			try {
				third_try=Double.parseDouble(third_calc);
			}
			catch (NumberFormatException e) {
				third_try=0;
			}
			try {
				fourth_try=Double.parseDouble(fourth_calc);
			}
			catch (NumberFormatException e) {
				fourth_try=0;
			}
			DecimalFormat df = new DecimalFormat("###.##");
			Out out = new Out(first_try,second_try,third_try,fourth_try);
			Abst abst;
			abst=out;
			result=abst.calc();
			result2=first_try;
			result3=second_try*100;
			result4=third_try;
			result5=fourth_try;
			request.setAttribute("result", df.format(result));
			request.setAttribute("result2", result2);
			request.setAttribute("result3", result3);
			request.setAttribute("result4", result4);
			request.setAttribute("result5", result5);
		}
	}
}