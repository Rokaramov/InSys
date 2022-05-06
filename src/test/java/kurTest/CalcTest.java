package kurTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import packCalc.Abst;
import packCalc.Out;

public class CalcTest {
	
	private static double check;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Out out = new Out(0,12,13,12);
		Abst abst;
		abst = out;
		check = abst.calc();
	}


	@Test
	public void test() {
		assertNotNull(check);
	}

}
