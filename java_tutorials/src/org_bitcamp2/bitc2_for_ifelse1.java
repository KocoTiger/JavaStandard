package org_bitcamp2;

public class bitc2_for_ifelse1 {

	public static void main(String[] args) {
		//ȭ�鿡 �� 10���� ""���ڿ��� ����Ѵ�. �ִ� 20��
	    //�ݺ��� 1, ���� if else
	    //���ϴ� �κ��� ������ �����ؼ� �ٷ��.
	    String letter="";
	    for (int i=0; i<=10; i+=1){
	    if (i % 3 == 0){ //�̰� ���� ��!?3�� ����̸� 
	    				 //%�������� ������ 0�� ���´ٴ°��� 3�ǹ��
	    				 // 0 1 2 0 1 2...
	        letter = "O";
	       
	    }else{
	        letter = "X";
	        }
	        //���ڿ� +���ڿ�, ����, ����, �Ǽ� => ���ڿ�
	        System.out.print( letter); //�ٲ�°��� ������
	        
	    	}
	    }
	}
