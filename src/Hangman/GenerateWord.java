package Hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * It reads in from "words.txt" and generates a random word.
 */
public class GenerateWord {
	private String word;
	GenerateWord() throws IOException{
		Random r = new Random();
		String[] wordList = new String[9894];
		
		BufferedReader b = new BufferedReader(new FileReader("./words.txt"));
		
		for(int x = 0; x<9894; x++) {
			wordList[x] = b.readLine();
		}
		b.close();
		
		word = wordList[r.nextInt(wordList.length)];
		

	}
	/**
	 * Getter for the randomly generated word.
	 * @return the word
	 * */
	public String getAnswer(){
		
		return word;
	}
}

