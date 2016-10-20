
public class HelloThreadRunnable implements Runnable {

	private Thread t;
	
	public HelloThreadRunnable() {
		t = new Thread(this, "New Thread");
		System.out.println("Thread created: " + t);
	}
	
	@Override
	public void run() {
		System.out.println("Hello from New Thread");
		
	}	
}
