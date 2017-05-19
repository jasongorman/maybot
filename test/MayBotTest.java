import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MayBotTest {

	@Test
	@Parameters({
		"How do you plan to maintain growth after a Hard Brexit?",
		"Will unrealistically low immigration targets hamper Tech Britain?",
		"Why are nurses forced to use food banks?",
		"Why has the national debt doubled under Conservative government?",
		"What is the chief export of Cuba?",
		"Who wrote 'The Martian Chronicles'?",
		"What are the ingredients of a Manhattan?",
		"Are you a human being?"
	})
	public void strongAndStableResponse(String question) {
		MayBot maybot = new MayBot();
		assertEquals("Strong and stable leadership", maybot.ask(question));
	}

}
