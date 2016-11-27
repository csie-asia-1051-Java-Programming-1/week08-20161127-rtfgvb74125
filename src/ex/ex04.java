package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;

public class ex04 {
	static int a;
	static int b;
	static int c;
	static int sum;
	public static int x(int a, int b, int c) {
		switch (c) {
		case 1:
			sum = a + b;
			break;
		case 2:
			sum = a - b;
			break;
		case 3:
			sum = a * b;
			break;
		case 4:
			sum = a / b;
			break;
		case 5:
			sum = (int) Math.sqrt(a);
			break;
		case 6:
			sum = (int) Math.pow(a, 2);
			break;
		case 7:
			sum = (int) Math.pow(a, 3);
			break;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		System.out.println("請輸入(1):+,(2):-,(3):*,(4):/,(5):根號,(6):平方,(7):立方");
		c = scn.nextInt();
		if (c > 4) {
			b = 0;
		} else {
			b = scn.nextInt();
		}
		show();
	}

	public static void show() {
		System.out.println(x(a, b, c));
	}
}

	
