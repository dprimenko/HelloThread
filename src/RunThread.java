
public class RunThread {	
	public static void main(String[] args) {
		new HelloThread().start();
		System.out.println("Hello from Main Thread!");
		System.out.println("Finishing process");
	}

}
