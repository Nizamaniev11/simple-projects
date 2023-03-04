package nayzek.anagrams;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String source = scan.nextLine();
		
		Anagram string = new Anagram();
		
		String result = string.reverseWords(source);
	
		System.out.println(result);

	}

}
