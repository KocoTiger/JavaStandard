package org_bitcamp2;

public class bitc2_Switch3 {

	public static void main(String[] args) {
		//��ȯǥ, ����(mapping)�Ҵ� ���� ��. ������ ���� �Ⱦ�
	    // �Է°� -> ��ȯ(mapping) -> ��ȯ�� ���
	    // ��ǻ�ʹ� ������ ���� / ����� ����� 
	    int num = 6;
	    int score = 36; // from computer ���ϰ��� ����
	    String wday=""; //�� ���ڿ�, ���ڿ��� �ٲ㼭 �����ְڴ� -> ȭ�� ���
	    switch(score / 10) {
	        //���� ���� ������ �κ� ���� - ���� ����
	        case 0: // day�� ���� 0�� ��� ����
	            wday = "�Ͽ���";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	        case 1: // day�� ���� 0�� ��� ����
	            wday = "������";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	        case 2: // day�� ���� 0�� ��� ����
	            wday = "ȭ����";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	        case 3: // day�� ���� 0�� ��� ����
	            wday = "������";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	        case 4: // day�� ���� 0�� ��� ����
	            wday = "�����";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	        case 5: // day�� ���� 0�� ��� ����
	            wday = "�ݿ���";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	        case 6: // day�� ���� 0�� ��� ����/ case������ ���� �����ִ� (����, ���ĵ� ����ȵ�!/literal ǥ����)
	            wday = "�����";
	            break; //��������� �ض�, �ݺ���, switch�� ��� ����
	    } //end of switch
	        
	        
	    System.out.println( wday );

	    }
	
	}

//�� : ������