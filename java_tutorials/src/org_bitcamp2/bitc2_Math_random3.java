package org_bitcamp2;

public class bitc2_Math_random3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ran = Math.random(); 
		System.out.println( ran ); 

		int min = 10;
		int max = 45;

		int num = (int) ((ran*100000) % (max-min+1) + min); //���� : ��������, ������ �ϰ� ����ȯ�� ���߿� �ض�!
						//num %= 36; // : �ִ밪 ����
						//num += 10; // 10~45 : �ּҰ� ����

		System.out.println ( num );

	}

}
//�ּ�0���� ���� 1�̸��� �Ǽ���,  �Ǽ� ��(floating number)
//�⺻ ���� 6�ڸ� (0.000000)
////��ǻ�Ϳ��� ������ �Ǽ��� ��ȯ������ ������ ���� Ƣ��´�
////
//���� ���ϴ� ������ 10�̻�~45���� �� �ǵ���   �޵��� �����. 