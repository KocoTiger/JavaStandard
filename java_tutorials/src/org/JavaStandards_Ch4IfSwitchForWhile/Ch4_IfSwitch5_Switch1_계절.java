/*p.146~149
1.5 switch��
	: if���� ���ǽ� ���� ���� �ΰ��� �ۿ� ����
	: ����� ���� ������ ���� else-if�� ��� �߰� �ؾ���. (����, ó���ð��� ���� �ɸ�)
	: switch���� �� �ϳ��� ���ǽ����� ���� ����� ���� ó���� (ǥ�� ����)
	  ó���� ����� ���� �������� switch���� ��
	[����],switch���� �׻� if������ ��ȯ�� ����, if�� switch������ �ۼ��� �� ���� ��찡 ����.

	##switch�� �⺻ ����
	switch(���ǽ�){
		case ��1 :
				//���ǽ��� ����� ��1�� ���� ��� ����� �����
				//....
				//break;	
		case ��2 :
				//���ǽ��� ����� ��2�� ���� ��� ����� �����
				//....
				//break;		
		//...
		default:
				//���ǽ��� ����� ��ġ�ϴ� case���� ���� �� ����� �����
				//...		
	
	}
 	switch����
 	1) ���ǽ��� ���� ���
 	2) ����� ��ġ�ϴ� case������ �̵�
 	3) �̵��� �Ʒ��� �ִ� ����� ����
 	4) break���� ������ ��ü switch���� ��������
 	5) default ���� ��ġ�� ���� ���������, ���� �������� ���� (break�� ���� �ʾƵ� ��)
 	
 	##break;
 	case���� �������� break���� ���Դ� �Ǽ��� ���� �ʵ��� ����
 	��Ȳ�� ���󼭴� ���������� break���� ���� �ϴ� ��쵵 �ִ�.
 	
 	switch(){
 		case3:
 			grantDelete();		//���������� �ش�
 		case2:
 			grantWritre();		//��������� �ش�
 		case1:
 			grantRead();		//�ϱ������ �ش�
 	}
 	[����] ���� �ڵ�� ����ڿ��� �б�,����, ���������� �ִ� ����� ~�� �����Ѵٴ� �����Ͽ� �ۼ�.
 		 :���� �ڵ�� ��ü �ڵ尡 �ƴ�, �Ϻθ� ����. (ȸ������ ��Ǵ� ������Ʈ���� ���� ���� ���� �ڵ�)
 		 : �α����� ������� ���(level)�� üũ, ���� ���� ����� 1�� ���� ����ڴ� �б� ���Ѹ��� ����.
 		 ex>
 		 int level = 2;		//case 2, 1 ������ ���� �� ����.
 		 
 		  	switch(level){
 		case3:
 			grantDelete();		//���������� �ش�
 		case2:
 			grantWritre();		//��������� �ش�
 		case1:
 			grantRead();		//�ϱ������ �ش�
 
 	##switch���� ���� ����
 		1) switch���� ���ǽ��� ������� �ݵ�� ����
 		2) case���� ������ ���� (�ߺ����� �ʾƾ� ��)
 		3) case���� ���� �ݵ�� ��� (����, �Ǽ��� case���� ������ ����� �� ����)
 	[����]JDK1.7�������� switch���� ���ǽĿ� ���ڿ��� ������ �ʾҴ�.
 	
 	##case���� ��� ��
 		int num, result;
 		final int ONE = 1;
 		...
 		switch (result){
 			case '1'	: //ok. ���� ��� (���� ��� 49�� ����)
 			case ONE	: //ok.	���� ��� (���� final�� ���� ���� ���)
 			case "YES"	: //ok.	���ڿ� ���. JDK1.7���� ���
 			case num 	: //����. ������ �Ұ�
 			case 1.0 	: //����. �Ǽ��� �Ұ�
 			 		
 		}
 		
 		
 	
 	
 	
 	
 	
 	
 
 
 
 
 */






//���� 4-6
package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch5_Switch1_���� {
	
		public static void main(String[] args) {
			int month = 0;
			
			System.out.print("���� ���� �Է��ϼ���.>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			month = Integer.parseInt(tmp);
			
			switch (month) {
				case 3:
				case 4:
				case 5:
				System.out.println("������ ������ ���Դϴ�.");
					break;
				case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");	
					break;
				case 9: case 10: case 11:
					System.out.println("������ ������ �����Դϴ�.");	
					break;
				default:	
				//case 12: case 1: case 2:
					System.out.println("������ ������ �ܿ��Դϴ�.");	

			}//end case

//if������ ��ġ��
//			if (month==3)\\(month==4)\\(month==5){
//				System.out.println("������ ������ ���Դϴ�.");
//				}else if (month==6)\\(month==7)\\(month==8){
//					System.out.println("������ ������ �����Դϴ�.");	
//				}else if (month==9)\\(month==10)\\(month==11){
//					System.out.println("������ ������ �����Դϴ�.");
//				}else {
//					System.out.println("������ ������ �ܿ��Դϴ�.");
//				}
			
			
			
			

			

	}

}
