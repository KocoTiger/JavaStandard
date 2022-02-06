/*p. 205~207
	#2 String�迭
	##2.2 String�迭�� ����� ����
	: �迭�� Ÿ���� String�� ��쿡�� int�迭�� ����� ��������� �ٸ��� ����
	: ���� ��� 3���� ���ڿ�(String)�� ��� �� �ִ� �迭�� �����ϴ� ������ ������ ����.
	
		String[] name = new String[3];  // 3���� ���ڿ��� ���� �� �ִ� �迭�� �����Ѵ�.
	
	���� ������ ������ ����� �׸����� ǥ���ϸ�,
	3���� StringŸ���� ���������� �����ϱ� ���� ������ ���õǰ� ������ ������ �⺻����null
	�� ����� ���� null�� �ʱ�ȭ
	
	name			name[0]		name[1]		name[2]
	[0x100]		->	[null]		[null]		[null]
					0x100
 	
 	: ����� ������ Ÿ�Կ� ���� �⺻���� �̷���
 			�ڷ���					�⺻��
 			boolean					false
 			char					'\u0000'
 			byte, short, int		0
 			long					0L
 			float					0.0f
 			double					0.0d �Ǵ� 0.0
 			����������					null
 			
 	##2.2 String�迭�� �ʱ�ȭ
 		: �ʱ�ȭ ���� int�迭�� ������ ���
 		: �Ʒ��� ���� �迭�� �� ��ҿ� �� ��ҿ� ���ڿ��� �����ϸ� �ȴ�.
 		
 		String[] name = new String[3];	//���̰� 3�� string�迭�� ����
 		name[0] = "Kim";
 		name[1] = "Park";
 		name[2] = "Yi";
 		
 		:�Ǵ� ��ȣ{}�� ����Ͽ� ������ ���� ������ �ʱ�ȭ ����
 		String[] name = new String[]{"Kim","Park","Yi"};
 		String[] name = {"Kim","Park","Yi"};	//new String�� ���� ����
 		
 	name			name[0]		name[1]		name[2]
	[0x100]		->	[Kim]		[Park]		[Yi]
					0x100
 		: Ư���� StringŬ������ "Kim"�� ���� ū ����ǥ�θ����� ������ ǥ���ϴ� ���� ���
 		: ���� String�� Ŭ���� �̹Ƿ� �Ʒ��� ���ʰ� ���� new�����ڸ� ���� ��ü�� �����ؾ���
 		String[] name = new String[3];				String[] name = new String[3];
 		name[0] = new String("Kim");				name[0] = "Kim";	
 		name[1] = new String("Park");		->		name[1] = "Park";
 		name[2] = new String("Yi");					name[2] = "Yi";

	(��Ȯ�� �׸�)
 	name			name[0]		name[1]		name[2]
	[0x100]		->	[0x200]		[0x300]		[0x400]
			0x100
 					
 					["Kim"]		["Park"]	["Yi"]
 					0x200		0x300		0x400	
 		: �迭�� ���� ��ü�� �ƴ� ��ü�� �ּҰ� ����Ǿ� �ִ� ���� ���� �ִ�.
 		: �⺻�� �迭�� �ƴѰ��, ��, ������ �迭�� ��� �迭�� ����Ǵ� ���� ��ü�� �ּ�.
 		: ������ �迭�� ��ü�迭�̶�� ��
 
 	[����] ������ ������ ������ ����������� �Ѵ�.
 		  ��� ������ �������� ��ü�� �޸𸮿� ����� �ּ��� 4byte�� ������ (0x0~0xfffffff)�Ǵ� null�� ����
 	[���� 5-12]	
 		
 
 */



package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String1 {

	public static void main(String[] args) {
// 	[���� 5-12]
//		String[] names = {"Kim","Park","Yi"};
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println("names["+i+"]" + names[i]);
//		}
//		
//		String tmp = names[2]; 	//�迭 names�� ����°��Ҹ� tmp�� ����
//		System.out.println("tmp:"+ tmp);
//		
//		names[0] = "Yu";		//�迭names�� ù ��° ��Ҹ� "Yu"�� ����
//		
//		for(String str : names) {	//���� for��
//			System.out.println(str);
//		}
//		����� : 
//			names[0]Kim
//			names[1]Park
//			names[2]Yi
//			tmp:Yi
//			Yu
//			Park
//			Yi
//	 	[���� 5-13]
		char[] hex = {'C','A','F','E'};
		
		String[] binary = {"0000","0001","0010","0011"
						  ,"0100","0101","0110","0111"
						  ,"1000","1001","1010","1011"
						  ,"1100","1101","1110","1111"};
		
		String result="";
		
		for(int i =0; i<hex.length; i++) {
			if(hex[i] >='0' && hex[i]<='9' ) {
				result += binary[hex[i]-'0'];	//'8'-'0'�� ����� 8�̴�.
			}else { // A~F�̸�
				result += binary[hex[i]-'A'+10]; //'C'-'A'�� ����� 2
			}
		}
		System.out.println("hex:"+ new String(hex));		//String(char[] value)
		System.out.println("binary:" + result);
/*
		����� :
			hex:CAFE
			binary:1100101011111110
		
		: 16������ 2������ ��ȯ�ϴ� ����.
		: ���� ��ȯ�ϰ��� �ϴ� 16������ �迭hex�� �����Ѵ�.
		: 16�������� A~F���� 6���� ���ڰ� ���� �ǹǷ� char�迭�� ó���Ͽ���.
		: �׸��� ���ڿ� �迭 binary���� ������ '0000'���� '1111'(16������ 0~F)���� ��� 16���� ���� 
		  ���ڿ��� ����
		: for���� �̿��ؼ� �迭 hex�� ����� ���ڸ� �ϳ��� �о
		  �׿� �ش��ϴ� ������ ǥ���� �迭 binary���� ��� result�� �����̰� ����� ȭ�鿡 ���	
*/		
		
		

	}//end main
}//end public
