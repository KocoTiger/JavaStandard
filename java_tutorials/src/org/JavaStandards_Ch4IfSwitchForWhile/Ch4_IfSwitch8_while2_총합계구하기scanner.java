/*p. 170 ~172
[����4-25]
  
  
 */




package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

public class Ch4_IfSwitch8_while2_���հ豸�ϱ�scanner {

	public static void main(String[] args) {

//[����4-25]		
//		int num = 0;
//		int sum = 0;
//		
//		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			//num�� 10���� ���� �������� sum�� ����
//			sum+= num%10;	//sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num/=10;	//num = num/10; num�� 10���� ���� ���� �ٽ� num�� ����
//		}
//		
//		System.out.println("�� �ڸ����� ��:"+ sum);
/*
		##� ���� 10���� ������ ���� : ������ �ڸ��� ���� �� �ִ�.
		##� ���� 10���� ������ ���� : ������ ���ڸ��� ����.
		
		12345 % 10 -> 5
		12345 / 10 -> 1234
[����] p.171		
		
 */
//[����4-26]	
//		int sum = 0;
//		int i = 0;
//		
//		while ((sum += ++i) <=100) {	//i�� 1�� �������Ѽ� sum�� ��� ���س�����.
//			System.out.printf("%d - %d%n", i, sum);
//			
//		}
/* �̽��� �����غ���
		while ((sum += ++i) <=100)
		
		sum += ++i	//i�� ���� 1���� ���Ѽ� sum�� ����
		sum <= 100	//sum�� ���� 100���� �۰ų� ������ Ȯ��.

 		
 */
//[����4-27]	
		int num;
		int sum = 0;
		boolean flag = true;	//while���� ���ǽ����� ���� ����
		
		System.out.print("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
		
		while (flag) {	//flag�� ���� true�̹Ƿ� ���ǽ��� ���� �ȴ�.
				System.out.print(">>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		if(num!=0) {
			sum +=num; //num�� 0�� �ƴϸ�,sum�� ���Ѵ�.
		}else {
			flag = false;	//num�� 0�̸�, flag�� ���� false�� ����
		}
		
		System.out.println("�հ�:"+sum);
		
		}//end while
	}

}
