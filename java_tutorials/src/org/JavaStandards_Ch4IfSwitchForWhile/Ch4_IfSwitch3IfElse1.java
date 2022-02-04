/*p. 139~142
# 1.2 if -else문
	:if문의 값이 false일 경우 else문의 블럭안의 식이 실행
[예제 4-3]

#1.3 if else if문

	if else문은 두가지 경우 중, 하나가 수행되는 구조
	수가 셋이상인 경우에는 어떻게 해야 할까
	if else if문을 사용하면 된다.

		if (조건식1){
				//조건식1의 연산결과가 참일 떄 수행될 문장들을 적는다.
		}else if (조건식2){
				//조건식2의 연산결과가 참일 떄 수행될 문장들을 적는다.
		}else if (조건식3){	//여러개의 else if를 사용할 수 있다.
				//조건식3의 연산결과가 참일 떄 수행될 문장들을 적는다.
		}else { //마지막에는 보통 else블럭으로 끝나며, else블럭은 생략가능.
				//위의 어느 조건식도 만족하지 않을 때 수행될 문장들을 적는다.		
		}
		1) 결과가 참인 조건식을 만날 때까지 첫번째 조건식부터 순서대로 평가한다.
			(첫번째 조건식은 거짓이므로, 두번째 조건식으로 넘어간다)
		2) 참인 조건식을 만나면 해당 블럭 {}의 문장들을 수행한다.
		3) if-else if문 전체를 빠져나온다.
[예제 4-4 참고]		



 */









package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;	//scanner클래스를 사용하지 위해 추가

public class Ch4_IfSwitch3IfElse1 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);	 //입력받은 문자열(tmp)을 숫자로 변환
		
		if (input==0) {
			System.out.println("입력하신 숫자는 0입니다.");			
		}else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
//		if -else문도 블럭내의 문장이 하나뿐이라면 블럭 생략가능
//		if (input==0) 
//			System.out.println("입력하신 숫자는 0입니다.");			
//		else 
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
		
		
	

	}

}
