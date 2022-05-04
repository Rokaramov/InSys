package packCalc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PercentChange {
	
	public static double changePercent1 = 0;
	public static double changePercent2 = 0;
	public static double changePercent3 = 0;
	
	public PercentChange() {
		try {
			FileReader frd1 = new FileReader("percent1.TXT");
			Scanner per1 = new Scanner(frd1);
			FileReader frd2 = new FileReader("percent2.TXT");
			Scanner per2 = new Scanner(frd2);
			FileReader frd3 = new FileReader("percent3.TXT");
			Scanner per3 = new Scanner(frd3);
			String percent1;
			String percent2;
			String percent3;
			percent1 = per1.nextLine();
			percent2 = per2.nextLine();
			percent3 = per3.nextLine();
			per1.close();
			per2.close();
			per3.close();
			changePercent1 = Double.parseDouble(percent1);
			changePercent2 = Double.parseDouble(percent2);
			changePercent3 = Double.parseDouble(percent3);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
