
public class AsteriskLogger implements Logger { // 3.a

	@Override
	public void log(String log) { // 4
		System.out.println("***" + log + "***\r");
		
	}

	@Override
	public void error(String error) { // 5
		System.out.println("****************\r" + "\r" + "***Error: " + error + "***\r" + "\r" + "****************");
		
	}

}
