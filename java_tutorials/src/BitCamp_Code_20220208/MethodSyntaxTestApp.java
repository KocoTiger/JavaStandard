package jb03.part04;

/*
FileName: MethodSyntaxTestApp.java
�� Bean(POJO)�� MethodSyntax.class�� ����ϴ� Application class
*/

public class MethodSyntaxTestApp{
	///Field
	///Method
	///Main
	public static void main(String[] args){
		
		//MethodSyntax.class�� ���(Instance���� :: new�����ڻ��)
		MethodSyntax methodSyntax = new MethodSyntax();

		//methodSyntax �ĺ����� ���� Instance�� method�� �����ڷ� ���� ���
		System.out.println("\n====================================");
		methodSyntax.browerOn();

		System.out.println("\n====================================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc�۾� ����:"+result);

		System.out.println("\n====================================");
		int value = methodSyntax.sum(1,1);
		System.out.println("��� �����:"+value);
		//==>���� �ζ����� �Ʒ��� ���� ǥ���ߴ�. �ּ�Ǯ�� ��°���� Ȯ���ϸ�....
		//System.out.println("��� �����:"+methodSyntax.sum(1,1));

		System.out.println("\n====================================");
		String name=methodSyntax.getName();
		System.out.println("Field���� name:"+name);

		System.out.println("\n====================================");
		String add=methodSyntax.getAdd();
		System.out.println("Field ���� add:"+add);
		//System.out.println("Field ���� add:"+methodSyntax.getAdd());

		System.out.println("\n====================================");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field���� ��� ���");

		for(int i=0; i<info.length; i++){
		//for(int i=0; j<2; i++){	//<==info.length�� ���� 2�� ��������???
			System.out.println((i+1)+" ��° ���� :"+info[i]);
		}
			

	}//end of main

}//end of class




class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
