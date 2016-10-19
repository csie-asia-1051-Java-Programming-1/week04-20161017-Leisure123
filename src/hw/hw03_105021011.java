package hw;
/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，
 *        直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，
 *        負數總共有幾個，使用者可以重覆執行直到使用者輸入n。
 * Date: 2016/10/17
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw03_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int input;
		int p = 0;
		int n = 0;
		int z = 0;
		char check ;
		while(true){
			System.out.println("請輸入一個數字:");
			input = scn.nextInt();
			if(input == 0){
				z = z + 1;
			}else if(input > 0){
				p = p + 1;
			}else if(input < 0){
				n = n + 1;
			}
			if(input == 999){
				System.out.println("正數有" + (p-1) + "個");
				System.out.println("負數有" + n + "個");
				System.out.println("零有" + z + "個");
				System.out.print("是否繼續 (Y/N):");
				check = scn.next().charAt(0);
				if(check == 'n' || check == 'N'){
					System.out.print("感謝你的使用-ω-");
					break;
				}
			}

	}

}
}