//���ǹ� : else

/*if�����δ� �� �� ������ ��Ȳ�� ó���ϴµ� �����ϴ�. 
 �Ʒ��� �׸�ó�� if-else���� if ���� ���� true�� �� then���� ����ǰ�,
 false�� �� else���� ����ȴ�.
 
 if(true false){
 
} else{
}
 
*/

package org.opentutorials.javatutorials.condition;

public class Condition3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ʒ� ������ ����. ����� 1�̴�.
		
		if (true) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
		
		/*
		  ���� ������ ����� 2��. 		 
		 */
		if(false){
		    System.out.println(1);
		} else {
		    System.out.println(2);
		}
		
		
	}

}
