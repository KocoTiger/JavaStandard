//[3] : �μ��� �Է¹ް� �Է¹��� ���� ¦��, Ȧ��,3�� ����� �Ǵ��ϱ�
//		FileName : Test3.java
//		
//		//if��
//		���࿹> java Test3 10 15
//		==> ������(��°��...)(�˾Ƽ� ����Ұ�)
//		�Է��Ͻ� 1��° ���ڰ� 10�� ¦�� �̸� 3�� ����� �ƴմϴ�.
//		�Է��Ͻ� 2��° ���ڰ� 15�� Ȧ�� �̸� 3�� ����Դϴ�.





class Test3 
{
	public static void main(String[] args) 
	{
//[FileName :Test 3]
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);


////(1���� if)
			if(a%2==0 && b%3==0)
				System.out.println("�Է��Ͻ� 1��° ���ڰ�"+a+"�� ¦���̸� 3�� ����� �ƴմϴ�.");
				System.out.println("�Է��Ͻ� 2��° ���ڰ���"+b+"�� Ȧ���̸� 3�� ����Դϴ�." );
//[pass]			
			
//(2����if, for, break)	
//			for(;;){
//			if(a%3==0){
//				System.out.println("�Է��Ͻ� 1��° ���ڰ�"+a+"�� Ȧ���̸� 3�� ����Դϴ�.");
//			}else if(a%2==0){
//				System.out.println("�Է��Ͻ� 1��° ���ڰ�"+a+"�� ¦���̸� 3�� ����� �ƴմϴ�.");
//			
//			}
//			if(b%2==0){
//				System.out.println("�Է��Ͻ� 2��° ���ڰ�"+b+"�� ¦���̸� 3�� ����� �ƴմϴ�.");
//			}else if(b%3==0){
//				System.out.println("�Է��Ͻ� 2��° ���ڰ�"+b+"�� Ȧ���̸� 3�� ����Դϴ�.");
//			
//			}
//			break;			
//			}//end of for
//[pass]
	}
}
