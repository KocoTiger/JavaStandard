/*p. 117
���� 3-25



 
 
 */










package org.JavaStandards_Ch3;

import java.util.*; //scannerŬ������ ����ϱ� ���� �߰�

public class Operator4_2 {

	public static void main(String[] args) {
//���� 3-25
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
				System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		
		if (('a'<= ch && ch <= 'z') \\ ('A' <= ch && ch <= 'Z')) {
				System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
		
	
		
		
		
		

	}

}
