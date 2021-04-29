
public class HiddenWord {
	private String word1;
	private char[] wordArr;

	public HiddenWord(String input) {
		word1 = input;
		wordArr = word1.toCharArray();
	}

	public String getHint(String guess) {
		char[] guessArr = guess.toCharArray();
		char[] returnArr = new char[guess.length()];
		for (int i = 0; i < guess.length(); i++) {
			if(guessArr[i] == wordArr[i]) {
				returnArr[i] = guessArr[i];
			}else {
				String temp = "" + guessArr[i];
				if(word1.contains(temp)){
					returnArr[i] = '+';
				}else {
					returnArr[i] = '*';
				}
			}
		}
		return returnArr.toString();
	}

}
