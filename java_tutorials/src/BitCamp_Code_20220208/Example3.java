
//[2] �μ��� �Է� �ް� �λ����� ���� ���� ���ϱ�
//	
//	���࿹> java Example3 1 10
//	==> ������(��°��...)
//		1~10�� ���� 55�Դϴ�.
//		
//	<<java Example3 10 1�ΰ�쵵 ���� ���� ���>>
//	<<java Example3 10 10 ���� �Էµɰ��>>
//	�Է°��� �����ϴ�. [usage]:: ��¼�� ��¼��


class  Example3 {
	public static void main(String[] args) {
			
			int sum = 0;

			for(int i=1; i <=10; i++ ){
					sum += i;
			}
			System.out.println("1���� 10�� ���� "+sum+"�Դϴ�.");

	}
}
