package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.Token;
import parse.tokens.Token;

public class TokenTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//test case for symbol class above
		/**
		char c = 'a';
		Token t = new Token(c);
		assertFalse(t.isNumber());
		assertFalse(t.isWord());
		assertTrue(t.isSymbol());
		 * 
		 */
		
		//test case for number class
		/**
		int i = 2;
		Token t1 = new Token(i);
		assertTrue(t1.isNumber());
		assertFalse(t1.isWord());
		assertFalse(t1.isSymbol());
		 * 
		 */
		
		//test case for Token class
		String s = "abc";
		Token l1 = new Token(s);
		assertFalse(l1.isNumber());
		assertTrue(l1.isWord());
		assertFalse(l1.isSymbol());
	}

}
