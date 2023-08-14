import java.util.*;

public class Calc
{
	public static void main(String arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();

		int flag = 0;
		while(flag==0){
		System.out.println("1- Addition || 2- Subtraction || 3- Multiplication || 4- Division || 5-Exit");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
		break;
		case 2:
		int diff = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + diff);
		break;
		case 3:
		int mult = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + mult);
		break;
		case 4:
		int div = num1 / num2;	
		System.out.println("Division of " + num1 + " by " + num2 + " is " + div);
		break;
		case 5:
		flag = 1;
		break;
		default:
		System.out.println("Wrong option");
		}
		}
	

	}

}