package assignment1;
import java.util.Scanner;
public class Swap_Two_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping ");
		System.out.println("a = "+a+" and "+" b = "+b);

	}

}
