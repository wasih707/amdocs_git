package lambda; 
interface DemoInt
{
	void show();
}
/*class Demoimp implements DemoInt{
	public void show() {
		System.out.println("Hi");
	}
}*/
public class DemoLF {
	public static void main(String ar[]) {
		DemoInt d1 =()->System.out.println("Hi, Welcome to the session.");
		
		d1.show();
	}

}
