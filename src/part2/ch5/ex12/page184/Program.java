package part2.ch5.ex12.page184;

class Program {
	public static void main(String[] args) {

		// ���� �����
		int kor, eng, math;
		
		// ���輺���� ������ ������
		int total; // �ʱ갪�� �Ϻη� ���� �� ��
		float avg;
		
		// ���輺�� �Է�
		kor = 60;
		eng = 70;
		math = 80;
		
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
		System.out.printf(" ���:%f\n", avg);
		System.out.println("��������������������������������������������");
		
	}
}