package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n),
 *        Y 可以重新輸入, n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex02_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char con ,check ;
			while(true){
			System.out.println("請輸入n值:");
			int n = scn.nextInt();
			System.out.println("請輸入m值:");
			int m = scn.nextInt();
			for(int i = 1 ; i <= m ; i++ ){
				for(int l = 1 ; l <= n ; l++){
					System.out.print(l + "*" + i + "=" + i*l + "\t");
				}
				System.out.println("");
				}
			System.out.print("是否繼續(Y/N):");
			check = scn.next().charAt(0);
			if(check == 'n' || check == 'N'){
				break;
			}
			
			}
			System.out.print("謝謝使用本系統XD");
		}

	}

