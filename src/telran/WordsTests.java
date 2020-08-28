package telran;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class WordsTests {

	@Test
	void testAddWord() {
		String randomWords[] = { "concern", "dictate", "pain", "cabinet", "understand", "berry", "elbow", "eaux",
				"outfit", "request", "wall", "seal", "sart", "forest", "killer", "secretion", "private", "feed",
				"accurate", "pier", "criminal", "definition", "prosecute", "include", "find", "protection", "perfect",
				"struggle", "fast", "matrix", "beginning", "ice", "beautiful", "bother", "personality", "glow", "post",
				"party", "belly", "supply", "TRAnsition", "Thigh", "tile", "toast", "tenant", "teach", "tOurnament",
				"tHick", "track", "thEorisT", "trial", "turkey", "toll", "telephone", "tolerant", "tRace", "Trip",
				"Terrify", "torch", "ThAw", "tHeory", "tRopical", };
		Words allWords = new Words();
		for (String word : randomWords) {
			allWords.addWord(word);
		}
		assertEquals(randomWords.length, allWords.size());
	}

	@Test
	void testGetWordsStartWith() {
		String randomWords[] = { "concern", "dictate", "pain", "cabinet", "understand", "berry", "elbow", "eaux",
				"outfit", "request", "wall", "seal", "sart", "forest", "killer", "secretion", "private", "feed",
				"accurate", "pier", "criminal", "definition", "prosecute", "include", "find", "protection", "perfect",
				"struggle", "fast", "matrix", "beginning", "ice", "beautiful", "bother", "personality", "glow", "post",
				"party", "belly", "supply", "TRAnsition", "Thigh", "tile", "toast", "tenant", "teach", "tOurnament",
				"tHick", "track", "thEorisT", "trial", "turkey", "toll", "telephone", "tolerant", "tRace", "Trip",
				"Terrify", "torch", "ThAw", "tHeory", "tRopical" };
		Words allWords = new Words();
		for (String word : randomWords) {
			allWords.addWord(word);
		}
		String expected1[] = { "perfect", "personality" };
		String expected2[] = { "ThAw", "thEorisT", "tHeory", "tHick", "Thigh" };
		String matches1 [] = allWords.getWordsStartWith("pEr");
		String matches2 [] = allWords.getWordsStartWith("tH");
		
		assertEquals(expected1.length,matches1.length);
		assertEquals(expected2.length,matches2.length);
		
		assertArrayEquals(expected1,matches1);
		assertArrayEquals(expected2,matches2);
		
		allWords.clear();
		try {
			allWords.addWord("ti-ta-ta");
		} catch (Exception e) {
			// expected
		}
		assertEquals(0,allWords.getWordsStartWith("notFound").length);
	}
}

