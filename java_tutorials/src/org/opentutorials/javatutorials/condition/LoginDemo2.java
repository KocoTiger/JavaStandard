//���ǹ��� ��ø
/*
 ���� �������� ���̵�� ��й�ȣ�� ��� �����ؾ� �Ѵٸ� ��� �ϸ� �ɱ�? ���� ������ ����.
 */


package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String id = args[0];
	        String password = args[1];
	        if (id.equals("egoing")) {
	            if (password.equals("111111")) {
	                System.out.println("right");
	            } else {
	                System.out.println("wrong");
	            }
	 
	        } else {
	            System.out.println("wrong");
	        }
		
	        /*
	         �� ������ �Է� ���� �� �� �޴´�. 
	         id�� password�� ���α׷� ���η� �����Ϸ��� ���α׷��� ������ �� �Ʒ��� ���� ���ʴ�� 
	         ���̵�� ��й�ȣ�� �Է��ϸ� �ȴ�.
	         
	         java LoginDemo2 egoing 111111
	         
	         if�� �ȿ� �ٽ� if���� �����ߴ�. 
	         �� ����ڰ� �Է��� ���� ���̵��� ���� ��ġ�ϴ����� Ȯ���� �Ŀ� ��ġ�Ѵٸ� 
	         ��й�ȣ�� ��ġ�ϴ��� Ȯ���� ���̴�. 
	         �̷��� ���ǹ��� ���ǹ� �ȿ� ��ø������ ���� �� �ִ�.
	         
	         */
	        
	        //SwitchDemo�� �̵�
		
		
	}

}
