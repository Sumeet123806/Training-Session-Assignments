package assignment1;
import java.util.Scanner;
public class Vowel_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch);
		switch(ch) {
		case 'a':{
			System.out.println("It is an Vowel ");
			break;
		}
		case 'e':{
			System.out.println("It is an Vowel ");
			break;
		}
		
		case 'i':{
			System.out.println("It is an Vowel ");
			break;
		}
		case 'o':{
			System.out.println("It is an Vowel ");
			break;
		}
		case 'u':{
			System.out.println("It is an Vowel ");
			break;
		}
		default:{
			System.out.println("Its Not an Vowel ");
		}
		
		}

	}

}
