
import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// ������ �迭 ����
		char[] board = new char[5 * 7];
		
		// -- ������ �ʱ�ȭ�ϱ�-------------------------
		// ������ '��' ���ڷ� �ʱ�ȭ
		for (int i = 0; i < 5 * 7; i++)
			board[i] = '��';
		
		// -- ������ ��輱 �ٹ̱�-----------------------
		// �� ���� ������
		board[0 * 7 + 0] = '��';
		board[0 * 7 + 6] = '��';
		board[4 * 7 + 0] = '��';
		board[4 * 7 + 6] = '��';
		
		// ��� ��輱
		for (int i = 0; i < 5; i++)
			board[0 * 7 + (i + 1)] = '��';
		// ���� ��輱
		for (int i = 0; i < 3; i++)
			board[(i + 1) * 7 + 0] = '��';
		// ���� ��輱
		for (int i = 0; i < 3; i++)
			board[(i + 1) * 7 + 6] = '��';
		// �ϴ� ��輱
		for (int i = 0; i < 5; i++)
			board[4 * 7 + (i + 1)] = '��';
		
		// -- ������ ��� -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y * 7 + x]);
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		// ����ڿ��� ���� ��ǥ�� �Է¹޴� �ڵ�
		int omokX, omokY; // ����
		System.out.print("���� ��ǥ �Է�( x sp y ) : ");
		omokX = scan.nextInt();
		omokY = scan.nextInt();
		
		board[omokY * 7 + omokX] = '��';
		
		// -- ������ ��� -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y * 7 + x]);
			System.out.println();
		}
	}
}