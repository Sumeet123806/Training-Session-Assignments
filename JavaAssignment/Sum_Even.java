package assignment1;
import java.util.Scanner;
public class Sum_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		double sum=(double)n/2;
		
		double res = 0;
		res = (sum/2)*(2*2+  (double)((n/2-1)*2)    );
		System.out.println("The Sum is "+(int)res);
		
		
		

	}

}
