/*p.109 ~113
4. �� ������
	:�񱳿����ڴ� �� �ǿ����ڸ� ���ϴµ� ���Ǵ� �����ڴ�.
	:�ַ�, ���ǹ�, �ݺ���, ���ǽĿ� �̿�.
	: �������� true�� false�� ����.
	: �񱳿����� = ���� ������
	: ���ϴ� Ÿ���� ���� �ٸ� ���, �ڷ����� ������ ū������ �ڵ� ����ȯ �� �񱳵ȴ� (����)

	4.1 ��Һ� ������ <  >  <=  >=
	:�� �ǿ������� ���� ũ�⸦ ���ϴ� �������̴�. (�� true, ���� false)
	:�⺻�� �߿����� boolean���� ������ ������ �ڷ����� �� ��밡��
	: ���������� ��� �Ұ�
	
	�񱳿�����					������
	>						�º����� ũ�� true, �ƴϸ� false
	<						�º� ���� ������ true �ƴϸ� false
	>=						�º� ���� ũ�ų� ������ true, �ƴϸ� false
	<=						�º� ���� �۰ų� ������ true, �ƴϸ� false

	4.2 � �� ������ == , !=
	:�� �ǿ������� ���� ������ �Ǵ� �ٸ����� ���ϴ� ������ ! ��!!!!
	: ��Һ� �����ڿʹ� �޸�, �⺻���� ������, �� ��� �ڷ����� ��� ����
	: �⺻���϶�, ������ ����Ǿ� �ִ� ���� �������� �˼� ����
	: �������϶�, ��ü�� �ּҰ��� �����ϱ⶧���� �� ���� �ǿ����� (��������)�� ���� ��ü��
	  ����Ű�� �ִ����� �� �� �ִ�.
	: �⺻���� �������� ���� ����ȯ�� �������� �ʴ�.
	  �׷��� ��� ������ ==, !=�� �⺻���� �������� ���� �� ����.
	  
	�񱳿�����					������
	==						�ΰ��� ������, true �ƴϸ� false
	!=						�ΰ��� �ٸ���, true �ƴϸ� false
	
	= : ������ ���� ������ �� ��� (���Կ�����)
	== : �� ���� �������� ��
 
 	[����] >=���� �ΰ��� ��ȣ�� �̷���� �����ڴ�
 	1) => ���� ��ȣ�� ������ �ٲٸ� �ȵ�.
 	2) > = ���� �߰��� ������ ������ �ȵ�.
 	
 	
 
 
 
 
 
 
 
 */












package org.JavaStandards_Ch3;

public class Operator3_2 {

	public static void main(String[] args) {
//3-21
//		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
//		System.out.printf("'0' == 0 \t %b%n", '0'==0);
//		System.out.printf("'A' == 65 \t %b%n", 'A'==65);
//		System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');
//		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 !='B');
//		
//		�� : 
//			10 == 10.0f 	 true 	//����ȯ float�� ����
//			'0' == 0 	 	 false	//����ȯ 48==0 
//			'A' == 65 	 	 true	//����ȯ 
//			'A' > 'B' 	 	 false	//����ȯ	65 > 66
//			'A'+1 != 'B' 	 false	//����ȯ	66!=66
//3-22
//		float f = 0.1f;
//		double d = 0.1;
//		double d2 = (double)f; //d2 = 0.01d
//		
//		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
//		System.out.printf("0.1==0.1f   %b%n", 0.1==0.1f);
//		System.out.printf("f=%19.17f%n", f);
//		System.out.printf("d=%19.17f%n", d);
//		System.out.printf("d2=%19.17f%n", d2);
//		System.out.printf("d==f  %b%n", d==f);
//		System.out.printf("d==d2 %b%n", d==d2);
//		System.out.printf("d2==f %b%n", d2==f);
//		System.out.printf("(float)d==f %b%n", (float)d==f);
//		
//				10.0==10.0f true
//				0.1==0.1f   false
//				f=0.10000000149011612
//				d=0.10000000000000000
//				d2=0.10000000149011612
//				d==f  false
//				d==d2 false
//				d2==f true
//				(float)d==f true
//		#float f = 0.1f;	//f�� 0.10000000149011612
//		#double d = 0.1;	//d�� 0.100000000000001
//p.112 ����

//���ڿ��� �� .equals();

//		String str = new String("abc");
//		//equals()�� �� ���ڿ��� ������ ������ true, �ٸ��� false
//		boolean result = str.equals("abc");
//		
//		System.out.println(result);
//		�� ���ڿ��� ���ϱ� ���ؼ��� equals()��� �޼��带 ����ؾ��Ѵ�.
//		�񱳿����� : �� ���ڿ��� ������ ������ ���� ��, ���ڿ��� ������ ���ٸ� �񱳴� ����
//		String�� Ŭ���� �Ʒ��� ���� new�� ����ؼ� ��ü�� �����ؾ���
//		String str = new String("abc");		//String Ŭ������ ��ü�� ����
//		String str = "abc;"					//���� ������ ������ ǥ��
//3-23	
//		String str1 = "abc";
//		String str2 = new String ("abc");
//		
//		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
//		System.out.printf("str1==\"abc\" ? %b%n",     str1=="abc");
//		System.out.printf("str2==\"abc\" ? %b%n",     str2=="abc");
//		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
//		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
//		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
//		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
//
//		"abc"=="abc" ? true
//		str1=="abc" ? true
//		str2=="abc" ? false
//		str1.equals("abc") ? true
//		str2.equals("abc") ? true
//		str2.equals("ABC") ? false
//		str2.equalsIgnoreCase("ABC") ? true
//
//		str2�� abc�� ������ �������� ==�� ���ϸ� false
//		������ ������ ���� �ٸ� ��ü
//		�׷��� equals�� �ٸ� ��ü���� ������ ������ false
//		�׷��� ���ڿ��� �񱳽� .equals()�� ���
//		��ҹ��� �������� �� �ϰ� �ʹٸ�, equalsIgnoreCase()
		
		
		
		
		
		
		
		
		

	}

}
