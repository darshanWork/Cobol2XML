package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.Symbol;
import java.util.ArrayList;

public class SymbolTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		char c = 'A';
		Symbol symbol = new Symbol(c);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = symbol.randomExpansion(2,1);
		assertFalse( arrayList.isEmpty() );
	}

}
