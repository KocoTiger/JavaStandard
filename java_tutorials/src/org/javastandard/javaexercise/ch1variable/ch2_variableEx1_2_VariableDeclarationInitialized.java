/*p.22~25
1.2 변수의 선언과 초기화
# 두 변수의 값 교환하기!
	int x = 10;
	int y = 20;

1) 변수 y에 저장된 값을 변수 x에 저장
	x = y;
	
		x 10	<-	y 20
		x 20	<-	y 20

2) 변수 x에 저장된 값을 변수 y에 저장
	y = x;

		y = 20  <-	x 20
		y = 20	<-	x 20

////첫번째 단계에서 y의 값을 x로 저장할 떼, 이미 x의 값이 없어짐
////x의 값을 y로 저장해도 소용이 없음.
////결론 : 변수를 하나 더 선언! (x값을 위한 임시 저장소로 이용)

	int x = 10;
	int y = 20;
	int tmp;  //x값 임시로 저장할 변수 선언

1) 변수 x 저장 값을 변수 tmp에 저장
	tmp = x;
	
	x 10	tmp ???		y 20
	x 10	tmp 10		y 20
2) 변수 y에 저장된 값을 변수 x에 저장
	x = y;
	
	x 10	tmp 10	<-	y 20
	x 20	tmp 10	<-	y 20
3) 변수 tmp에 저장된 값을 변수 y에 저장
	y = tmp;
	
	x 20	tmp 10	->	y 20
	x 20	tmp 10	->	y 10
 
*/

//예제 2
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
