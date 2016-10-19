package hw;
/*
 * Topic: 使用者輸入正整數 n 與 m 然後計算(用C來計算)。
 * Date: 2016/10/17
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		System.out.print("請輸入m值:");
		int m = scn.nextInt();
		int a = 1 ;
		int e ;
		if(m > n){
			e=m;
			m=n;
			n=e;
		}
		int d = n - m;
		
		for(int i = n ; i > 0 ; i--){
			a = a*i;
		}
		int b = 1;
		for(int i = m ; i > 0 ; i--){
			b = b*i;
		}
		int c = 1;
		for(int i = d ; i > 0 ; i--){
			c = c*i;
		}
		System.out.print(a/(b*c));
	}

}
