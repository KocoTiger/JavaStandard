/*p. 192~194
##�迭�� ����
	: �迭�� �ѹ� �����ϸ� �� ���̸� ���� �� �� ����. �� ���� ���嵿���� �ʿ��ϸ�
	  ���� ū �迭�� ���� ����� ���� �迭�� ���� ������ �����ؾ��Ѵ�.
	:�迭�� ���� �ϴ� ��� �ΰ���!
	1) for���� �̿��ؼ� �迭�� �����ϴ� ���
	
		int[] arr = new int[5];
		
		int[] tmp = new int[arr.length*2];	//���� �迭���� ���̰� 2���� �迭 ����
		
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];		//arr[i]�� ���� tmp[i]�� ����
		arr = tmp;					//�������� arr�� ���ο� �迭�� ����Ű�� �Ѵ�.
	
	: �̷��� �۾����� �ϳ� ����� ��. (ó������ �迭�� ���̸� �˳��� ����)
		<�ܰ躰>
		1-1) �迭arr�� ���� arr.length�� ���� 5�̹Ƿ� ���̰� 10�� int�迭 tmp�� ����
			 �迭 tmp�� �� ��Ҵ� int�� �⺻���� 0���� �ʱ�ȭ
			 
			 int[] tmp = new int[arr.length*2];
		->	 int[] tmp = new int[5*2];
		->	 int[] tmp = new int[10];
		
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x100]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
		
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]
 					0x200
		
		1-2)for���� �̿��ؼ� �迭 arr�� ��� ��ҿ� ����� ���� �ϳ��� �迭 tmp�� ����
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];		//arr[i]�� ���� tmp[i]�� ����

			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x100]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]  arr[6]  arr[7]  arr[8]  arr[9]
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]	  [0]	  [0]	  [0]	  [0]	  [0]

		1-3) �������� arr�� �������� tmp�� ���� ����
			 arr�� ���� 0x100���� 0x200���� �ٲ��, arr�� �迭 tmp�� ����Ű�� �ȴ�.
			 
			 arr = tmp; 	//���� tmp�� ����� ���� ���� arr�� ����
			 
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x100]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
	tmp-> arr�� ����
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]  arr[6]  arr[7]  arr[8]  arr[9]
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]	  [0]	  [0]	  [0]	  [0]	  [0]	

	: �ᱹ �������� arr�� tmp�� ���� �迭�� ����Ű�� ��.
	: �迭 arr�� tmp�� �̸��� �ٸ� ��, ������ �迭.
	: ������ arr�� ����Ű�� �迭�� �� �̻� ��� �Ұ�.
	[����] �迭�� ���������� ���ؼ��� ���� ����, �ڽ��� ����Ű�� ���������� ���� �迭�� ����� �� ����.
		  �̷��� ������� �� �迭�� JVM�� ������ �÷��Ϳ� ���ؼ� �ڵ������� �޸𸮿��� ���ŵ�.
	
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
	tmp-> arr�� ���� ��, �ּҰ��� tmp�� ������.
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]  arr[6]  arr[7]  arr[8]  arr[9]
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]	  [0]	  [0]	  [0]	  [0]	  [0]		


	: ���� ������ ���ؼ� �ڼ��� ����� �ʾ���, �����ϱ� �����.
	: ������ �迭�� ���̸� �����ؾ��� �� �̷������� ó���Ѵٴ� ������ ���� ����.
[���� 5-3]



 */







//[���� 5-3]
package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array3_�迭�ø����� {

	public static void main(String[] args) {
		int[] arr = new int [5];
		
		//�迭 arr�� 1~5�� ����
		for(int i=0; i<arr.length; i++)
			arr[i] = i + 1;
		
		System.out.println("������ - arr.length:"+arr.length); 
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int [arr.length*2];

		//�迭 arr�� ����� ������ �迭 tmp�� �����Ѵ�.
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;	//tmp�� ����� ���� arr�� ����
		
		System.out.println("������-arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
	}

}
