package part2.ch1.ex07.page77;

class Program {
	public static void main(String[] args) {

		// ���� �����
		int kor, eng, math;

		// ���輺���� ������ ������
		int total;
		float avg;

		// ���輺�� �Է�
		kor = 60;
		eng = 70;
		math = 80;

		// ���輺�� ���
		total = kor + eng + math;
		avg = total / 3.0f;
		
		// ���輺�� ���
		System.out.printf("����:%d, ���:%f", total, avg);
	}
}