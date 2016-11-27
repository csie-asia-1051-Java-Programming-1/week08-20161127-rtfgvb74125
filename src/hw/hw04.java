package hw;

/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Number nub = new Number();
		int x = scn.nextInt();
		int n = 1000;
		if (x < 10000 && x > 0) {
			for (int i = 0; i < 4; i++) {
				nub.number(x / n);
				x = x % n;
				n = n / 10;
			}
			System.out.println();
		}
	}
}
	class Number {
		public void number(int x) {
			switch (x) {
			case 1:
			int	data[][] = {{' ',' ',' ',' ','*'},
							{' ',' ',' ',' ','*'},
							{' ',' ',' ',' ','*'},
							{' ',' ',' ',' ','*'},
							{' ',' ',' ',' ','*'}};
			for(int i = 0;i<5;i++){
				for(int j = 0;j<5;j++){
					System.out.print(data[i][j]);
				}
				System.out.println();
			}break;
			case 2:
				int	data1[][] = {{'*','*','*','*','*'},
								{' ',' ',' ',' ','*'},
								{'*','*','*','*','*'},
								{'*',' ',' ',' ',' '},
								{'*','*','*','*','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data1[i][j]);
					}
					System.out.println();
				}break;
			case 3:
				int	data3[][] = {{'*','*','*','*','*'},
								{' ',' ',' ',' ','*'},
								{'*','*','*','*','*'},
								{' ',' ',' ',' ','*'},
								{'*','*','*','*','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data3[i][j]);
					}
					System.out.println();
				}break;
			case 4:
				int	data4[][] = {{'*',' ',' ','*',' '},
								{'*',' ',' ','*',' '},
								{'*','*','*','*','*'},
								{' ',' ',' ','*',' '},
								{' ',' ',' ','*',' '}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data4[i][j]);
					}
					System.out.println();
				}break;
			case 5:
				int	data5[][] = {{'*','*','*','*','*'},
								 {'*',' ',' ',' ',' '},
								 {'*','*','*','*','*'},
								 {' ',' ',' ',' ','*'},
								 {'*','*','*','*','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data5[i][j]);
					}
					System.out.println();
				}break;
			case 6:
				int	data6[][] = {{'*','*','*','*','*'},
								 {'*',' ',' ',' ',' '},
								 {'*','*','*','*','*'},
								 {'*',' ',' ',' ','*'},
								 {'*','*','*','*','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data6[i][j]);
					}
					System.out.println();
				}break;
			case 7:
				int	data7[][] = {{'*','*','*','*','*'},
								 {'*',' ',' ',' ','*'},
								 {'*',' ',' ',' ','*'},
								 {' ',' ',' ',' ','*'},
								 {' ',' ',' ', ' ','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data7[i][j]);
					}
					System.out.println();
				}break;
			case 8:
				int	data8[][] = {{'*','*','*','*','*'},
								 {'*',' ',' ',' ','*'},
								 {'*','*','*','*','*'},
								 {'*',' ',' ',' ','*'},
								 {'*','*','*','*','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data8[i][j]);
					}
					System.out.println();
				}break;
			case 9:
				int	data9[][] = {{'*','*','*','*','*'},
								 {'*',' ',' ',' ','*'},
								 {'*','*','*','*','*'},
								 {' ',' ',' ',' ','*'},
								 {'*','*','*','*','*'}};
				for(int i = 0;i<5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data9[i][j]);
					}
					System.out.println();
				}break;
			case 0:
				int	data10[][] = {{'*','*','*','*','*'},
								 {'*',' ',' ',' ','*'},
								 {'*',' ',' ',' ','*'},
								 {'*',' ',' ',' ','*'},
								 {'*','*','*','*','*'}};
				for(int i = 0;i <5;i++){
					for(int j = 0;j<5;j++){
						System.out.print(data10[i][j]);
					}
					System.out.println();
				}break;}
		}
	}


