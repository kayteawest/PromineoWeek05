
public class SpacedLogger implements Logger { // 3.b

	@Override
	public void log(String log) { // 7
		String result = "";
		for (int i = 0; i<log.length(); i++) { // standard forLoop - adds a space between each character in "log"
			result += log.charAt(i);
			if ( (i + 1) < log.length()) { // if statement - doesn't add a space if it's the end of the string
				result += " ";
			}
		} 
		System.out.println(result); // Will print "K a t h e r i n e"
	}

	@Override
	public void error(String error) { // 8
		String result = "";
		for (int i = 0; i<error.length(); i++) {
			result += error.charAt(i);
			if ( (i + 1) < error.length()) {
				result += " ";
			}
		} 
		System.out.println("ERROR: " + result); // Will print "ERROR: K a t i e"
	}

}
