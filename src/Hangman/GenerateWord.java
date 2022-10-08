package Hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class GenerateWord {
	private String s;
	GenerateWord() throws IOException{
		Random r = new Random();
		String[] wordList = new String[9894];
		
		BufferedReader b = new BufferedReader(new FileReader("./words.txt"));
		
		for(int x = 0; x<9894; x++) {
			wordList[x] = b.readLine();
		}
		b.close();
		
		s = wordList[r.nextInt(wordList.length)];
		

	}
	public String getAnswer(){
		
		return s;
	}
}

