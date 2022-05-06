package kurTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import packCalc.Abst;
import packCalc.Out;

public class ZeroYearTest {
	
	private static double check;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Out out = new Out(3000000,12,0,12);
		Abst abst;
		abst = out;
		check = abst.calc();
	}

	@Test
	public void test() {
		assertNotNull(check);
	}
}