package org_bitcamp2;

public class bitc2_Switch4 {

	public static void main(String[] args) {
		//��ȯǥ, ����(mapping)�Ҵ� ���� ��. ������ ���� �Ⱦ�
	    // �Է°� -> ��ȯ(mapping) -> ��ȯ�� ���
	    // ��ǻ�ʹ� ������ ���� / ����� ����� ?
	    int num = 6;
	    int score = 36; // 0~100�������
	    // 90 A, 70~89 B, 50~69 C, F
	    String wday=""; //�� ���ڿ�, ���ڿ��� �ٲ㼭 �����ְڴ� -> ȭ�� ���
	    switch(score / 10) { 
	        			//���� ���� ������ �κ� ���� - ���� ����
	        case 10:
	        case 9:
	            wday = "A";
	            break; 	//��������� �ض�, �ݺ���, switch�� ��� ����
	        case 8:
	        case 7:    
	            wday = "B";
	            break; 	//��������� �ض�, �ݺ���, switch�� ��� ����
	        case 6:
	        case 5:   
	            wday = "C";
	            break; 	//��������� �ض�, �ݺ���, switch�� ��� ����
	        default: 	//�� �ܿ�, ���� �������� ������ ��������
	            wday = "F";
	    } //end of switch
	        	        
	    System.out.println( wday );


	}
}
// �� : F
// score�� ��������