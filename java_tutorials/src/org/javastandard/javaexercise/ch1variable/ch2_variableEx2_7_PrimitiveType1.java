/* p. 55 ~56
#4.�⺻�� (primitive type)

	#4.1 ���� (boolean)
	���� boolean
	: true or false�� �ϳ��� ����
	: �⺻�� (default)�� false�̴�.
	: boolean�� yes/no		on/off���� �� ������ �ַ� ���
	: true�� false, �� ���� ���� ǥ���ϸ� �ǹǷ� 1bit�� ���������
	  �ڹٿ����� �����͸� �ٷ�� �ּҴ����� byte�� 1byte��.
	
	ex> �Ʒ��� power��� boolean�� ������ ����, true�� �ʱ�ȭ��.
		boolean power = true;		//ok
		boolean power = False;		//����. ��ҹ��� ���е�. true or false�� ����
	- �ڹٿ����� ��ҹ��ڰ� ����
	: TRUE�� true�� �ٸ������� ����

	#4.2 ������ - char
	������ char
	: �Ѱ��� �ڷ����ۿ� ����.
	:���ڸ� �����ϱ� ���� ���� ��
	: charŸ���� ������ �� �ϳ��� ���ڸ��� ����
	ex> charŸ���� ���� ch�� ����, ���� 'A'�� �ʱ�ȭ
		char ch = 'A'		//���� A�� char Ÿ���� ���� ch�� ����
	: ���� ������ ������ ���ڰ� ����Ǵ� �� ������, ������ �����ڵ�(����)�� ����Ǵ� ��,
	: ��ǻ�ʹ� ���ڹۿ� �𸥴�. ����A�� �����ڵ�� 65. ���� ch�� 65�� ����
	
	�׷��� ���� ���ͷ� ���, ������ �����ڵ带 ���� ������ ���� �ִ�.
	ex> �� ������ ������ ����� ��´�.
			char ch = 'A';		//���� A�� charŸ���� ���� ch�� ����
			char ch = 65;		//������ �ڵ带 ���� ���� ch�� ����
	����, � ������ �����ڵ带 �˰� ������,
	ex>
			int code = (int)ch;		//ch�� ����� ���� int Ÿ������ ��ȯ�Ͽ� ����
	- � Ÿ�� (type,��) -> �ٸ� Ÿ������ ��ȯ -> ����ȭ (ĳ����, casting)�̶� ��.
	
	[���� 2-7]CharToCode.java
			char ch = 'A';			//char ch = 65;
			int code = (int)ch;		//ch�� ����� ���� intŸ������ ��ȯ�Ͽ� ����
			
			System.out.printf ("%c=%d(%#X)%n", ch, code, code);
			
			char hch = '��';			//char hch = 0xAC00;
			System.out.printf ("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

 
 */


//CharToCode.java
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_7_PrimitiveType1 {

	public static void main(String[] args) {
		char ch = 'A';			//char ch = 65;
		int code = (int)ch;		//ch�� ����� ���� intŸ������ ��ȯ�Ͽ� ����
		
		System.out.printf ("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '��';			//char hch = 0xAC00;
		System.out.printf ("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

	}

}

/*
 * ���� ���:
 * 	A=65(0X41)
	��=44032(0XAC00)

	- ���� ����� ���� 
	: A�� �����ڵ� = 65 (16������ 0x41)
	: ���� �����ڵ� = 44032 (16������ 0xAC00)
	ex> ���� ���ͷ� ��� �����ڵ带 ���� ��� ����
			char hch = 0xAC00;		//char hch = '��'
			char hch = '\uAC00';	//�̷��Ե� ����
 

 */













