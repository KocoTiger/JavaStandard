/*
package jb02.part03;

	FileName: Break Test.java

	//==>keyword:break ==> �ڽ��� ���� �ݺ����� ����
	 
	//==>break���� �̿��Ͽ� �Է¹��� �������� �� ������
	//==>java BreakTest10 ==> �̸� 1~10���ؼ� 55���

 */




package java_tutorials_bitCamp1;

public class BreakTest {
//main method
	public static void main(String[] args) {
		
		//�Է¹��� data�� int��ȯ
		int inputData=Integer.parseInt(args[0]);
		
		//while���� �ʱ�ȭ ���� ����
		int i=0;
		
		//���Ѱ��� �����ϱ� ���� ���� ����
		int sum=0;
		
		while(true) {
			i++;
			sum=sum+i;
			
			if(i==inputData) {
				break;
			}
		}//end of while
		
		System.out.println("0~"+inputData+"������ ����:"+sum+"�Դϴ�.");
		

	}//end of main

}//end of class