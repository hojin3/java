
import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// ������ �迭 ����
		char[][] board = new char[5][7];
		for (int y = 0; y < 5; y++)
			for (int x = 0; x < 7; x++)
				board[y][x] = '��';
		
		// -- ������ ��輱 �ٹ̱�-----------------------
		// �� ���� ������
		board[0][0] = '��';
		board[0][6] = '��';
		board[4][0] = '��';
		board[4][6] = '��';

		// ��� ��輱
		for (int n = 1; n <= 5; n++)
			board[0][n] = '��';
		// ���� ��輱
		for (int n = 1; n <= 3; n++)
			board[n][0] = '��';
		// ���� ��輱
		for (int n = 1; n <= 3; n++)
			board[n][6] = '��';
		// �ϴ� ��輱
		for (int n = 1; n <= 5; n++)
			board[4][n] = '��';
		
		// -- ������ ��� -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		
		// ����ڿ��� ���� ��ǥ �ϳ��� �Է¹޴´�.
		int omokX, omokY; // ����
		System.out.print("���� ��ǥ �Է�( x sp y ) : ");
		omokX = scan.nextInt();
		omokY = scan.nextInt();
		
		board[omokY][omokX] = '��';
		
		// -- ������ ��� -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}
	}
}