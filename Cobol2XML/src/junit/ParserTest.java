package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;


public class ParserTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("program-id. JB-base.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.completeMatch(in);
		assertFalse( out.stackIsEmpty() );
	}

}
