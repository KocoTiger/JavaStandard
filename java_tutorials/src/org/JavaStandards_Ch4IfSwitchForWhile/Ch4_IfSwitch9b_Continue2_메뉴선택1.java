/*p. 177
[���� 4-32]

	: �޴��� �����ְ� ����
	: �޴��� �� ���������� ���, continue������ �ٽ� �޴��� ������ (continue�� while���� ���ǽ����� �̵�)
 	: ���� (0)�� ������ ���, break������ �ݺ��� ��� ���α׷��� ����
 	: �� ������ �޴��� �����ְ� �����ϴ� ���� �ݺ��ϴ� �� �ܿ� ���ٸ� ����� ����.
 	  -> [���� 4-34 ����]
 
 
  
 */









package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

	public class Ch4_IfSwitch9b_Continue2_�޴�����1 {
	
		public static void main(String[] args) {
			int menu = 0;
			int num = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("(1) sqaure");
				System.out.println("(2) sqaure root");
				System.out.println("(3) log");
				System.out.print("���ϴ� �޴� (1~3)�� �����ϼ���. (����:0)>");

				String tmp = scanner.nextLine();//ȭ�鿡 �Է¹��� ������ tmp�� ����
				menu = Integer.parseInt(tmp);//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
				
				if(menu==0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else if(!(1 <= menu && menu <=3)){
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
					continue;
				}
				
				System.out.println("�����Ͻ� �޴��� "+ menu + "���Դϴ�.");
				
			}//end while

	}//end main

}
