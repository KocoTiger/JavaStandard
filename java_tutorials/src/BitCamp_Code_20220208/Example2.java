/*
<<<<<<<<<<<<<<<<<<�ǽ�����>>>>>>>>>>>>>>>>>>>>
[1] 1�� ~9���� �Է� �޾� �Է� ���� �ܼ��� ����ϴ� ���α׷�
	�Է°��� 0�����̰ų� 10�̻��ΰ�� 1~9������ ���� �Է��Ұ��� ����Ұ�.
	���࿹> java Example2 5
	==> ������(��°��)
		5���� ����մϴ�.
		1*5 = 5
		2*5 = 10.....
 */



class Example2{

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		
//[���� ����1]
		do{ 

		System.out.println("���ڸ� �Է��Ͽ� �ּ���(1~9)>");
		System.out.println("����: 0����, 10�̻��� ���� ���� ��, ���۵�");

		}//end of do

		while(0>=a && a>=10);
		
		if(a>=1 && 10>a){
				System.out.println(a+" ���� ����մϴ�.");

					for(int j=1; j<10; j++)
					System.out.println(a+"*"+j+" = "+a*j);

		}//end of for a

		if(a>=1 && 10>a){
					for(int j=1; j<10; j++)
					System.out.println(a+"*"+j+" = "+a*j);
		}
//[pass]


	}//end of main
}//end of class