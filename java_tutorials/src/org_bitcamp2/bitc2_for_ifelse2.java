package org_bitcamp2;

public class bitc2_for_ifelse2 {

	public static void main(String[] args) {

		//ȭ�鿡 �� 10���� ""���ڿ��� ����Ѵ�. �ִ� 20��
	    //�ݺ��� 1, ���� if else
	    //���ϴ� �κ��� ������ �����ؼ� �ٷ��.
	    String letter="";
	    int d = 1;
	    
	    for (int i=0; i<=10; i+=1){
	        i = i + d; //i�� ������ ���� �����Ϸ��� d������ ���Ѵ�. !! ������! �̰� �˾ƾ���.
	                   // ������ �������� ����, ���� 
	    if (i % 3 == 0){ //3�� ����� ���̶� ��
	        letter = "O";
	       
	    }else{
	        letter = "X";
	        }
	        //���ڿ� +���ڿ�, ����, ����, �Ǽ� => ���ڿ�
	        System.out.print( letter); //�ٲ�°��� ������
	        
	   }
	       
	}
}    
