
import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// ���� �����
		int kor = 0, eng = 0, math = 0;
		int kors[] = new int[3];
		int engs[] = new int[3];
		int maths[] = new int[3];
		
		int index = 0;

		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		EXIT: while (true) {
			System.out.println("��������������������������������������������");
			System.out.println("��        ���� �޴�          ��");
			System.out.println("��������������������������������������������");
			System.out.print(" 1. ���� �Է�\n");
			System.out.print(" 2. ���� ���\n");
			System.out.print(" 3. ���α׷� ����\n");
			System.out.print(" ���� > ");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("��������������������������������������������");
				System.out.println("��        ���� �Է�          ��");
				System.out.println("��������������������������������������������");
				
				do {
					System.out.print(" ����:");
					kor = scan.nextInt();
					if (kor < 0 || kor > 100)
						System.out.println("������ ����(0~100)�� ������ϴ�. ���Է��ϼ���");
				} while (kor < 0 || kor > 100);
				
				do {
					System.out.print(" ����:");
					eng = scan.nextInt();
					if (eng < 0 || eng > 100)
						System.out.println("������ ����(0~100)�� ������ϴ�. ���Է��ϼ���");
				} while (eng < 0 || eng > 100);
				
				do {
					System.out.print(" ����:");
					math = scan.nextInt();
					if (math < 0 || math > 100)
						System.out.println("������ ����(0~100)�� ������ϴ�. ���Է��ϼ���");
				} while (math < 0 || math > 100);
				
				kors[index] = kor;
				engs[index] = eng;
				maths[index] = math;
				index++;
				
				System.out.println("��������������������������������������������");
				break;
				
			case 2:
				// ���輺�� ���
				total = kor + eng + math;
				avg = total / 3.0f;
				
				// ���輺�� ���
				System.out.println("��������������������������������������������");
				System.out.println("��        ���� ���          ��");
				System.out.println("��������������������������������������������");
				
				for (int i = 0; i < 3; i++) {
					System.out.printf(" ���� %d\n---------------------\n", i + 1);
					System.out.printf(" ����:%d\n", kor);
					System.out.printf(" ����:%d\n", eng);
					System.out.printf(" ����:%d\n", math);
					System.out.printf(" ����:%d\n", total);
					System.out.printf(" ���:%.2f\n", avg);
					System.out.println("��������������������������������������������");
				}
			case 3:
				break EXIT;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�. �Է� ���ٽ� �Է����ּ���");
			}
		}

	}
}