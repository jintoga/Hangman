package model;

public class Word {

	private String word;
	private int timeToGuess;

	public Word() {
		super();
	}

	public Word(String word, int timeToGuess) {
		super();
		this.word = word;
		this.timeToGuess = timeToGuess;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getTimeToGuess() {
		return timeToGuess;
	}

	public void setTimeToGuess(int timeToGuess) {
		this.timeToGuess = timeToGuess;
	}

}
