
public class App { // 9

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger(); // 10
		
		System.out.println("AsteriskLogger Test"); // 11
		System.out.println("\r"); // Line break
		
		logger.log("Katherine");
		
		System.out.println("\r"); // Line break
		
		logger.error("Katie");
		
		System.out.println("\r"); // Line break

		
		logger = new SpacedLogger(); // 10
		
		System.out.println("SpacedLogger Test"); // 11
		System.out.println("\r"); // Line break
		
		logger.log("Katherine");
		logger.error("Katie");
	}

}
