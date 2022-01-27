package assignment1;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Third Number ");
		int c = sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+" is Greatest Among Three ");
		}
		
		else if(b>a&b>c) {
			System.out.println(b+" is Greatest Among Three ");
		}
		else {
			System.out.println(c+" is Greatest Among Three ");
		}

	}

}
