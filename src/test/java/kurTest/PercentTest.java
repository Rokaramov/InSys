package kurTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import packCalc.Abst;
import packCalc.Out;

public class PercentTest {

	private static double check;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Out out = new Out(30000000,0,13,12);
		Abst abst;
		abst = out;
		check = abst.calc();
	}


	@Test
	public void test() {
		assertNotNull(check);
	}

}
