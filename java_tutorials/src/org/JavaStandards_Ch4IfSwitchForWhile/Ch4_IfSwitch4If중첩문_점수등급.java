/*p.144~146
1.4 ��ø if��
	: if���� �� ���� �� ���� if���� ���Խ�Ű�� ���� ����
	: �̰��� if��ø���̶�� �θ���
	: ��ø�� Ƚ������ ���� ������ ����.

		if(���ǽ�1){
		//���ǽ� 1�� �������� true�϶� ����� ������� ���´�
				if (���ǽ�2){
		//���ǽ�1�� ���ǽ� 2�� ��� true�϶� ����� �����
				}else{
				���ǽ�1�� true, ���ǽ�2�� false�϶� ����Ǵ� �����
				}
				}else {
					//���ǽ� 1�� false�϶� ����Ǵ� �����.
		}
	: ��ø if�������� ��ȣ{}�� ������ ���� �����ؾ��Ѵ�.
	






 */







//����4-5
package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch4If��ø��_������� {
	
		public static void main(String[] args) {
			
			int score = 0;
			char grade = ' ';
			char opt = '0';
			
			System.out.print("������ �Է����ּ���.>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();//ȭ���� ���� �Է¹��� ������ tmp�� ����
			score = Integer.parseInt(tmp);	//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
			
			System.out.printf("����� ������ %d�Դϴ�.%n", score);
			
			if(score >=90) {
				grade = 'A';
				if(score >=98) {
					opt = '+';
				}else if (score < 94) {
					opt = '-';
				}
			}else if (score >=80) {
				grade = 'B';
				if (score >=88) {
					opt = '+';
				}else if (score < 84) {
					opt = '-';
					}
			}else {
				grade = 'c';
			}
			
			System.out.printf("����� ������ %c%c �Դϴ�.%n",grade, opt);
			
		}//end main
	
	}//end public
