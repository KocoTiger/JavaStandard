package jb03.part03;

/*
FileName :	Developer.java

::���� Ȱ����, ������ �����ϴ� ȫ�浿�� Object Modeling
  1. ȫ�浿�� ���ȭ ������ ��.	: attribute ==> Field
  2. ������ �ش��ϴ� ����		: behavior ===> Method
  �̸� java language�� ����
*/



public class Developper{
	

		//Field ==> Ư��, �Ӽ�(Attribute)�Ф���
		String name = "ȫ�浿";
		String job ="������";
		int avgincome = 100;
		int projectCareer;		//<==Field ���� �� ���(������ ���� �Ѱ��)�ʱ�ȭ ������?

		//Method==>���, ����(behavior)ǥ��
		/*
		project�� �����ϱ� ������ ���� �� ����� ������ ��Ÿ���� method
		1. income�� 1 ����
		2. projectCarrer�� 1����
		����
		*/
	
	public void participateProject(){
		System.out.println("���α׷����߷� ��������, ��½���");
		avgincome++;
		projectCareer++;
	}
	/*
	���Ǹ� ���� ������ ����
	1. income�� 1����
	����
	*/
	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}


}//end of class
