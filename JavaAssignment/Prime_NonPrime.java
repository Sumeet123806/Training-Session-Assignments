package assignment1;
import java.util.Scanner;
public class Prime_NonPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		int count=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(n+" is not prime");
		}
		else {
			System.out.println(n+" is prime");
		}

	}

}
