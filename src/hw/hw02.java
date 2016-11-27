package hw;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入進制");
		int n = scn.nextInt();
		System.out.print("請輸入想要的數字");
		int m = scn.nextInt();
		System.out.print("轉換成多少進制");
		int x = scn.nextInt();
		int sum = 0;
		int a = 1;
		int b = 0;
		for(int i = 1;m>0;i*=n){
			sum = m%10;
			b = b+(sum*i);
			m = m/10;
		}
		System.out.println(fun(b,x,a));}
	public static int fun(int b,int x,int a){
		int sum1 = 0;
		int sum2 = 0;
		
		if(b>0){
			sum1 =  b%x;
			sum2 = sum2+(sum1*a);
			return sum2+fun(b/x,x,a*10);
		}else{
			return sum2;
		}
	}

}
