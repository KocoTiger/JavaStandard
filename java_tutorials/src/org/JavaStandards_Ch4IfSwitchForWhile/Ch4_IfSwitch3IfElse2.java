/*p. 142~143

[���� 4-4 ����]	







*/




package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch3IfElse2 {
	
		public static void main(String[] args) {
			int score = 0;		//������ �����ϱ� ���� ����
			char grade = ' ';	//������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
			
			System.out.print("������ �Է��ϼ���.>");
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
			score = Integer.parseInt(tmp);	 //�Է¹��� ���ڿ� (tmp)�� ���ڷ� ��ȯ
			
			if(score >= 90) {		//score�� 90�� ���� ���ų� ũ�� A����
				grade = 'A';
			}else if(score >= 80){	//score�� 80�� ���� ���ų� ũ�� A����
				grade = 'B';
			}else if(score >= 70){	//score�� 70�� ���� ���ų� ũ�� A����
				grade = 'C';
			}else {					//�������� D����
				grade = 'D';
			}
			
			System.out.println("����� ������ "+ grade + "�Դϴ�.");

//�̽��� ����, �̷��� ��� �Ұ� ������, ���� if�� false�� �Ǿ �����°��̱� ������
//������,else if(score >= 80), else if(score >= 70) �̷��� ���� ����.
//		}else if(80 <= score && score < 90){	//score�� 80�� ���� ���ų� ũ�� A����
//			grade = 'B';
//		}else if(70 <= score && score < 80){	//score�� 70�� ���� ���ų� ũ�� A����
//			grade = 'C';
//if�� �������� �ռ��Ǿ else if�� ���� �Ѵٰ� ������, if������ �ɰ������� ���� �ٸ� �ڵ尡 �ȴ�.			
//			
			
			
			
			
			
			
			
			
	}//end main

}//end public
