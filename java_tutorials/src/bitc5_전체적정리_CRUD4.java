/*
 
  
  
  
  
  
  
  
 */


package org_bitcamp5;

//scanner ���̺귯�� ��������
import java.util.Scanner;  //��κ��� Ŭ�������� import�� �ٿ����� (ù���� �빮���ΰ͵�)

	public class bitc5_��ü������_CRUD4 {
	
		//��Ŭ���� �ȿ� ������ �Լ����� ��� ���� Ű���带 �����Ѵ�.
	    private static Scanner kb; 
	    private static int[][] SCORE; //������ (�������� ����) 
	    // ������ �ƹ��͵� �ƴ�. �ؿ��� �Ἥ �̰� ���� ��ų �ڵ尡 �ʿ�
	    
	    public static void main(String args[]) {
	        //������ (������� ����Ǵ� �Լ�)
	        kb = new Scanner(System.in); //Ű����� �����ϱ�
	        SCORE = new int [5][3];  //1�� �迭 5���� ���� 2�� �迭
	                                 //���̰� 3���� 2���迭 5���� ������
	        ///////��ɵ� �����Ų��
	        String cmd;  //�̰� �� ����,������������ While���� ���� {}�̰� ��
	        do {  //do while �ݺ���: �ϴ� ���� ��Ű�� while���� �׸� �Ұ��� �Ǵ�
	            System.out.print("cmd > ");
	            // String cmd = kb.nextLine();  //while���� ����
	            
	        }while( !( "exit" .euquals(cmd) )); //while������ �����̸� ����
	                                            //�ٸ��� ��� ������
	        //����ڰ� "exit" �Է��ϸ� �����.
	        System.out.println("terminated");  //���α׷� ����
	      
	    }//end main
	    
	    /////////////�Լ��� ������
	    
	    
	    ///////////////////////
	}//end Class
