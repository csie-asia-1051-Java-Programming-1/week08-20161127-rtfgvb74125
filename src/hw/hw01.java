package hw;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int sum2 = 0;
		int a = 1;
		System.out.println(fun(n, sum, sum2, a));
	}

	public static int fun(int n, int sum, int sum2, int a) {
		if (n > 0) {
			sum = (int) (n % 2);
			sum2 = sum2 + (a * sum);
			return fun(n / 2, sum, sum2, a * 10);
		} else {
			return sum2;
		}
	}
}
