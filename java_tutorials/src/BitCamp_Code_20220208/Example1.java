
//[4] : ���ڸ� �Է� �޾�(1~100)90�̻� ��, 80���̻� ��, 70���̻� ��, 60�� �̻� ��
//	  �� ���ϴ� ���� ����ϱ�
//	  (�Է��� ���� 0~100���� �̾���Ѵ�. ���̻� �������� ��� ��� ó���� ���ΰ�)
//	  
//
//	  //if ��
//	  FileName : Example1.java
//	  
//	  ���࿹> java Example 1 95
//	  ==> ������ (��°��...)
//	  �Է��Ͻ� �� 95���� ���Դϴ�.


class Example1 
{
	public static void main(String[] args) 
	{
		//[FileName :Example1]					
			int a = Integer.parseInt(args[0]);
			
//[1���� if]
//			if(90<=a && a<=100){
//					System.out.println("�Է��Ͻ� ����"+a+"���� ���Դϴ�.");
//			}else if(a >= 80){
//					System.out.println("�Է��Ͻ� ����"+a+"���� ���Դϴ�.");
//			}else if(a >= 70){
//					System.out.println("�Է��Ͻ� ����"+a+"���� ���Դϴ�.");
//			}else if(a >= 60){
//					System.out.println("�Է��Ͻ� ����"+a+"���� ���Դϴ�.");
//			}else if(a < 60){
//					System.out.println("�Է��Ͻ� ����"+a+"���� ���Դϴ�.");
//			}
//[pass]

//[2���� switch]
			
			switch(a/10){
			case 10:
			case 9:
					System.out.println("�Է��Ͻ� ��"+a+"���� �� �Դϴ�.");	
					break;
			case 8:
					System.out.println("�Է��Ͻ� ��"+a+"���� �� �Դϴ�.");	
					break;
			case 7:
					System.out.println("�Է��Ͻ� ��"+a+"���� �� �Դϴ�.");	
					break;
			case 6:
					System.out.println("�Է��Ͻ� ��"+a+"���� �� �Դϴ�.");	
					break;
			default:
					System.out.println("�Է��Ͻ� ��"+a+"���� �� �Դϴ�.");	
					break;
//			}
//[pass]
	}
}
