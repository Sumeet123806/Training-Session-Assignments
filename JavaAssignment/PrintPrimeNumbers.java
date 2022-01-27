package assignment1;
import java.util.Scanner;
public class PrintPrimeNumbers {

	
	public static void check(int n) {
		for(int i=2;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	public static  boolean isprime(int n) {
		int count=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		check(n);

	}

}
