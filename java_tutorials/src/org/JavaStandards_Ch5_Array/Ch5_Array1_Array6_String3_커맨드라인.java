/*p.211 ~213
##2.4 Ŀ�ǵ� ������ ���� �Է� �ޱ�.
	: ScannerŬ������ nextLine() �̿ܿ��� ȭ���� ���� ����ڷκ��� ���� �Է¹��� �� �ִ� ������
	  ����� �ִ�.
	: �ٷ� Ŀ�ǵ� ������ �̿��ϴ� ���
	: ���α׷��� �����Ҷ� Ŭ������ �̸� �ڿ� ���鹮�ڷ� �����Ͽ� �������� ���ڿ��� ���α׷��� ���� �� �� �ִ�.
	: ���� ������ ���α׷��� main�޼��尡 ��� Ŭ������ �̸��� MainTest��� �����ϸ� ������ ���� ���� ����
		
		c:\jdk1.8\work\ch5>java MainTest abc 123
	
	: Ŀ�ǵ� ������ ���� �Էµ� �� ���ڿ��� String�迭�� ��ܼ� MainTestŬ������ main�޼����� 
	  �Ű�����(args)�� ����. �׸��� main �޼��� ������ args[0], args[1]�� ���� ������� Ŀ�ǵ�������� ���� ���� ���� ���ڿ��� ������ �� �ִ�.
	: ���⼭, args[0]�� "abc"�̰� args[1]�� "123"�̴� �ȴ�.
	[���� 5-16]   
	[���� 5-17]

 */





package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String3_Ŀ�ǵ���� {

	public static void main(String[] args) {
//[���� 5-16]
//		System.out.println("�Ű������� ����:"+ args.length);
//		
//		for(int i=0; i<args.length; i++) {
//			System.out.println("args["+i+"] = \""+ args[i] + "\"");
//		}
/*
	: Ŀ�ǵ���ο� �Էµ� �Ű������� ���鹮�ڷ� �����ϱ� ������ �Էµ� ���� ������ �ִ� ���
	  ""�� ���� �־�� �Ѵ�.
	: Ŀ�ǵ���ο��� ���ڸ� �Է��ص� ���ڰ� �ƴ� ���ڿ��� ó���ȴٴ� �Ϳ� �����ؾ���.
	: ���ڿ�"123"�� ���� 123���� �ٲٷ��� ������ ���� �Ѵ�.
	
			int num = Integer.parseInt("123");	//����num�� ���� 123�� ����ȴ�.
	
	: Ŀ�ǵ���ο� �Ű������� �Է����� ������ ũ�Ⱑ 0�� �迭�� ����
	: args.length�� ���� 0�̵ȴ�. (�̷��� ũ�Ⱑ 0�� �迭�� �����ϴ� �͵� ����)
	: ���� �Էµ� �Ű������� ���ٰ� �ؼ� �迭�� �������� ������ �������� args�� ���� null�̵� ��
	: �迭 arg�� ����ϴ� ��� �ڵ忡�� ������ �߻��� ���̴�.
	: �̷� ������ ���ϱ� ����, ������ ���� main �޼��忡 if���� �߰������ �Ѵ�.
			
			if(args!=null){	//args�� null�� �ƴҶ��� ��ȣ{}�� ������� ����
			System.out.println("�Ű������� ����:"+ args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+ args[i] + "\"");
			}
	
	:�׷��� JVM�� �Էµ� �Ű������� ���� ��, null��� ũ�Ⱑ 0�� �迭�� �����ؼ� args��
	  �����ϵ��� �����Ǿ� �츮�� �̷��� ���� ���� �Ǿ���.
	
 */
//[���� 5-17]
		if (args.length != 3){
			System.out.println("usage: java ArrayEx17 NUM OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);	//���ڿ��� ���ڷ� ��ȯ
		char op = args[1].charAt(0);			//���ڿ��� ����()char)�� ��ȯ
		int num2 = Integer.parseInt(args[2]);
		
		int result = 0;
		
		switch(op) {		//switch���� �������� charŸ���� ������ ����
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("���:" + result);
		
		}
/*
	: ȭ������ ���� ��Ģ ������ �����϶�� ������ �Է¹޾Ƽ� ���
	: �װ���� �����ִ� ����.
	: Ŀ�ǵ� �������κ��� �Է¹��� �����ʹ� ��� ���ڿ� �̹Ƿ� ���ڿ� ���ڷ� ��ȯ�� �ʿ�
	: Integer.parseInt()�� ���.
		
		
 */
		

	}//end main

}//end public
