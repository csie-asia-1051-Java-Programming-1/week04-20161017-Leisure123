package hw;
/*
 * Topic: �{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A
 *        ����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA
 *        �t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn�C
 * Date: 2016/10/17
 * Author: 105021011 �B�Э�
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
			System.out.println("�п�J�@�ӼƦr:");
			input = scn.nextInt();
			if(input == 0){
				z = z + 1;
			}else if(input > 0){
				p = p + 1;
			}else if(input < 0){
				n = n + 1;
			}
			if(input == 999){
				System.out.println("���Ʀ�" + (p-1) + "��");
				System.out.println("�t�Ʀ�" + n + "��");
				System.out.println("�s��" + z + "��");
				System.out.print("�O�_�~�� (Y/N):");
				check = scn.next().charAt(0);
				if(check == 'n' || check == 'N'){
					System.out.print("�P�§A���ϥ�-�s-");
					break;
				}
			}

	}

}
}