package org_bitcamp1;

public class bitc2_Boolean7 {

	public static void main(String[] args) {
		//�� ������ -> ����� ���� �� (���迬���� ������ ������)
        int min = 1;
        int max = 10;
        int R = 2 ;  //10.29 �� �Ǽ��� ���� �ȵ� / ���̽��̶� ū ������ �ڹٴ� �Ǽ� ����
        boolean con1 = R <= max; //���ǽ� �ϳ�
        boolean con2 = R >= min; // 20�̶� 30�� ���Ķ� ����
         System.out.println(con1 && con2);        // �Ѵ� and, and�� ��ĥ�� or�� ��ĥ���� �� �����Ѵ�.
         //������ : or
         //������ : and
         System.out.println(!(con1 && con2)); //�����տ� not�� ���̸� -> �ݴ밡 �ȴ�
         System.out.println(con1 || con2);
        }                               
}

