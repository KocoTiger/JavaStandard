package org_bitcamp2;

public class bitc2_if_for9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. ����: 3�ڸ� ���� �޾Ƽ� : �� �ڸ� ���� ũ�� ������ �����ϴ��� �Ǵ�(�Ǻ�)�ϼ���
	    // �����ϴ��� (if�� �Ἥ �Ѵ�)
	    int num = 345;
	    int d1 = num / 100; //(100�� �ڸ� �ϳ� ����)
	    int d2 = num / 10 % 10; // 45������ 10�� 4.5
	    int d3 = num % 10;
	    if((d1+1==d2) && (d2+1 == d3)) {
	            System.out.println(num);
	    }else {
	            System.out.println(num + "-> �񿬼�");
	    }
	    
	   }
	  } 

