/*
package jb01.part07;
	FileName : IfElse02.java
	
	1. ���ǿ����� ����
	2. �б⹮ if-else����
	3. AND : &, && ������
	4. OR  : |, ||������
 */


package BitCamp_Code_20220207;

public class BitCampComputer00_IfElse02 {

	//main method
		public static void main(String[] args) {
			int x=1;
			int y=2;
			
			//&==> and ������
			if(x==3 & y==2) {
				System.out.println("x=1 �̰� y=2 �Դϴ�");
			}
			
			//|==> or ������
			if(x==1 | y==3) {
				System.out.println("x=1 �̰ų� y=3 �Դϴ�");
			}

			//&&==> and ������
			if(x==3 && y==2) {
				System.out.println("x=1 �̰� y=2 �Դϴ�");
			}

			//||==> or ������
			if(x==1 || y==3) {
				System.out.println("x=1 �̰ų� y=3 �Դϴ�");
			}
			
	/*
	 	1. &&�� &, ||�� |�� �������� ������
	 	2. ���������δ� �������� ������ �ٸ���.
	 	  ==> &�� |�� : ���μ���
	 	  ==> &&�� ||�� : ���ڰ� ����� ���� ������ ��� �Ϻ� �������� ����
	 
	 
	 */
			

		}

	}