//[2] : �μ��� �Է¹ް� �μ��� ���Ͽ� ���ϱ�/���� ����
//	  ù��° �μ��� ũ�� ���� / ������ ���ϱ�
//	  FileName : test2.java
//	  
//	  //if��
//	  ���࿹ > java Test2 2 1
//	  ==> ������(��°��...)
//	  ù��°�μ� : 2, �ι����μ�:1, 2-1 = 1 �Դϴ�.
//	  
//	  ���࿹ > java Test2 1 2
//	  ==> ������ (��°��...)
//	  ù��° �μ�:1, �ι�°�μ�:2, 2+1=3 �Դϴ�.




class Test2
{
	public static void main(String[] args) 
	{
//[FileName :Test 2]

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a-b;
		int d = a+b;
			
		if(a > b){
			System.out.println("ù��° �μ�:"+a+", �ι�° �μ�:"+b+", "+ a +"-"+ b +" = "+c);
		}else if(a < b){
			System.out.println("ù��° �μ�:"+a+", �ι�° �μ�:"+b+", "+ a +"+"+ b +" = "+d);
		}
//else�ڿ��� (���ǽ��� ������.), ���ǽ��� ���� �ʹٸ�, else-if(����)�� ���� �ȴ�. 
	}
}
