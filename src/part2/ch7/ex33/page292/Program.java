import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 30; x++)
				if (x == 0 && y == 0)
					System.out.printf("%c", '��');
				else if (x == 29 && y == 0)
					System.out.printf("%c", '��');
				else if (x == 0 && y == 14)
					System.out.printf("%c", '��');
				else if (x == 29 && y == 14)
					System.out.printf("%c", '��');
				else if (x == 0)
					System.out.printf("%c", '��');
				else if (x == 29)
					System.out.printf("%c", '��');
				else if (y == 0)
					System.out.printf("%c", '��');
				else if (y == 14)
					System.out.printf("%c", '��');
				else
					System.out.printf("%c", '��');
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		
		// ����ڿ��� ���� ��ǥ �ϳ��� �Է¹޴´�.
		int omokX, omokY; // ����
		System.out.print("���� ��ǥ �Է�( x sp y ) : ");	
		omokX = scan.nextInt();
		omokY = scan.nextInt();
		
		// ������ ���
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 30; x++)
				// Ư�� ��ġ ����
				if (x == omokX && y == omokY)
					System.out.printf("%c", '��');
				else if (x == 0 && y == 0)
					System.out.printf("%c", '��');
				else if (x == 29 && y == 0)
					System.out.printf("%c", '��');
				else if (x == 0 && y == 14)
					System.out.printf("%c", '��');
				else if (x == 29 && y == 14)
					System.out.printf("%c", '��');
				// �ܺ�
				else if (x == 0)
					System.out.printf("%c", '��');
				else if (x == 29)
					System.out.printf("%c", '��');
				else if (y == 0)
					System.out.printf("%c", '��');
				else if (y == 14)
					System.out.printf("%c", '��');
				// ������
				else
					System.out.printf("%c", '��');
			System.out.println();
		}
	}
}