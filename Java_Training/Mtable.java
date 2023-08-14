import java.util.*;

public class Mtable
{
	public static void main(String arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		int i = 0;
		int pro = 0;
		while (i < 10){
		i++;
		pro = i * num1;
		System.out.println(i + " X " + num1 + " = " + pro);
		}

	}

}