package hw;
/*
 * Topic: ���ϥΪ̿�J1, 2, 3, �P4�ﶵ(�]�X�ϧ�)�C
 * Date: 2016/10/17
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw04_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true){
			System.out.print("�п�J�Q�n�Ҧ�(1,2,3,4(����)):");
			int mode = scn.nextInt();
			if(mode == 1){
				System.out.print("�п�Jn��(�_��):");
				int n = scn.nextInt();
				int m = n + 2;
				for(int i = 1 ; i <= (m/2)-1 ; i++ ){
					for(int l = i ; l <= (m/2) ; l ++){
						System.out.print("@");
					}
					
					System.out.println("");
				}
				    for(int i = 1 ; i <= (m/2) ; i++ ){
					   for(int l = 1 ; l <= i ; l++){
						System.out.print("@");
					}
					
					System.out.println("");
			  }
			}
			if(mode == 2){
				System.out.print("�п�Jn��(�_��):");
				int n = scn.nextInt();
				for(int i = 1 ; i <= (n/2)+1 ; i++ ){
					for(int l = 1 ; l <= i ; l++){
						System.out.print("%");
					}
					
					System.out.println("");
				}
				for(int i = 1 ; i <= (n/2) ; i++ ){
					for(int l = i ; l <= (n/2) ; l ++){
						System.out.print("%");
					}
					
					System.out.println("");
				}
			}
			if(mode == 3){
				System.out.print("�п�Jn��(�_��):");
				int n = scn.nextInt();
				for (int i = 1; i <= (n/2); i++) {
				      for (int j = n - 1; j > i; j--) {
				        System.out.print(" ");
				      }
				      for (int k = 1; k < i * 2; k++) {
				        System.out.print("*");
				      }
				      System.out.println();
				    }
				for (int i = (n/2)+1; i > 0; i--) {
				      for (int j = n - 1; j > i; j--) {
				        System.out.print(" ");
				      }
				      for (int k = 1; k < i * 2; k++) {
				        System.out.print("*");
				      }
				      System.out.println();
				    }
			}
			if(mode == 4){
				System.out.print("���¨ϥΥ��{��(=^�s^=)");
				break;
			}
			if(mode != 1 && mode != 2 && mode !=3 && mode != 4){
				System.out.println("���t�ΨèS����X�B�~���Ҧ�(-�d_- )");
			}
		}	
}
}