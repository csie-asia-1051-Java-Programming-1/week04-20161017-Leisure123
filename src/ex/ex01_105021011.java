package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex01_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int tol = 1 , i = 0;
		float aver = 0;
		while(true){
			System.out.print("請輸入一個正整數或0(-1則停止):");
			int n = scn.nextInt();
			tol = tol + n ;
			i++;
			if(n == -1){
				break;
			}
			aver = tol / i;
		}
		System.out.print("總和為" + tol);
		System.out.print("平均為" + aver);
	
	}
}