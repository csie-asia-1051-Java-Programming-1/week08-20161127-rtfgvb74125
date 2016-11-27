package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int a = 1;
		while(n>0){
			sum = (int)(n%2);
			n = n/2;
			sum2 = sum2+(a*sum);
			a = a*10;
		}
		String str = String.valueOf(sum2);
		int x = str.length();
		System.out.println(fun(sum2,sum3));
	}

	public static int fun(int sum2,int sum3){
		if(sum2%10==1){
			sum3++;
			if(sum2/10==0){
				return sum3;
			}
			return fun(sum2/10,sum3);
		}else{
			return fun(sum2/10,sum3);
		}
	}
}
