//���ǹ� else if

/*
 else if���� �̿��ϸ� ���ǹ��� �帧�� �� �� �����Ӱ� ������ �� �ִ�.
 if���� ���� true��� then���� ����ȴ�.
 false��� else if���� ��� �Ѿ��.
 else if���� ���� true��� else if then���� ����ȴ�.
 false��� else ���� ����ȴ�. 
 else if���� ���� ���� ������ ������ �� �ְ�, else���� ������ �����ϴ�. 
 else ���� else if ������ ���� ������ ���� ����.
 
 if(true false){
 
 } else if(true false){
 
 } else {
 
 }
 
 */



package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 �Ʒ� ������ ����. ����� 2��. 		 
		 */
		
		 if (false) {
	            System.out.println(1);
	        } else if (true) {
	            System.out.println(2);
	        } else if (true) {
	            System.out.println(3);
	        } else {
	            System.out.println(4);
	        }
		
		 //���� ������ ����� 3�̴�.
		 /*if(false){
			    System.out.println(1);
			} else if(false) {
			    System.out.println(2);
			} else if(true) {
			    System.out.println(3);
			} else {
			    System.out.println(4);
			}
		 
		 //���� ������ ����� 4�̴�.
		 if(false){
			    System.out.println(1);
			} else if(false) {
			    System.out.println(2);
			} else if(false) {
			    System.out.println(3);
			} else {
			    System.out.println(4);
			}
		*/
	}

}
