
import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// ���� �����
		int kor=0, eng=0, math=0;
		
		// ���輺���� ������ ������
		int total; // �ʱ갪�� �Ϻη� ���� �� ��
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		while(true) {
		
			//���� �޴� �ڵ尡 �� �κ�
			System.out.println("��������������������������������������������");
			System.out.println("��        ���� �޴�          ��");
			System.out.println("��������������������������������������������");
			System.out.print(" 1. ���� �Է�\n");
			System.out.print(" 2. ���� ���\n");
			System.out.print(" 3. ����\n");
			System.out.print(" ���� > ");
			menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("��������������������������������������������");
				System.out.println("��        ���� �Է�          ��");
				System.out.println("��������������������������������������������");
				System.out.print(" ����:");
				kor = scan.nextInt();
				System.out.print(" ����:");
				eng = scan.nextInt();
				System.out.print(" ����:");
				math = scan.nextInt();
				System.out.println("��������������������������������������������");
			}			
			else if(menu == 2) {
				
				// ���輺�� ���
				total = kor + eng + math;
				avg = /* ������ */ total / 3;
				
				// ���輺�� ��� �κ�		
				System.out.println("��������������������������������������������");
				System.out.println("��        ���� ���          ��");
				System.out.println("��������������������������������������������");
				System.out.printf(" ����:%d\n", kor);
				System.out.printf(" ����:%d\n", eng);
				System.out.printf(" ����:%d\n", math);
				System.out.printf(" ����:%d\n", total);
				System.out.printf(" ���:%.2f\n", avg);
				System.out.println("��������������������������������������������");
			}			
			else if(menu == 3)
				break;
		}
		
	}
}