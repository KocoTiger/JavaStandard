/* p 40~41
2.4 ȭ�鿡�� �Է� �ޱ� - Scanner

	���ݱ����� ȭ�鿡 ��¸� �ؿ���.
	���� ȭ������ ���� �Է¹޴� ����� ���ؼ� �������.
	�ڹٿ��� ȭ������ ���� �Է¹޴� ����� ������
	(JDK1.6���� �߰��� Console Ŭ������ �̿��ϴ� ��)
	�� Ŭ������ ��Ŭ������ ���� IDE���� �� �������� ����.
	
	[����] ȭ������ ���� �Է¹޴� ������� �ٺ������� ��� ����.
	  ���̸� ���� �ʿ� ����.
	  ��Ȳ�� �´� ���� ���� ����ϸ� ��.
	1. Scanner�� ����ϱ� ���� �Ʒ� �ѹ��� �߰�
	
	import java.util.*; //ScannerŬ������ ����ϱ� ���� �߰�
	
	2. ScannerŬ������ ��ü�� ����
	
	Scanner scanner = new Scanner (System.in); // Scanner Ŭ������ ��ü�� ����

	3. nextLine()�̶�� �޼��带 ȣ��
	   �Է´�� ���¿� �ִٰ� �Է��� ��ġ��
	   ����Ű�� ������ �Է��� ������ ���ڿ��� ��ȯ.
	 
	 String input = scanner.nextLine();			// �Է¹��� ������ input�� ����
	 int num = Integer.parseInt(input);			// �Է¹��� ������ intŸ���� ������ ��ȯ
	 
	   ���� �Է¹��� ���ڿ��� ���ڷ� ��ȯ��,
	   Integer.parseInt()��� �޼��带 �̿��ؾ߸� ��.
	   (�� �޼���� ���ڿ��� -> int Ÿ���� ������ ��ȯ)
	[����]���� ���ڿ��� floatŸ���� ������ ��ȯ�ϱ� ���ϸ�, Float.parseFloat()�� ���
		 �ٸ� Ÿ�������� ��ȯ p.493 ����.

	- ���, ScannerŬ�������� 
	  nextInt()  			 nextFloat() 
	  �� ���� ��ȯ���� ���ڷ� �ٷ� �Է¹��� �� �ִ¸޼��� ���� ����.
	  �� �޼������ ����ϸ�, 
	  ���ڿ� -> ���ڷ� ��ȯ�ϴ� ����� �ʿ����� ����.
	  
	 	int num = scanner.nextLine();		//������ �Է¹޾Ƽ� ���� num�� ����

	  �׷���, �޼������ ȭ�鿡�� ���������� ���� �Է¹޾Ƽ� ����ϱ⿡ ��ٷӴ�.
	  ���� ��� ���� nextLine()���� �Է¹޾Ƽ� ������ ��ȯ�ϴ� ���� �� ����.
 */



//���� 2-6
package org.javastandard.javaexercise.ch1variable;

import java.util.*; //ScannerŬ������ ����ϱ� ���� �߰�

	public class ch2_variableEx2_5_Scanner {
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);  //// Scanner Ŭ������ ��ü�� ����

			System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);		//�Է¹��� ���ڿ��� ���ڷ� ��ȯ
			
			System.out.println("�Է³��� :" + input);
			System.out.printf("num=%d%n", num);	
		
	}//end main

}//end public
	
	
//	�����:
//		22
//		�Է³��� :22
//		num=22
/*
	���� ���ڰ� �ƴ� ���� or ��ȣ�� �Է��ϸ�, �Է¹��� ���ڿ��� ���ڷ� ��ȯ�ϴ� ������
	Integer.parseInt()���� ������ �߻�
	Ư��, ������ �Է����� �ʵ��� �ؾ��Ѵ�.
  
 */
	
	
	
	
	
	
	
	
	
	
	
