package org_bitcamp2;

public class bitc2_Switch2 {

	public static void main(String[] args) {


		    //��ȯǥ, ����(mapping)�Ҵ� ���� ��. ������ ���� �Ⱦ�
		    // �Է°� -> ��ȯ(mapping) -> ��ȯ�� ���
		    // ��ǻ�ʹ� ������ ���� / ����� ����� 
		    int num = 6;
		    int day = 3; // from computer ���ϰ��� ����
		    String wday=""; //�� ���ڿ�, ���ڿ��� �ٲ㼭 �����ְڴ� -> ȭ�� ���
		    switch(day) {
		        //���� ���� ������ �κ� ���� - ���� ����
		        case 0: // day�� ���� 0�� ��� ����
		            wday = "�Ͽ���";
		        case 1: // day�� ���� 0�� ��� ����
		            wday = "������";
		        case 2: // day�� ���� 0�� ��� ����
		            wday = "ȭ����";
		        case 3: // day�� ���� 0�� ��� ����
		            wday = "������";
		            break; //��������� �ض�, �ݺ���, switch�� ��� ����
		        case 4: // day�� ���� 0�� ��� ����
		            wday = "�����";
		        case 5: // day�� ���� 0�� ��� ����
		            wday = "�ݿ���";
		        case 6: // day�� ���� 0�� ��� ����/ case������ ���� �����ִ� (����, ���ĵ� ����ȵ�!/literal ǥ����)
		            wday = "�����";
		    } //end of switch
		        
		        
		    System.out.println( wday );

		    }
		}

//�� : ������ / break�� �����ָ� ������� ����, ������ ������ ���������� ��� ���� ��
