class FunctionTest {

	public static void printLogo() {
		System.out.println("<<<<<<[���� ���α׷� �ΰ�]>>>>>>");
	}

	public static void printResult(int x, int y, int result) {
		System.out.printf("add(%d, %d) : %d\n", x, y, result);
	}

	public static void main(String[] args) {

		int x = 3, y = 3;
		int result = 0;

		printLogo();

		y++;
		result = x + y;

		printResult (x, y, result);
	}
}