/*p.118~
#ȿ������ ���� (short circuit evaluation)
   	 1) OR����: ���������ڴ� OR������ ��� \\ ���ǿ����� �� ���ʸ� ���̾ ��ü�� ���̹Ƿ�
   	 			���� �������� ���� �� �����ʴ´�.
   	 x�� true�� x\\y�� �׻� true�̴�.

	 2) AND���� : &&��쵵 ���������� ��� ���ʸ� ����(0)�̾ ��ü �������� ����(0)
	 		   : x�� �����̸� x && y�� �׻� ����
	 ##�׷��� ���� ���ǽ��̶� �ǿ������� ��ġ�� ���� ���� �ӵ��� �ٸ��� �ִ�.
	 ## \\��� �������� ���� Ȯ���� ���� �ǿ����ڸ� ���ʿ� �ִ°� ������ �������� ���� �� �ִ�.
	 
���� 3-26 p.118 ����

# ���� ���� ������  !
	�� �����ڴ� �� �����ڰ� true�̸� false��
	false�̸� true�� ����� ��ȯ
	true�� false�� �ٲ�
	
	�̷��� ������ �̿�, TV�� ������ư�� ���� ��� ��ư�� ���������� ���� ����
	: 			   !			 !					!				!
	false(����.off) -> true(��,on) -> false(����, off) -> true(��, on) ->....
	
	: �ַ� ���̴� �� -> ���ǹ�, �ݺ����� ���ǽ� (�߾��� ���ǽ��� ���� �����ϱ� ������)
  	ex> ����ch�� �ҹ��ڰ� �ƴϴ�!
  	
  		ch <'a' \\ ch >'z'		<->		!('a' <= ch && && ch <= 'z')
  	
  	[���� 3-27 ���� p. 120]
  	
  
 */








package org.JavaStandards_Ch3;

public class Operator4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}