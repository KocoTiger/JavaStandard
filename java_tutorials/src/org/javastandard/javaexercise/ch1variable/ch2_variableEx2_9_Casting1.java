/* p. 74 ~75
#5. ����ȯ
	#5.1 ����ȯ (ĳ����, casting)�̶�?
	: ���δٸ� Ÿ�԰� ������ �����ؾ��ϴ� ��찡 �ִ�. �̷��� Ÿ���� ��ġ ���Ѿ���.
 	: ������ ���ͷ��� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϴ� ��
 	
 		����ȯ, ���� �Ǵ� ����� Ÿ���� �ٸ� Ÿ������ ��ȯ �ϴ� ��.
 	ex>
 	int Ÿ���� ���� floatŸ���� ���� ���ϴ� ���
 	�� ���� ���� Ÿ������ ��, �Ѵ� floatŸ������ ��ȯ�� ������ �ؾ���.
 		int < long < float < double

 	#5.2����ȯ ���
 					(Ÿ��) �ǿ�����
 	���⼭()�� ĳ��Ʈ ������ or ����ȯ ������ => ����ȯ�� ĳ�����̶���
 	ex> 
 				double d = 85.4;
 				int score = (int)d; 	//doubleŸ���� ���� d�� intŸ������ ����ȯ
 	�ι�° ���� ��������� �ܰ躰�� ����
 	int score = (int)d;
 	int score = (int)85.4;		//���� d�� ���� �о� �ͼ� ����ȯ
 	int score = 85;				//����ȭ�� ����� 85�� ���� score�� ����
 	- ����ȯ ������ : ���� �ǿ������� ���� �о ������ Ÿ������ ����ȯ �ϰ� �� ����� ��ȯ�� ����
 	- �ǿ������� ���� d�� ���� ����ȯ �Ŀ��� �ƹ��� ��ȭ�� ����.
 	
 */










//���� 2-12/Castingex1.java p. 75
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx2_9_Casting1 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score="+score);
		System.out.println("d="+d);
	}

}
//����� : 
//	score=85
//	d=85.4	 <--- ����ȯ �Ŀ��� �ǿ����ڿ��� �ƹ��� ��ȭ�� ����.
/*
#�⺻������ boolean�� ������ ������ Ÿ�Ե��� ���� ����ȯ ����
�߿�! �⺻���� ���������� ����ȯ �Ұ�


			��ȯ				����				���
			int->char		(char)65		'A'
			char->int		(int)'A'		65
			float->int		(int)1.6f		1
			int->float		(float)10		10.0f





 */

