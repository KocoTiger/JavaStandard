//[3] for���� �̿��Ͽ� 1��~9���� ����ϴ� ���α׷�
//	���࿹> java Example4
//	==>������(��°��....)
//		1���� ����մϴ�.
//		1*1 = 1
//		2*1 = 2
//		..........
//		9���� ����մϴ�.
//		1*9 = 9
//		2*9 = 18
//		..........


public class Example4 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++){
				System.out.println(i+"���� ����մϴ�.");
				System.out.println("------------------------------------------");
			for(int j=1; j<10; j++)
				System.out.println(i+"*"+j+"="+i*j);
		}//end of for i

	}
}