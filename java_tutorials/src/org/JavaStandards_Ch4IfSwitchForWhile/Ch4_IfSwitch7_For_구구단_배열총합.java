/*p. 163 ~166
[���� 4-18] ������
[���� 4-19] 3���� �ݺ����� ��ø�Ǿ��ִ� ���
[���� 4-20] 2�� �ݺ����� �̿�, i��j�� 1���� 5���� 1�� ������Ű�鼭 i��j�� ����
		   ������ ���. 
[���� 4-21] for�� if�� �̿��Ͽ� ���ǿ� �´� �ָ� ����ϰ� �ϱ�.
  		   (2�� for�� �ȿ� if���� �־ ���ǿ� �´� �ָ� 
		   ��������ν� �پ��� ����� ����� ���� �ִ�.)
	##���� for��(enhanced for statement)
		:JDK1.5���� �迭�� �÷��ǿ� ����� ��ҿ� ������ �� �������� ���� �������
		 ó���� �� �ֵ��� for���� ���ο� ������ �߰��Ǿ���.
		 
		 for(Ÿ�� ������ : �迭 �Ǵ� �÷���){
		 		//�ݺ��� ����
		 }

		: ���� ���忡�� Ÿ���� = �迭 �Ǵ� �÷����� ����� Ÿ��
		: �迭 �Ǵ� �÷��ǿ� ����� ���� �� �ݺ����� �ϳ��� ������� ������ ������ ����.
		: �ݺ����� ��ȣ{}�������� �̺����� ����ؼ� �ڵ带 �ۼ�
		  ���� ��� �迭arr�� ���� �Ǿ�����...
		  
		  int[] arr = {10, 20, 30, 40, 50};
		:�� �迭�� ��� ��Ҹ� ����ϴ� for����....
			
			for(int i=0; i<arr.length; i++){
					System.out.println(arr[i]);
			}
		  
		  ->
		  
		  for(int tmp : arr){
		  		System.out.println(tmp);
		  }
[����] �迭�� �÷����� ��� ���� ���� ������ ���ִ� �������, ���� 5��, 11�忡�� ���� �ȴ�.

[���� 4-22]
  
  
 */




package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch7_For_������_�迭���� {

	public static void main(String[] args) {
//[���� 4-18] ������
//		for(int i = 2; i<=9; i++) 	//���� for���� 8�� �ݺ��ؼ� ���
//			for(int j=1; j<=9; j++)	//�ϳ��� ���� ���
//				System.out.printf("%d x %d = %d%n", i, j, i*j);
//			//�ΰ��� for�� {}�� �������� (����: for���ȿ� �ϳ��� ���常 �ֱ⶧��)
//
//[���� 4-19] 3���� �ݺ����� ��ø�Ǿ��ִ� ���
//		for (int i=1; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				for(int k=1; k<=3; k++) {
//					System.out.println("" + i + j + k);
//				}
//			}
//		}
//		//�� 27�� �� �ݺ����� 3���� �ݺ�. 3�� 3�� = 27
//		//i,j,k�� ���� 1, 2, 3�϶� �� 
//		//"" + i + j + k -> "" + 1 + 2 + 3-> "1"+2+3 ->"12"+3->"123"
//		//[����]�� ������ ���ذ� �ȵȴٸ�, p35����
//[���� 4-20] 
//		for (int i =1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.printf("[%d,%d]",i,j); //������ �� ���
//			}
//				System.out.println(); //5�� ��� �ٸ� �ٷ� �ű�.
//									  //�� ���� 25�� 5*5
//		}
////[���� 4-21] for�� if�� �̿��Ͽ� ���ǿ� �´� �ָ� ����ϰ� �ϱ�.
//		for (int i =1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i==j) {
//					System.out.printf("[%d,%d]",i,j);
//				}else {
//					System.out.printf("%5c", ' ');
//				}//end else		
//		}//end for2
//					System.out.println();
//	}//end for1
//
//p.166 ���� for��		
//		int[] arr = {10, 20, 30, 40, 50};
//		
//		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i]);
//	}
//			
//		
//		  for(int tmp : arr){
//		  		System.out.println(tmp);
//		  }
//[���� 4-21]
		int[]arr = {10,20,30,40,50};
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);	
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	
	}

}
