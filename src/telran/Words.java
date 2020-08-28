package telran;

import java.util.*;

public class Words {

	private TreeSet<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

	public void addWord(String word) {
		words.add(word);
	}

	public String[] getWordsStartWith(String prefix) {
		String first = words.ceiling(prefix);
		if (first == null) {
			return new String[0];
		}
		char[] chars = prefix.toCharArray();
		chars[chars.length - 1] = (char) (chars[chars.length - 1] + 1);// change last char to next ( abc -> abd)
		String last = words.floor(new String(chars));
		if(last==null || last.compareTo(first)<0){
			return new String[0];
		}
		return words.subSet(first, true, last, true).toArray(new String[0]);
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
