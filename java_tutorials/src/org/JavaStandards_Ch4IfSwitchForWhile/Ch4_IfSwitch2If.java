/*p. 139~139
[���� 4-2]



*/





package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;	//scannerŬ������ ������� ���� �߰�

	public class Ch4_IfSwitch2If {
	
		public static void main(String[] args) {
			int input;
			
			System.out.print("���ڸ� �ϳ� �Է��ϼ���.");
			
			Scanner scanner = new Scanner (System.in);
			String tmp = scanner.nextLine();	//ȭ���� ���� �Է¹��� ������ tmp�� ����
			input = Integer.parseInt(tmp);		//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
			
			if (input==0) {
				System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
			}

			if (input!=0) {
				System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�"); //if�� ���� ����
				System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�", input); //if�� ���� ���� (�׻� ���)
			}
	
			
		}//end main
	
	}//end class
