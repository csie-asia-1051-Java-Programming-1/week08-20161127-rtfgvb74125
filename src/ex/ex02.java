package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021056 王家恩
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();// 輸入的數值
		int m = scn.nextInt();// 原本的進制
		int x = scn.nextInt();// 轉換成多少進制
		fun(n, m, x);
	}

	public static void fun(double n, int m, int x) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int a = 1;
		
		double b = 0;
		for (int i = 0; i < m; i++) {
			sum = (int) (n%10);
			 b = (int) b+(sum*(Math.pow(m, i)));
			 n = n/10;
		}
		while (b > 0) {
			sum2 = (int) (b % x);
			b =  b/ x;
			sum1 = sum1 + (sum2 * a);
			a = a * 10;

		}
		System.out.print(sum1);

	}

}
