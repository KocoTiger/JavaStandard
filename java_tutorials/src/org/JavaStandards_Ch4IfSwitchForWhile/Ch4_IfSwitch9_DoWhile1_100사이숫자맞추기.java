/*p. 173~174
#2.3 do-while��
	: do-while���� while���� ���� (�⺻���� ������ ����)
	: ���ǽİ� ��{}�� ������ �ٲ���� ��
	: �׷��� {}�� ���� ���� �Ŀ� ���ǽ��� ��.
	: while���� ���ǽ��� ����� ���� {}�� �ѹ��� ������� ���� ��������,
	  do-while���� �ּ��� �ѹ��� ����� ���� ����.
		
		<�⺻ ����>
		do{
					//���ǽ��� �������� ���� �� ����� ������� ���´�.
		} while(���ǽ�); 		//<--- ����  ;�� ���� �ʵ��� ����
		
	: �׸� ���� �������� ����.
	[���� 4-28]ó�� �ݺ������� ������� �Է��� �޾Ƽ� ó���� �� ����






 */




package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

	public class Ch4_IfSwitch9_DoWhile1_100���̼��ڸ��߱� {
	
		public static void main(String[] args) {
//[���� 4-28]		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random () * 100)+1;	//1~100������ ������ ���� ����
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}//end else if
		}//end do		
		while (input != answer);
		
		System.out.println("�����Դϴ�.");


	}//end main

}//end public
