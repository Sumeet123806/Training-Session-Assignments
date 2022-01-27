package assignment1;
import java.util.Scanner;
public class OddNumbers_50_100 {

	public static void main(String[] args) {
	  int i=50;
	  do {
		  if(i%2!=0) {
			  System.out.print(i+" ");
			  i++;
		  }
		  else {
			  i++;
		  }
	  }
	  while(i<=100);

	}

}
