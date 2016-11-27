package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
import java.util.Random;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int data[][] = new int[a][b];
		int data2[][] = new int[b][c];
		int data3[][] = new int[a][c];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				data[i][j] = rnd.nextInt(9) + 1;
			System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < c; j++) {
				data2[i][j] = rnd.nextInt(9) + 1;
				System.out.print(data2[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < a; k++) {
					data3[k][i] += data[k][j] * data2[j][i];
				}
			}

		}
		for (int x = 0; x < a; x++) {
			for (int y = 0; y < c; y++) {
				System.out.print("答案:");
				System.out.print(data3[x][y] + "\t");
			}
			System.out.println();
		}

	}

}
