/*
package jb02.part02;

	FileName : WhileTest.java
	1. While (����)
	2. do..while(����)
	Ȱ�� �� �������� Ȯ��
 */





package java_tutorials_bitCamp1;

public class WhileTest {
//main method
	public static void main(String[] args) {
		//while��
		int i=0;		//#1. ��ȯ���� ������ �ֱ����� int i �ʱ�ȭ
		while(i<10) {	//#2. ���� (boullean data type)
		//while(0){		//==> compile error (error�� Ȯ���ϸ�....)
			System.out.println("����� while�� ���ξ��� i="+i);
			i++;		//#3. ������			
		}

		//do-while��
		int j = 0;		//#1. ��ȯ���� ������ �ֱ����� int j �ʱ�ȭ
		do {
			System.out.println("\n\t����� do�� ������ j ="+j);
			j++;		//#2. ������
		} while (j<1);	//#3. ���� (boolean data type)
		
		System.out.println("\n============================\n");
		
		//while ���� �̿��Ͽ� 5���� ����ϴ� ���α׷�
		int k=1;
		while(k<10) {
			System.out.println("5*"+k+"="+5*k);
			k++;
		}
		
		//==> ���ѷ����� ���ѷ����Ĵ��� ���๮���� compile error ����
		while (true) {
			System.out.println("����� �ݺ��������� ���� ����");
		}
		
		//==>�Ʒ��� �ּ��� Ǯ�� compile error�� �����Ѵ� ������....
		//System.out.println("error�� �߻��Ѵ�. ������...");

	}//end of main

}//end of class