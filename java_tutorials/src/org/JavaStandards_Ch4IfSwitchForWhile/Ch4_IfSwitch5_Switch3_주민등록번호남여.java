/*p.152~153
  [���� 4-8]
 */


package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch5_Switch3_�ֹε�Ϲ�ȣ���� {
	
		public static void main(String[] args) {
			char gender;
			String regNo = "";
			
			System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (011231-1111222)>");
			
			Scanner scanner = new Scanner(System.in);
			regNo = scanner.nextLine();
			
			gender = regNo.charAt(7); //�Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����
			
			switch(gender) {
				case'1':
				case'3':
					System.out.println("����� �����Դϴ�.");
					break;
				case'2':
				case'4':
					System.out.println("����� �����Դϴ�.");
					break;
				default:
					System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
			}
	
	}

}
