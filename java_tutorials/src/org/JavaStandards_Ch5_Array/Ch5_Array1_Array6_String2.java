/*p.208 ~211
##2.3 char�迭�� StringŬ����
	: ���ڿ�=���ڸ� ���̷� �þ���� ��=���ڹ迭�� char�迭�� ���� ��
	: �ڹٿ���char�迭�� �ƴ�StringŬ������ �̿��ؼ� ���ڿ��� ó���ϴ� ������
	  StringŬ������ char�迭�� �������� ����� �߰��Ͽ� Ȯ���� ��.
	: �׷��� char�迭�� ����ϴ� �ͺ��� StringŬ������ ����ϴ� ���� ���ڿ��� �ٷ�Ⱑ �� ��
	
			StringŬ������ char�迭�� ����� �߰��� ��.
	
	: C������ ���ڿ��� char�迭�� �ٷ�
	: ��ü���� ����� �ڹٿ����� char�迭�� �׿� ���õ� ��ɵ��� �Բ� ��� Ŭ������ ����
	: ��ü���� ��� ������ ������ �����Ϳ� ����� ���� ��
	: ��ü��������� �����Ϳ� �׿� ���õ� ����� �ϳ��� Ŭ������ ��� �ٷ� �� �ְ� ��.
	: ���� ���õ� �͵� ���� �����Ϳ� ����� �������� �ʰ� �Բ� ���� ��.
	
	: ���⼭ ����� �Լ��� �ǹ�
	: �޼���� ��ü���� ���� �Լ� ��� ����ϴ� ���
			�Լ� = �޼��� = ���
	
	: char �迭�� StringŬ������ �Ѱ��� �߿��� ����
	  String��ü(���ڿ�)�� ���� ���� �ִ� (������ �����ϴ� ���� �Ұ���)
	
		String str = "Java";			
		str = str + "8";			//"Java8"�̶�� ���ο� ���ڿ��� str�� ����		
		System.out.println(str);	//"Java8"
 
 	: ���� ���忡�� ���ڿ� str�� ������ ����Ǵ� �� ������, ���ڿ��� ������ �� �����Ƿ�
 	  ���ο� ������ ���ڿ��� ����
 	[����]���� ������ ���ڿ��� �ٷ����, StringBufferŬ������ ����ϸ� �ȴ�.
 		 ���ڿ��� ���� ���� 9�忡�� �ڼ��� �����Ѵ�.
 	
 	###StringŬ������ �ֿ� �޼���
 		: ����� ���� ���ڿ� ���� �޼������ ����
 		: ���� �⺻���� ����� ���캸�� (�������� 9��)
 		
 		�޼���								����
 		char charAt(int index)				���ڿ����� ��ġ(index)�� �ִ� ���ڸ� ��ȯ�Ѵ�.
 		int length()						���ڿ��� ���̸� ��ȯ�Ѵ�.
 		String substring(int from, int to)	���ڿ����� �ش� ����(from~to)�� �ִ� ���ڿ��� ��ȯ�Ѵ�.
 											(to�� ������ ���Ե��� ����)
 		boolean equals(String str)			���ڿ��� ������ ������ Ȯ���Ѵ�. ������ ����� true, �ٸ��� false
 		char[] toCharArray()				���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ.
 
 		: charAt �޼���� ���ڿ����� ������ index�� �ִ� �ѹ��ڸ� ������
 		: �迭���� '�迭�̸�[index]'�� index�� ��ġ�� ���� �������� �Ͱ� ����
 		: �迭�� ���������� charAt�޼����� index���� 0���� ����
 		
 			String str = "ABCDE";
 			char ch = str.charAt(3);	//���ڿ� str�� 4��° ���� 'D'�� ch�� ����
 			
 		: substring()�� ���ڿ��� �Ϻθ� �̾Ƴ��� �ִ�.
 		: ���� �� ���� ������ ���� ���Ե��� �ʴ´�
 		: ���� ���, index�� ������ 1~4��� 4�� ������ ���Ե��� �ʴ´�.
 		
 			String str = "012345";
 			String tmp = str.substring(1,4);	//str���� index���� 1~4�� ���ڵ��� ��ȯ
 			System.out.println(tmp);		//"123"�� ���
 		: equals()�� �̹� �տ��� ������ ���
 		: ���ڿ��� ������ ������ �ٸ��� Ȯ���ϴµ� ���
 		: �⺻�� ������ ���� ���ϴ� ��� == ������ ���
 		: ���ڿ��� ������ �񱳽� equals()�� ���
 		: �� �޼���� ��ҹ��ڸ� ������(���� ����)
 		: ��ҹ��� �������� �ʰ� ���Ϸ���
 		  qeualsIgnoreCase()�� ���
 		
 			String str = "abc";
 			if(str.equals("abc")){  //str�� "abc"�� ������ ������ Ȯ��
 				...
 		  	}							
 		  								
 		  ##char�迭�� StringŬ������ ��ȯ
 		  :	���� char�迭�� StringŬ������ ��ȯ, �Ǵ� �� �ݴ�� ��ȯ �ؾ� �ϴ� ��찡 �ִ�.
 		  		
 		  		char[] chArr = {'A','B','C'};
 		  		String str = new String(chArr);	//char�迭 -> String
 		  		char[] tmp = str.toCharArray();	//String  -> char�迭
 [���� 5-14]		  	  
		: StringŬ������ charAt(int idx)�� ����ϴ� ����� �����ִ� ����
		: charAt(int idx)�� ���ڿ� �߿��� idx��° ��ġ�� �ִ� ���ڸ� ��ȯ
		: idx�� ���� �迭ó�� 0���� �����Ѵٴ� ���� Ȯ������
		: println()�� ���ڹ迭�� ����ϸ� ���ڿ� �߷��ϵ��� ���� �迭��
		  ��� ��Ҹ� �̾ ���ٷ� ���
 
 
 
 */



package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String2 {

	public static void main(String[] args) {
// [���� 5-14]		  
//		String src = "ABCDE";
//		
//		for (int i=0; i<src.length(); i++) {
//			char ch = src.charAt(i);		//src�� i��° ���ڸ� ch�� ����
//			System.out.println("src.charAt("+i+")"+ ch);
//		}
//		
//		char[] chArr = src.toCharArray();  //String�� char[]�� ��ȯ
//		
//		System.out.println(chArr);		//char�迭 (char[])�� ���
//
//		����� :
//			src.charAt(0)A
//			src.charAt(1)B
//			src.charAt(2)C
//			src.charAt(3)D
//			src.charAt(4)E
//			ABCDE			
//[���� 5-15]
		String source = "SOSHELP";
		String[] morse = {""
							//å ����
										};
		
		String result="";
		
		for(int i=0; i<source.length(); i++) {
			result+=morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+source);
		System.out.println("morse:"+result);
/*
		:���ڿ�(String)�� �𸣽� ��ȣ�� ��ȯ�ϴ� ����.
		: ������ 16������ 2������ ��ȯ�ϴ� ������ ����.
		: char�迭��� String�� ���
		: String�� ������ ������ length()�� ���ؼ� ���� �� �ְ�
		: charAt(int i)�޼���� String�� i��° ���ڸ� ��ȯ
		: for���� ���ǽĿ� length()�� ����ϰ�
		: charAt(int i)�� ���ؼ� source���� �� ���ھ� ���ʴ�� �о�ü� �ִ�.
  	
 */
		
		
		
		
	}

}
