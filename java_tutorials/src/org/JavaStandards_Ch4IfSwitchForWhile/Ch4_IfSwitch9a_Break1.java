/*p. 175~176
#break��
	: switch��, �ݺ��������� break��� ����
	: break���� �ڽ��� ���Ե� ���� ����� �ݺ����� ���.
	: �ַ�if���� �Բ� ���Ǿ� Ư�� ������ �����ϸ� �ݺ����� ������� �Ѵ�.
 [���� 4-30]
 
 	: ���ڸ� 1���� ��� ���� ������ ����� ���� ���� 100�� �Ѵ��� �˾Ƴ��� ����.
 	: i �� ���� 1���� 1�� ��� �������Ѱ���, ���ؼ� sum�� ����
 	: sum�� ���� 100�� ������ if���� ���ǽ��� ���̹Ƿ�break�� ���� (�ڽ��� ���� �ݺ����� ��� ���)
 	[����] sum+=i�� ++i; 
 		�ι� ���� sum += ++i;�� �ѹ�������  ���� �ִ�.
 
 
 */







 //[���� 4-30]

package org.JavaStandards_Ch4IfSwitchForWhile;

	public class Ch4_IfSwitch9a_Break1 {
	
		public static void main(String[] args) {
			int sum = 0;
			int i = 0;
			
			while(true) {
				if(sum>100)
					break;
				
				++i;
				sum +=i;
			}//end while

			System.out.println("i=" + i);
			System.out.println("sum=" + sum);
	}

}
