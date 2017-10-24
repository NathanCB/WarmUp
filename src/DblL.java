import java.util.ArrayList;

public class DblL {
	/*
	Given a word;
	I want to double each letter in the word;
	So that I can print a new word with each letter doubled;
	
	Example: input is "Done" 
			 output is "Doonee"
	*/
	
	public static String dblL(String s) {
		String word = "";
		char cL;
		for(int i=0; i< s.length(); i++) {
		    cL = s.charAt(i);
			word = word + cL + cL;
		}
		return word;
	}

	public static void main(String[] args) {
		System.out.println(dblL("Done"));
	}
}
