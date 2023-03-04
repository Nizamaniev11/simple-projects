package nayzek.anagrams;

import java.util.StringJoiner;

import org.junit.platform.commons.util.StringUtils;

public class Anagram {

	public String reverseWords(String inputWords) {
		if(StringUtils.isBlank(inputWords)) return inputWords;
		String[] words = inputWords.split(" ");
		StringJoiner reversedWords = new StringJoiner(" ");

		for (String word : words) {
			reversedWords.add(reverseWord(word));
		}
		return reversedWords.toString();
	}

	private String reverseWord(String word) {
		char[] symbolsInWord = word.toCharArray();
		int leftIndex, rightIndex = symbolsInWord.length - 1;

		for (leftIndex = 0; leftIndex < symbolsInWord.length / 2; leftIndex++) {
			if (leftIndex >= rightIndex)
				break;
			if ((!Character.isLetter(symbolsInWord[leftIndex])))
				continue;
			while (!Character.isLetter(symbolsInWord[rightIndex]))
				rightIndex--;
			char temp;
			temp = symbolsInWord[rightIndex];
			symbolsInWord[rightIndex] = symbolsInWord[leftIndex];
			symbolsInWord[leftIndex] = temp;
			rightIndex--;
		}

		return String.valueOf(symbolsInWord);
	}

}