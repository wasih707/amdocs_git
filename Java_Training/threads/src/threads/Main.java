package threads;

class Demo extends Thread
{
	public void run() {
		System.out.println("Thread is running");
	}
}
public class Main {
	public static void main( String[] args) {
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1, "hi");
		Thread t2 = new Thread("bye");
		t1.start();
		Thread.sleeo
		System.out.println(d1.getName());
	}

}
