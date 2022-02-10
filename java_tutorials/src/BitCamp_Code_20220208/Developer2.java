
package jb03.part06;

/*
FileName: Developer2.java
::����Ȱ����, ������ �����ϴ� ȫ�浿�� ObjectModeling
1. ȫ�浿�� ���ȭ �����Ѱ�	: attribute ==> Field
2. ������ �ش��ϴ� ����		: behavior	==> Method
3. ������ project�� name�� ǥ���� �� �ִ� ���� �߰�
4. ���� ���� ���� income�� ������ ��� �� �� �ִ� ���� �߰�
=======================================================
 �߰����� ����
 1. Field ������ return�ϴ� ������ ���� getter method����
	(��ü�� attribute�� information hiding (Encapsulation)�Ǿ� ������,
	 ������ ���ؼ� information hiding�Ǿ� �ִ� ������ ������ �� �ִ�.)

  OOP�� information hiding�� ���������� ���信�� getter method�� �ǹ̸� Ȯ��
 ==> ���� information hiding �����ϴ� access Modifier �ٽ� ���� �մϴ�.
*/

public class Developer2{

	///Field ==> Ư��, �Ӽ�(attribute)ǥ��
	//private String name="ȫ�浿";
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome=100;
	int projectCareer;		//<== Field���� �Ѱ��(������ ���� �� ���)�ʱ�ȭ ������?

	///Method==>���, ����(behavior)ǥ��
	/*
	project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
	1. income�� 1����
	2. projectCareer�� 1����
		����
	*/
public void participateProject(){
	System.out.println("���α׷����߷� ��������, ��½���");
	avgIncome++;
	projectCareer++;
}
/* ====================�߰��� method(OverLoading Method)============
project�� �����Ͽ� ������ ���� �� ����� ������ ��Ÿ���� method
1. income�� 1����
2. projectcareer�� 1����
	���� �� ���� project�� name�� ���÷����ϴ� ����
*/
public void participateProject(String project){
	System.out.println(project+"project������ ��������, ��½���");
	avgIncome++;
	projectCareer++;
}
/*
���Ǹ� ���ؼ����� ����
1. income�� 1����
	����
*/

public void instruct(){
	System.out.println("���Ǹ� ���� ��������");
	avgIncome++;
}
/*===============�߰��� method(OverLoading Method)============
���Ǹ� ���ؼ����� ����
1. ���Ǽ��� ���� income�� ����
	����
*/
public void instruct(int lectureCount){
	System.out.println(lectureCount+": �� ���Ǹ����� ��������");
	avgIncome += lectureCount;
}

/////////////////�߰��� �κ�//////////////////////////////
/*
���°��� return�ϴ� ����(getter method)�� ����.
==> ��ü�� ��� ������ Encapsulation�Ǿ� ������,
==> ������ ���� Encapsulation�Ǿ� �ִ� ���°��� ������ �� �ִ�.
*/
public String getName(){
	System.out.println("getName() method");
	return name;
}
public String getjob(){
	System.out.println("getjob() method");
	return job;
}
public int getAvgIncome(){
	System.out.println("getAvgIncome() method");
	return avgIncome;
}
public int getProjectCareer(){
	System.out.println("getprojectCareer() method");
	return projectCareer;
}


}//end class





