/*p. 139~142
# 1.2 if -else��
	:if���� ���� false�� ��� else���� ������ ���� ����
[���� 4-3]

#1.3 if else if��

	if else���� �ΰ��� ��� ��, �ϳ��� ����Ǵ� ����
	���� ���̻��� ��쿡�� ��� �ؾ� �ұ�
	if else if���� ����ϸ� �ȴ�.

		if (���ǽ�1){
				//���ǽ�1�� �������� ���� �� ����� ������� ���´�.
		}else if (���ǽ�2){
				//���ǽ�2�� �������� ���� �� ����� ������� ���´�.
		}else if (���ǽ�3){	//�������� else if�� ����� �� �ִ�.
				//���ǽ�3�� �������� ���� �� ����� ������� ���´�.
		}else { //���������� ���� else������ ������, else���� ��������.
				//���� ��� ���ǽĵ� �������� ���� �� ����� ������� ���´�.		
		}
		1) ����� ���� ���ǽ��� ���� ������ ù��° ���ǽĺ��� ������� ���Ѵ�.
			(ù��° ���ǽ��� �����̹Ƿ�, �ι�° ���ǽ����� �Ѿ��)
		2) ���� ���ǽ��� ������ �ش� �� {}�� ������� �����Ѵ�.
		3) if-else if�� ��ü�� �������´�.
[���� 4-4 ����]		



 */









package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;	//scannerŬ������ ������� ���� �߰�

public class Ch4_IfSwitch3IfElse1 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);	 //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		if (input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");			
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
//		if -else���� ������ ������ �ϳ����̶�� �� ��������
//		if (input==0) 
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");			
//		else 
//			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		
		
	

	}

}
