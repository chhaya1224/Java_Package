//package java_package;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numebr");
		int num=sc.nextInt();
		int rem,rev=0;
		while(num!=0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		System.out.println("Reverse number =="+rev);

	}

}
