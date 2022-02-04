/*p.146~149
1.5 switch문
	: if문은 조건식 참과 거짓 두가지 밖에 벗다
	: 경우의 수가 많아질 수록 else-if를 계속 추가 해야함. (복잡, 처리시간도 많이 걸림)
	: switch문은 단 하나의 조건식으로 많은 경우의 수를 처리함 (표현 간결)
	  처리할 경우의 수가 많을때는 switch문을 써
	[참고],switch문은 항상 if문으로 변환이 가능, if는 switch문으로 작성할 수 없는 경우가 많음.

	##switch문 기본 구조
	switch(조건식){
		case 값1 :
				//조건식의 결과가 값1과 같을 경우 수행될 문장들
				//....
				//break;	
		case 값2 :
				//조건식의 결과가 값2와 같을 경우 수행될 문장들
				//....
				//break;		
		//...
		default:
				//조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
				//...		
	
	}
 	switch문은
 	1) 조건식을 먼저 계산
 	2) 결과가 일치하는 case문으로 이동
 	3) 이동한 아래에 있는 문장들 실행
 	4) break문을 만나면 전체 switch문을 빠져나감
 	5) default 문의 위치는 어디라도 상관없으나, 보통 마지막에 놓음 (break문 쓰지 않아도 됨)
 	
 	##break;
 	case문의 마지막에 break문을 뺴먹는 실수를 하지 않도록 주의
 	상황에 따라서는 고의적으로 break문을 생략 하는 경우도 있다.
 	
 	switch(){
 		case3:
 			grantDelete();		//삭제권한을 준다
 		case2:
 			grantWritre();		//쓰기권한을 준다
 		case1:
 			grantRead();		//일기권한을 준다
 	}
 	[참고] 위의 코드는 사용자에게 읽기,쓰기, 삭제권한을 주는 기능의 ~가 존재한다는 가정하에 작성.
 		 :위의 코드는 전체 코드가 아닌, 일부를 발췌. (회원제로 운영되는 웹사이트에서 많이 사용될 만한 코드)
 		 : 로그인한 사용자의 등급(level)을 체크, 제일 낮은 등급인 1을 가진 사용자는 읽기 권한만을 가짐.
 		 ex>
 		 int level = 2;		//case 2, 1 권한을 가질 수 있음.
 		 
 		  	switch(level){
 		case3:
 			grantDelete();		//삭제권한을 준다
 		case2:
 			grantWritre();		//쓰기권한을 준다
 		case1:
 			grantRead();		//일기권한을 준다
 
 	##switch문의 제약 조건
 		1) switch문의 조건식은 결과값이 반드시 정수
 		2) case문의 값역시 정수 (중복되지 않아야 함)
 		3) case문의 값은 반드시 상수 (변수, 실수는 case문의 값으로 사용할 수 없다)
 	[참고]JDK1.7이전에는 switch문의 조건식에 문자열이 허용되지 않았다.
 	
 	##case문의 몇가지 예
 		int num, result;
 		final int ONE = 1;
 		...
 		switch (result){
 			case '1'	: //ok. 문자 상수 (정수 상수 49와 동일)
 			case ONE	: //ok.	정수 상수 (위에 final이 붙은 정수 상수)
 			case "YES"	: //ok.	문자열 상수. JDK1.7부터 허용
 			case num 	: //에러. 변수는 불가
 			case 1.0 	: //에러. 실수도 불가
 			 		
 		}
 		
 		
 	
 	
 	
 	
 	
 	
 
 
 
 
 */






//예제 4-6
package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch5_Switch1_계절 {
	
		public static void main(String[] args) {
			int month = 0;
			
			System.out.print("현재 월을 입력하세요.>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			month = Integer.parseInt(tmp);
			
			switch (month) {
				case 3:
				case 4:
				case 5:
				System.out.println("현재의 계절은 봄입니다.");
					break;
				case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");	
					break;
				case 9: case 10: case 11:
					System.out.println("현재의 계절은 가을입니다.");	
					break;
				default:	
				//case 12: case 1: case 2:
					System.out.println("현재의 계절은 겨울입니다.");	

			}//end case

//if문으로 고치면
//			if (month==3)\\(month==4)\\(month==5){
//				System.out.println("현재의 계절은 봄입니다.");
//				}else if (month==6)\\(month==7)\\(month==8){
//					System.out.println("현재의 계절은 여름입니다.");	
//				}else if (month==9)\\(month==10)\\(month==11){
//					System.out.println("현재의 계절은 가을입니다.");
//				}else {
//					System.out.println("현재의 계절은 겨울입니다.");
//				}
			
			
			
			

			

	}

}
