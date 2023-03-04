package nayzek.anagrams;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AnagramTest {
	
	Anagram string = new Anagram(); 
	
	
	@Test
	@DisplayName("Reverse null")
	public void testReverseNull() {
		assertEquals(null, string.reverseWords(null));
	}
	
	@Test
	@DisplayName("Reverse of empty string")
	public void testReverseEmptyString() {
		assertEquals("", string.reverseWords(""));
	}
	
	@Test
	@DisplayName("Reverse single space string")
	public void testReverseSingleSpaceString() {
		assertEquals(" ", string.reverseWords(" "));
	}
	
	@Test
	@DisplayName("Reverse several space string")
	public void testReverseSeveralEmptyString() {
		assertEquals("  ", string.reverseWords("  "));
	}
	
		
	@Test
	@DisplayName("Reverse same letter word")
	public void testMltipleSameLetterInput() {
		assertEquals("llll", string.reverseWords("llll"));
	}
	
	@Test
	@DisplayName("Reverse single letter")
	public void testReverseOneLetter() {
		assertEquals("e", string.reverseWords("e"));
	}
	
	@Test
	@DisplayName("Reverse single none-letter")
	public void testReverseOneNoneLetter() {
		assertEquals("1", string.reverseWords("1"));
	}
	
	
	@Test
	@DisplayName("Reverse Upper and lower case word")
	public void testReverseUpperLowerCases() {
		assertEquals("lLlLlL", string.reverseWords("LlLlLl"));
	}
	
	@Test
	@DisplayName("Reverse a word with different letters") 
	public void testReverseDifferentLetters() {
		assertEquals("gfedcba", string.reverseWords("abcdefg"));
	}
	
	@Test
	@DisplayName("Reverse several words") 
	public void testReverseSeveralWords() {
		assertEquals("d1bca hgf!e", string.reverseWords("a1bcd efg!h"));
	}
	
	@Test
	@DisplayName("Reverse non-letter word") 
	public void testReverseNonLetterlWord() {
		assertEquals("121!54", string.reverseWords("121!54"));
	}
	
	@Test
	@DisplayName("Reverse several Non-letter words") 
	public void testReverseSeveralNonLetterWords() {
		assertEquals("187660412 !?3122", string.reverseWords("187660412 !?3122"));
	}
}
