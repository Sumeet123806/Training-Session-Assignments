package assignment1;
import java.util.Scanner;
public class Reverse_Array {
      
	
	public static void reverse(int start,int end,int arr[]) {
		while(start<end) {
			int temp = arr[start];
			arr[start]  =arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       
       for(int i=0;i<arr.length;i++) {
    	   arr[i] = sc.nextInt();
       }
       reverse(0,arr.length-1,arr);
       
     

	}

}
