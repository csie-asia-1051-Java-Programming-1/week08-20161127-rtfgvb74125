package ex;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n);
	}

	public static void fun(int n) {
		 //String str = Integer.toBinaryString(n);
		 //System.out.println(str);
		int sum = 0,sum1=0,a=1;

		while (n > 0) {
			sum = n % 2;
			n = n / 2;
			sum1 = sum1+(sum*a);
			a=a*10;
		
		}
		System.out.print(sum1);
		
	}

}
