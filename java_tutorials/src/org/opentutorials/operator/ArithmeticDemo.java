//������
/*
 * ������(����ٿ� ߩ���� �, operator)�� Ư���� �۾��� �ϱ� ���ؼ� ����ϴ� ��ȣ�� �ǹ��Ѵ�.
 *  �۾��� ������ ���� ���� ������, ��� ������, �� ������, �� ������ ���� �ִ�. 
 *  �̹� ���������� ���� �������� �����ڿ� ���ؼ� �˾ƺ���, 
 *  ���⼭ �ٷ��� �ʴ� �����ڵ��� �� �����ڰ� ������ ���Ǵ� �ƶ����� ���� �˾ƺ��ڴ�.
 * 
 * ���Կ����� : =
 * ��� ������ : + - * / %(������)
 * �� ������ : ����
 * ���� ������ : ���ǹ����� ����
 * 
(��� ������)
+	���ϱ�
-	����
*	���ϱ�
/	������
%	������
��������� ǥ�õ� �κ��� ���α׷��ְ� ������ ��ȣ�� �ٸ� �����ڵ��̴�.  �����ڵ��� ������ ������ ���ؼ� �˾ƺ���
 */

package org.opentutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// result �� ���� 3
        int result = 1 + 2;
        System.out.println(result);
  
        // result �� ���� 2
        result = result - 1;
        System.out.println(result);
  
        // result �� ���� 4
        result = result * 2;
        System.out.println(result);
  
        // result �� ���� 2
        result = result / 2;
        System.out.println(result);
  
        // result �� ���� 10
        result = result + 8;
        // result �� ���� 3
        result = result % 7;
        System.out.println(result);
		
		/*
		 ����� �Ʒ��� ����.
		 3
		 2
		 4
		 2
		 3
		������ �߿� �ټ� ���̵��� �ִ� �������� ���ؼ� �˾ƺ���.
		  		 
		 */
		// ������ �߿� �ټ� ���̵��� �ִ� �������� ���ؼ� �˾ƺ���. (������ �κ��� �˾ƺ�����)
        // RemainerDemo������ �̵�
        
		
		

		
		
		
		
	}

}
