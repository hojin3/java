import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		int kor = 0, eng = 0, math = 0;
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		
		int index = 0;
		 
		Scanner scan = new Scanner(System.in);
		EXIT: while (true) {
		 	
			MainMenu menu;
		 	
			System.out.println("��������������������������������������������");
			System.out.println("�� ���� �޴� ��");
			System.out.println("��������������������������������������������");
			System.out.print(" 1. ���� �Է£�n");
			System.out.print(" 2. ���� ��£�n");
			System.out.print(" 3. ���α׷� �����n");
			System.out.print(" ���� > ");
			
			menu = MainMenu.values()[scan.nextInt() - 1];
			
			switch (menu) {
			case INPUT: {			
				int more = 0;
				
				do {
					System.out.println("��������������������������������������������");
					System.out.println("�� ���� �Է� ��");
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
					
					System.out.println("����������������������������������");
					System.out.print("�� �Է��Ͻðڽ��ϱ�?(1 or 0) : ");
					
					more = scan.nextInt();
					
				} while (more == 1);
				break;
			}
			case PRINT: {
				int total;
				float avg;
				
				System.out.println("��������������������������������������������");
				System.out.println("�� ���� ��� ��");
				System.out.println("��������������������������������������������");
				
				for (int i = 0; i < index; i++) {
					// i ��° ���� �ӽ� ������ ���
					kor = kors[i];
					eng = engs[i];
					math = maths[i];

					// ���輺�� ���
					total = kor + eng + math;
					avg = total / 3.0f;
					System.out.printf(" ���� %d��n---------��n", i + 1);
					System.out.printf(" ����:%d��n", kor);
					System.out.printf(" ����:%d��n", eng);
					System.out.printf(" ����:%d��n", math);
					System.out.printf(" ����:%d��n", total);
					System.out.printf(" ���:%.2f��n", avg);
					System.out.println("����������������������������������");
				}
				break;
			}
			case END:
				break EXIT;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�. �Է��� �� �ִ� ������ 1~3 �Դϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
}