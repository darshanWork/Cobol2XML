package junit;

import static org.junit.Assert.*;
import parse.tokens.Num;
import java.util.ArrayList;

import org.junit.Test;

public class NumTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Num num = new Num();
		int maxDepth = 2;
		int depth = 1;
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = num.randomExpansion(maxDepth, depth);
		assertFalse(arrayList.isEmpty());
	}

}
