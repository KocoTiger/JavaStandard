package jb03.part03;

/*
FileName : DeveloperTest.java

::Deceloper.class Instance ����, ����ϴ� class ����: Application class
*/









public class DeveloperTest 
{
	///Field
	///Method
	///Main Method

	public static void main(String[] args) 
	{
		//Developer.class�� instanceȭ �� (keyword new ���)
		Developer developer = new Developer();

		//developer �ĺ����� ���� Instance. �����ڸ� ���� ���
		System.out.println("�̸�:"+developer.name);
		System.out.println("����:"+developer.job);
		System.out.println("��ռ�����:"+developer.avgIncome);
		System.out.println("PJT�����:"+developer.projectCareer);

		System.out.println("===============================");

		//project�� ����
		developer.participateProject();
		System.out.println("��ռ����� :"+developer.avgIncome);
		System.out.println("project���� ����� :"+developer.projectCareer);

		System.out.println("===============================");

		//1�� ������ ����
		developer.instruct();
		System.out.println("��ռ����� :"+developer.avgIncome);

	}//end of main
}//end of class
