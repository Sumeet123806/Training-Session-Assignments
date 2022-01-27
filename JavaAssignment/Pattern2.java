package assignment1;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the Value of n ");
		int n = sc.nextInt();
		
		int i=n;
		while(i>0) {
			for(int j=0;j<n;j++) {
				System.out.print(n+" ");
			}
			System.out.println();
			i--;
		}

	}

}
