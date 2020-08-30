package telran;

import java.util.*;

public class Words {

	private TreeSet<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

	public void addWord(String word) {
		if(word.matches("[A-Za-z]+")||!words.add(word)){
			throw new IllegalArgumentException();
		}
	}

	public String[] getWordsStartWith(String prefix) {
		char[] chars = prefix.toCharArray();
		String last = (new String(chars[chars.length - 1] = (char) (chars[chars.length - 1].toLowerCase() + 1));// change last char to next ( abc -> abd)
		return words.subSet(first, true, last, false).toArray(new String[0]);
	}

	public int size() {
		return words.size();
	}

	@Override
	public String toString() {
		return "Words [words=" + words + "]";
	}
	public void clear() {
		words.clear();
	}

}

