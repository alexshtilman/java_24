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
				"party", "belly", "supply", " theft", "TRAnsition", "Thigh", "tile", "toast", "tenant", "teach",
				"tOurnament", "tHick", "track", "thEorisT", "trial", "turkey", "toll", "telephone", "tolerant", "tRace",
				"Trip", "Terrify", "torch", "ThAw", "tHeory", "tRopical", };
		Words allWords = new Words();
		for (String word : randomWords) {
			allWords.addWord(word);
		}
		assertEquals(randomWords.length,allWords.size());
	}

	@Test
	void testGetWordsStartWith() {
		String randomWords[] = {  "concern", "dictate", "pain", "cabinet", "understand", "berry", "elbow", "eaux",
				"outfit", "request", "wall", "seal", "sart", "forest", "killer", "secretion", "private", "feed",
				"accurate", "pier", "criminal", "definition", "prosecute", "include", "find", "protection", "perfect",
				"struggle", "fast", "matrix", "beginning", "ice", "beautiful", "bother", "personality", "glow", "post",
				"party", "belly", "supply", " theft", "TRAnsition", "Thigh", "tile", "toast", "tenant", "teach",
				"tOurnament", "tHick", "track", "thEorisT", "trial", "turkey", "toll", "telephone", "tolerant", "tRace",
				"Trip", "Terrify", "torch", "ThAw", "tHeory", "tRopical","uNit5","Unit6","UniT" };
		Words allWords = new Words();	
		for (String word : randomWords) {
			allWords.addWord(word);
		}
		Arrays.asList(allWords.getWordsStartWith("unit")).forEach(System.out::println);
		Arrays.asList(allWords.getWordsStartWith("tH")).forEach(System.out::println);
		allWords.clear();
		allWords.addWord("ti-ta-ta");
		allWords.addWord("tiK-ta-ta");
		Arrays.asList(allWords.getWordsStartWith("ti")).forEach(System.out::println);
	}
}
