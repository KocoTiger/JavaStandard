/* p. 56~57
# Ư�� ���� �ٷ��
	������ �ܿ� tab�̳� backspace���� Ư�� ���ڸ� �����Ϸ���
		char tab = '\t';		//����tab�� �� ���ڸ� ����
	- '\t' : ��,tab�� �ǹ�
		   : �� ���ڷ� �̷���� ������ �� ����
		   Ư������						���� ���ͷ�
		 tab						\t
		 backspace					\b
		 form feed					\f
		 new line					\n
		 carriage return			\r
		 ��������(\)					\\
		 ���� ����ǥ					\'
		 ū����ǥ						\"
		 �����ڵ�(16����)����  			\u �����ڵ� (��: char a='\u0041')
			[ǥ2-12]	Ư�����ڸ� ǥ���ϴ� ���


 */





//���� 2-8, SpecialCharEx.java
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_7_PrimitiveType2 {

	public static void main(String[] args) {
		System.out.println('\'');				//'''ó�� �Ҽ� ����.
		System.out.println("abc\t123\b456");	// \b�� ���� 3�� ��������.
		System.out.println('\n');				//����(new line)���� ����ϰ� ����
		System.out.println("\"Hello\"");		//ū����ǥ�� ����Ϸ��� �̷��� �Ѵ�
		System.out.println("c:\\");

	}

}

//����� :
//	'
//	abc	123456
//
//
//	"Hello"
//	c:\

	