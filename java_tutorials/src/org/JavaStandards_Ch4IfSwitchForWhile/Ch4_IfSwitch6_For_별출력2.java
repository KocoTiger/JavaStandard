/*p.163 ~163
[����4-17] �� ���





*/






//[����4-17]
package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

	public class Ch4_IfSwitch6_For_�����2 {
	
		public static void main(String[] args) {
			int num = 0;
			
			System.out.print("*���� ����� ������ ���� �Է��ϼ���.>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			for (int i=0; i<num; i++) {
					for(int j=0; j<=i; j++) {
						System.out.print("*");
					}
				System.out.println();
			}
			
		
		

	}

}
