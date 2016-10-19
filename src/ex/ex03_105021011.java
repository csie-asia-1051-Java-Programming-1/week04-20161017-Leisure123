package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex03_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		for(int i = 1 ; i <= n ; i++ ){
			for(int l = 1 ; l <= i ; l++){
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
