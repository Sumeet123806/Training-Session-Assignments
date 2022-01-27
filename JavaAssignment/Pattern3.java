package assignment1;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n ");
		int n = sc.nextInt();
		int i=n;
	
		while(i>0) {
			int count=0;
			for(int j=0;j<=i-2;j++) {
				System.out.print(" ");
				count++;
			}
			for(int k=n;k>count;k--) {
			System.out.print("*");
		}
			System.out.println();
            i--;
	}

}
}
