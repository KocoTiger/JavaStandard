/*p 38~39

 */




//���� 2-5
// �Ǽ��� ���� ���ڿ��� ����ϴ� ���
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_4_printf2 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = 010f;		// 0.10, 1.0e-1
		float f2 = 1e1f;		//10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);	//��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);	//���� ����
		System.out.printf("[%.8s]%n", url);		//���ʿ��� 8���ڸ� ���
		

	}//end main

}//end public class

//����� :
//f1=10.000000, 1.000000e+01, 10.0000
//f2=10.000000, 1.000000e+01, 10.0000
//f3=3140.000000, 3.140000e+03, 3140.00
//d=1.234568
//d=  1.2345678900
//[12345678901234567890]
//[www.codechobo.com]
//[   www.codechobo.com]
//[www.codechobo.com   ]
//[www.code]

/*
# �Ǽ��� ���� ��¿� ���Ǵ� ������
		%f 						%e							%g
	(�ַ� %f ����)				(�������� ���)					(���� �����ϰ� ǥ��)

-%f :�⺻������ �Ҽ��� ���� 6�ڸ������� 7�ڸ����� �ݿø�

			System.out.printf("d=%14.10f%n", d); //��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		1 2 3 4 1 2 3 5 6 7 8 9 1 0 (�ڸ���)
		    1 . 2 3 4 5 6 7 8 9 0 0

- �Ҽ����� ���ڸ��� ����
  �Ҽ��� ������ ���ڸ��� 0���� ä���
  ������ ���ڸ��� �������� ä�� ��ü �ڸ����� �����.

- ������ %s���� ���ڸ� �߰��� ���ϴ� ��ŭ�� ��� ������ Ȯ�� ��
  ���ڿ��� �Ϻθ� ��� ����
 		System.out.printf("[%s]%n", url);		//���ڿ��� ���̸�ŭ ��� ������ Ȯ��
		System.out.printf("[%20s]%n", url);		//�ּ� 20���� ��°��� Ȯ��. (��������)
		System.out.printf("[%-20s]%n", url);	//�ּ� 20���� ��°��� Ȯ��. (��������)
		System.out.printf("[%.8s]%n", url);		//���ʿ��� 8���ڸ� ���

	������ ���ں��� ���ڿ��� ���̰� ������ ���ڸ��� �������� ���
	������ �ִ� ���, �⺻������ ���� ���� ���ڿ��� ����.
	- �� ���̸� ���� ���� ����
	. �� ���̸� ���ڿ��� �Ϻθ� ��� ����	




*/
