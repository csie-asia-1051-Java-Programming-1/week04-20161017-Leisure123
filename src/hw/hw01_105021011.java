package hw;
/*
 * Topic: �ϥΪ̿�J n ���� n �� �O��ƦC (�� n = 5 ) 1, 1, 2, 3, 5�C
 * Date: 2016/10/17
 * Author: 105021011 �B�Э�
 */ 
import java.util.Scanner;
public class hw01_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn��(�����):");
		int n = scn.nextInt();
		int v1 = 1;
		int v2 = 1;
		int i = 2;
		int v3 =0;
		if(n == 1){
			System.out.print( v1 );
		}else if(n == 2){
			System.out.print(v1 + "," + v2);
		}else if(n >  2){
			System.out.print("1,1");
			for(int l = 2 ; i < n ; i++ ){
				v3 = v1 + v2;
				v1 = v2;
				v2 = v3;
				System.out.print("," + v3);
			}
		
		}

	}

}
