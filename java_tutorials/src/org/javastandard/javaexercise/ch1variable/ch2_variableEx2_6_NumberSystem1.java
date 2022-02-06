/*p.42~49
#3. ���� (number system)

#3.1 10������ 2����
	�ϻ��Ȱ -> 10���� (���)
	1946�� ENIAC 10���� ��ǻ�� -> ����ȸ�δ� ������ �Ҿ��� ������ 10�ܰ�� ������ ó���ϴ� �� �Ѱ�
	1950�� EDVAC 2���� ��ǻ�� -> ���Ⱑ �帧 1, ���Ⱑ ���� 0 (��ǻ�Ϳ��� ����)
	
		age 25 		->		 age 11001
	int age = 25;		//���� age�� 25�� ����

	[����] intŸ���� ũ�Ⱑ 4byte
	32�ڸ��� 2������ ǥ���ؾ�������, ���� 0�� ����.
	���� 0�� ��������������,
	���� : 11001
	no ���� : 0000000000000000000000000011001
	- 2����, 10���� ��ǥ ����
	- 2������ 10������ ������ ǥ�� ���� (�ڸ����� ������)
	  (�����̳� �������� ���굵 10������ ����)

#3.2 ��Ʈ(bit)�� ����Ʈ(byte)
	���ڸ��� 2���� = ��Ʈ (Binary digit)
	1��Ʈ�� ��ǻ�Ͱ� ���� ������ �� �ִ� �ּҴ���
	
	1byte = 8 bit
	
	�� 1bit
	���������������� 1byte (=8bit)
	����������������/����������������/����������������/���������������� word (4byte = 32bit)
	[�׸�] ��Ʈ, ����Ʈ, ������ ũ�� ��
	
	- word��� ������ �ִµ�, CPU�� �ѹ��� ó���� ���ִ� �������� ũ�⸦ �ǹ�
	- ������ ũ��� CPU�� ���ɿ� ���� �޶���
	ex>
		32��Ʈ CPU���� 1���� = 32��Ʈ(4byte)
		64��Ʈ CPU���� 1���� = 64��Ʈ(8����Ʈ)
	[����] 0001 = 1 ������, 0001�� ũ�Ⱑ 4�ڸ� (4��Ʈ)�� �����͸� �����ϱ�����
		  �Ϻη� ���ڸ��� 0���� ä��
	[ǥ]���� p.44
	�̸� �Ϲ�ȭ �ϸ�, n��Ʈ�� 2�� n�°��� ���� ǥ�� ����
	n��Ʈ�� 10������ ǥ���Ѵٸ�,
	-> 10������ ������ 0~2�� n�� -1
	
	4��Ʈ�� ��� ����, 16��(2�� 4��)�� ���� ǥ�� ����
	4��Ʈ�� 10������ ǥ���Ѵٸ�, ������ 0~15(0~2��4��-1)
	
		n��Ʈ�� ǥ���� �� �ִ� 10����
			���� ���� : 2�� n��
			���� ���� : 0 ~ 2�� n��-1
		[����] 10���� n�ڸ��� ǥ���� ���ִ� ���� ������ 0~10�� n��-1 �̶�� �Ͱ� ���غ��� ���ذ� �� ����
		10���� 2�ڸ��� ǥ���� �� �ڴ� ���� ���� = 0~10��2��-1, �� 0~99�� �ȴ�.

#3.3 8������ 16����

   #2������ 0��1�� ǥ�� (���� : �ڸ����� ����� �����)
	���� ������ ���� 8���� 16������ ���
	
	8���� : 2������ 3�ڸ��� �� �ڸ��� ǥ������
		 : 8������ ǥ���ϴµ� 8���� ��ȣ�� �ʿ� 0~7�� ���ڸ� ���
	16����: 2������ 4�ڸ��� �� �ڸ��� ǥ������
		 : 16������ 16���� ��ȣ�� �ʿ� 0~9�� ���ڸ����δ� ����
		 : 6���� ���� (A~F)�� �߰��� ���
		 ex> 16���� A�� 10���� 10, F�� 15
		 
	���� : �ڸ����� ª������ �˾ƺ��⵵ ���� ���ΰ��� ��ȯ��� ���� �ſ� ������.
	[�׸�2-3 ���� p.45]
   
   #2������ 8����, 16������ ��ȯ
   2���� -> 8����  : 8������ ��ȯ�Ϸ���, 2������ �ڿ������� 3�ڸ��� ��� �׿� �ش��ϴ� 8������ �ٲ�
   				 : 8�� 2��3��, 8���� ���ڸ��� 2���� 3�ڸ��� ����� �� �ִ� ��
   2���� -> 16���� : 3�ڸ��� �ƴ� 4�ڸ��� ��� �ٲ� (2�� 4��)
   [����] 8,16������ 2������ ��ȯ�Ϸ��� ���� �ݴ��� ������ ��ġ�� ��.
   
   [�׸�2-4] 2������ 8����, 16������ ��ȯ
   		2���� 1010101100(2) -> 1254(8)  -> 2AC(16)

#3.4 ������ ���� ��ȯ

	##10������ n������ ��ȯ ���
	ex> 46�� 2�� ������ �� ��� �������� �Ʒ��� �׸��� ���� ����
	
			2/ 46
			   23...0
			   ��	������
			   
			 2/ 46
			 2/ 23...0
			 2/ 11...1
			 2/ 5 ...1
			 2/ 2 ...0
			 	1 ...0
			 46(10) -> 101110(2)
		- ������ ����� �������� �Ʒ��� ���� ������� ������ 2������ ��ȯ ��� ��.
	��� : n������ ��ȯ�Ϸ���, n���� �ݺ��ؼ� �����⸸ �ϸ� ��. (8, 16�� ��������)
	
	##n������ 10������ ��ȯ
	� �������� �� ���� 10������ ��ȯ�ϴ� ����� �Ȱ���
	�� �ڸ��� ���� �ش� ������ ���� ���ؼ� ��� ���ϸ� ��.
	ex>
	123(10)	=	100	+	20	+	3
			=	1	x	100	+	2	x	10	+	3	x	1
			=	1	x	10�� 2��	+	2	x	10�� 1��	+	3	x	10��0��
	
	���������� 2������ ������ ���� ǥ�� ����.
	�� �ڸ��� ������ 10�������� �ƴ϶� 2�� �����ΰ��� �����ϸ�, 10������ ����
	ex>
	101110(2) = 1 x 2��5�� + 0 x 2��4�� + 1x 2�� 3�� + 1x2�� 2�� + 1x2�� 1�� + 0x2�� 0��
			  = 1x32 + 0x16 + 1x8 + 1x4 + 1x2 + 0x1
			  = 46(10)

	8����, 16������ 10������ ��ȯ�ϴ� ������� ����
	ex> 1460(8)
	1460(8) = 1x8��3�� + 4x8��2�� + ....
	
	ex> 64F(16)
	64F(16) = 6x16��2�� + 4x16��1�� + Fx16��0��
			= 6x256 + 4x16 + Fx1	//F�� 10������ 15
			= 1536 + 64 + 15
			= 1615(10)

   #3.5 �Ǽ��� ������ȯ
   
   - 10�� �Ҽ������� 2�� �Ҽ������� ��ȯ�ϴ� ���
   : 10�� �Ҽ������� 2�� ��� ���Ѵ�.
   
   ex>	10���� 0.625�� ������ ��ȯ
   		1> 10�� �Ҽ��� 2�� ���Ѵ�.
   					0.625 x 2 	= 1.25
   		2> ���� ������� �Ҽ��θ� �����ٰ� �ٽ� 2�� ���Ѵ�.
   					0.625 x 2 	= 1.25
   					0.25 x 2 	= 0.5
   		3> 1>�� 2>������ �Ҽ��ΰ� 0�� �ɶ����� �ݺ��Ѵ�.
   					0.625 x 2 	= 1.25
   					0.25 x 2 	= 0.5
   					0.5 x 2 	= 1.0
   		[����] 3>�� �������� �Ҽ��� 0�� ���� �ʰ� ������ �ݺ��� ���� �ִ�.
   		
   		���� ������� �����θ��� ������ ���ط� ������� ���� 0.�� �տ� ���̸� �ȴ�.
   					0.625 x 2 	= 1.25
   					0.25 x 2 	= 0.5
   					0.5 x 2 	= 1.0
   				0.625(10)	->	0.101(2)
   		
   		[����] 10�� �Ҽ��� 10�� �Ҽ��� ��ȯ�ϴ� ����� 2��� 10�� ���ϸ� ��
   			  10�� �Ҽ��� 2���Ҽ��� ��ȯ�ϴ� ����� ����ϴ� �� ����� ����
					0.625 x 10 	= 6.25
   					0.25 x 10 	= 2.5
   					0.5 x 10 	= 5.0   		
	
	- 2�� �Ҽ����� 10�� �Ҽ������� ��ȯ�ϴ� ���
					0.101(2) => 0.625(10)
	0.625(10) = 6x10��-1�� + 2x10��-2�� + 5x10��-3��
	
	0.101(2) =	1x2��-1�� + 0x2��-2�� + 1x2��-3��
			 =	1x0.5 + 0x0.25 + 1x0.125
			 =	0.5 + 0.125
			 = 0.625(10)
	[����] 123.456ó�� �����ΰ� �ִ� �Ҽ������� ������ 123�� �Ҽ����� 0.456�� ���� ��ȯ�� ������ ���ϸ� �ȴ�.

 */






package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_6_NumberSystem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}