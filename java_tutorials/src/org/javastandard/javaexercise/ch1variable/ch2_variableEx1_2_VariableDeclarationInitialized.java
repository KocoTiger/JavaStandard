/*p.22~25
1.2 ������ ����� �ʱ�ȭ
# �� ������ �� ��ȯ�ϱ�!
	int x = 10;
	int y = 20;

1) ���� y�� ����� ���� ���� x�� ����
	x = y;
	
		x 10	<-	y 20
		x 20	<-	y 20

2) ���� x�� ����� ���� ���� y�� ����
	y = x;

		y = 20  <-	x 20
		y = 20	<-	x 20

////ù��° �ܰ迡�� y�� ���� x�� ������ ��, �̹� x�� ���� ������
////x�� ���� y�� �����ص� �ҿ��� ����.
////��� : ������ �ϳ� �� ����! (x���� ���� �ӽ� ����ҷ� �̿�)

	int x = 10;
	int y = 20;
	int tmp;  //x�� �ӽ÷� ������ ���� ����

1) ���� x ���� ���� ���� tmp�� ����
	tmp = x;
	
	x 10	tmp ???		y 20
	x 10	tmp 10		y 20
2) ���� y�� ����� ���� ���� x�� ����
	x = y;
	
	x 10	tmp 10	<-	y 20
	x 20	tmp 10	<-	y 20
3) ���� tmp�� ����� ���� ���� y�� ����
	y = tmp;
	
	x 20	tmp 10	->	y 20
	x 20	tmp 10	->	y 10
 
*/

//���� 2
package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx1_2_VariableDeclarationInitialized {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x + "\t" + "y:" + y);

		tmp = x;  //tmp 10
		x = y;  //x 20
		y = tmp; // y 10
		
	
		System.out.println("x:" + x + "\t" + "y:" + y + "\n");
		
		
		System.out.println("x:" + x + "\t" + "y:" + y);
		System.out.println("x:" + 10  + "\t" + "y:" + 20);
		System.out.println("x:10" + "\t" + "y:" + 20);
		System.out.println("x:10    y:" + 20);
		System.out.println("x:10   y: 20");
		
		

	}//end main

}//end class
