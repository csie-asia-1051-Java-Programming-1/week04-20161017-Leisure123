package hw;
/*
 * Topic: �ϥΪ̿�J����� n �P m �M��p��(��C�ӭp��)�C
 * Date: 2016/10/17
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw02_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Jn��:");
		int n = scn.nextInt();
		System.out.print("�п�Jm��:");
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
