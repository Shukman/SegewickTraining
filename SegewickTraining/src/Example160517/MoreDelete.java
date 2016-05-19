package Example160517;

import java.util.Scanner;

public class MoreDelete {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("введите первое число: ");
		int num1 = in.nextInt();
		
		System.out.print("введите второе число: ");
		int num2 = in.nextInt();
		
		int num = del(num1, num2);
		System.out.println(num);
	}
	
	public static int del(int k, int n){
		if(n == 0){
			return k;
		}
		int r = k % n;
		return del(n, r);
	}

}
