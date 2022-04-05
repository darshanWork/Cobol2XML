package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllTests {

	@Test
	public void test() {
		//fail("Not yet implemented");
		NumTest numTest = new NumTest();
		numTest.test();
		ParserTest pTest = new ParserTest();
		pTest.test();
		SymbolTest sTest = new SymbolTest();
		sTest.test();
		TokenTest tTest = new TokenTest();
		tTest.test();
	}

}
