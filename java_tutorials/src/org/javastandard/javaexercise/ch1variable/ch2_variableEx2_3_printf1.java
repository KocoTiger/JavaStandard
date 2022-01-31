/* p~36~38 �߰�
  2.3 ����ȭ�� ��� = printf()
- �׵��� println() <- ����ϱ� �������� 
  ������ ���� �״�� ��� (���� ��ȯ���� �ʰ�� �ٸ� �������� ��� �Ұ�)
  
  ���� ���̶� �ٸ� �������� ����ϰ� ������,
  	ex> �Ҽ��� ��° �ڸ������� ���, ������ 16���� or 8������ ���
  	-> printf ���

  printf()�� ������(spectifier)�� ���� ������ ���� �������� �������� ��ȯ ��� ��� ����.
  	ex> ������ ������ ����� ���� 10�� ������ ����Ҷ�
  		������ %d�� ���
  		������ ���� ������ �������� ��ȯ, �����ڴ�� �ִ´�
  	ex> intŸ�� ����, age�� ���� 14, print()�� ������ %d ��� 14�� �־ ���
  	
  		System.out.printf("age:%d", age);
  		System.out.printf("age:%d", 14);
  		System.out.printf("age:14");		//"age:14"�� ȭ�鿡 ���
  -	���� ����Ϸ��� ���� 2�����, �����ڵ� 2�� ���
  -	��µ� ���� �������� ������ ��ġ�ؾ� ��.
  - 3���̻��� ���� �����ڸ� �����ؼ� ��� �� �� �ִ�. (������ ������ ����)
  		System.out.printf("age:%d", "year:%d", 14, 2014);
  		��� �� : age:14year:2014
  		
- println()���� �޸� printf()�� ����� �ٹٲ� ���� ����
[����] �ٹٲ� ������ : %n, \n  (os���� �ٹٲ� ���ڰ� �ٸ� �� �ֱ� ���� %n�� ����ϴ� ���� ����)

		System.out.printf("age:%d", age); //��� �� �ٹٲ��� ���� �ʴ´�.
		System.out.printf("age:%d%n", age); //��� �� �ٹٲ��� �Ѵ�.

- printf()�� ������ ��, ���� ��� �Ǵ� �͵�

		������					����
		%b					�Ҹ��� (boolean)
		%d					10���� (decimal integer)
		%o					8���� (octal integer)
		%x, %X				16���� (hexadecimal integer)
		%f					10���� (decimal float)
		%e, %E				��������ǥ�� (exponent)				
		%c					���� (character)
		%s					���ڿ� (string)

 */


//���� 2-4/ch2/printfEx1.java
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_3_printf1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;  //long hex : 0xFFFFFFFFFFFFFFFFL;
		
		int octNum = 010;			//8���� 10, 10�����δ� 8
		int hexNum = 0x10;			//16���� 10, 10�����δ� 16
		int binNum = 0b10;			//2���� 10, 10�����δ� 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		//System.out.printf("c=%d%n", c); //�̷��� ������ ���� ���� ������ �� �ȳ���
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);	//'#'�� ���λ� (16���� 0x, 8���� 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum );
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

	}//end main

}//end public


//���� ��� : 
//	b=1
//	s=2
//	c=A, 65 
//	finger=[   10]
//	finger=[10   ]
//	finger=[00010]
//	big=100000000000
//	hex=0xffffffffffffffff
//	octNum=10, 8
//	hexNum=10, 16
//	binNum=10, 2

/*
������ ���� printf()�� ����ϴ� ����
	������ ����Ҷ� ������ %d���
	��µǴ� ���� ������ ������ ���ڷ� ������ �� �ִ�.
	<�������� ���� �ٷ� ���� ���� ����� �� �� �ʿ��� ���>
	
	�Ʒ��� ����� ���� 0�� - �� � ���� �ϴ��� �˼� ����.
		System.out.printf("finger=[%5d]%n", finger); finger=[   10]
		System.out.printf("finger=[%-5d]%n", finger); finger=[10   ]
		System.out.printf("finger=[%05d]%n", finger); finger=[00010]

	������ %x �� %o�� 
	#�� ����� ���λ� 0x�� 0�� ���� �ٴ´�.
	%X�� 16������ ���Ǵ� ���λ�� �����ڸ� �빮�ڷ� ����Ѵ�. (X�� �빮�ڷ� ����)
		
		System.out.printf("hex=%x%n", hex);		//hex=ffffffffffffffff
		System.out.printf("hex=%#x%n", hex);	//hex=0xffffffffffffffff
		System.out.printf("hex=%#X%n", hex);	//hex=0XFFFFFFFFFFFFFFFF

	10������ 2������ ������ִ� �����ڴ� ����.
	������ 2�� ���ڿ��� ��ȯ���ִ�
	Integer.toBinaryString(int i)�� ���
	�� �޼���� ������ 2������ ��ȯ�ؼ� ���ڿ��� ��ȯ-> ������ %s�� ���
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

	<C������ ������>
	C������ charŸ���� ���� ������ %d�� ����� ��������,
	�ڹٿ����� ����� ���� �ʴ´�!
	�Ʒ��� ���� intŸ������ ����ȯ �ؾ߸� %d�� ��� ����.
		System.out.printf("c=%c, %d %n", c, (int)c);	//����ȯ�� ���ʿ�. (%d�� �������)

 */

















