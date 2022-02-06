/*p. 194~195
###System.arraycopy()�� �̿��� �迭�� ����
	: for����� SystemŬ������ arraycopy()�� ����ϸ� ���� �����ϰ� ������ �迭�� ���� ����
	: for���� �迭�� ��� �ϳ��ϳ��� �����ؼ� ����
	: arraycopy()�� ������ ������ ������ �ѹ��� ��°�� ����
	: �� ��ҵ��� ���������� ����Ǿ� �ִٴ� �迭�� Ư�� ������ �̷��� ó���ϴ� ���� ����.

		�迭�� ����� for������ System.arraycopy()�� ����ϴ� ���� ȿ����.
	
	: ���� �������� �迭�� ���翡 ���� for���� arraycopy()�� �ٲٸ�,
		
			for(int i=0; i<num.length; i++) { newNum[i] = num[i]; }
 					���� �Ʒ��� �ٲٸ�
 			System.arraycopy(num, 0, newNum, 0, num.length);
 
 		System.arraycopy(num, 0, newNum, 0, num.length);
 	
 		num[0]���� newNum[0]���� num.length���� �����͸� ����
 			
 	: �̶� �����Ϸ��� �迭�� ��ġ�� �������� ���Ͽ� �����Ϸ��� ���뺸�� ���������� ������
 	  ������ �߻�.
 	  
 	[���� 5-4]
 	
 	: �ٸ� �迭�� �޸� char�迭�� for���� ������� �ʰ� print()�� println()����
 	  �迭�� ����� ��� ���ڸ� ��� ����.
 	
 	
 	
 	
 	
  
 */




//[���� 5-4]
package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array4_arraycopy {

	public static void main(String[] args) {
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//�迭 abc�� �迭 num�� ù��° ��ġ�� ���� �迭abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number�� �ε��� 6��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}

}
