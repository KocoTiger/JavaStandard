/*p. 142~143

[예제 4-4 참고]	







*/




package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch3IfElse2 {
	
		public static void main(String[] args) {
			int score = 0;		//점수를 저장하기 위한 변수
			char grade = ' ';	//학점을 저장하기 위한 변수. 공백으로 초기화한다.
			
			System.out.print("점수를 입력하세요.>");
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
			score = Integer.parseInt(tmp);	 //입력받은 문자열 (tmp)를 숫자로 변환
			
			if(score >= 90) {		//score가 90점 보다 같거나 크면 A학점
				grade = 'A';
			}else if(score >= 80){	//score가 80점 보다 같거나 크면 A학점
				grade = 'B';
			}else if(score >= 70){	//score가 70점 보다 같거나 크면 A학점
				grade = 'C';
			}else {					//나머지는 D학점
				grade = 'D';
			}
			
			System.out.println("당신의 학점은 "+ grade + "입니다.");

//이식을 보면, 이렇게 써야 할것 같지만, 위의 if가 false가 되어서 내려온것이기 때문에
//간단히,else if(score >= 80), else if(score >= 70) 이렇게 쓸수 있음.
//		}else if(80 <= score && score < 90){	//score가 80점 보다 같거나 크면 A학점
//			grade = 'B';
//		}else if(70 <= score && score < 80){	//score가 70점 보다 같거나 크면 A학점
//			grade = 'C';
//if이 여러개가 합성되어서 else if를 구성 한다고 하지만, if문으로 쪼개놓으면 전혀 다른 코드가 된다.			
//			
			
			
			
			
			
			
			
			
	}//end main

}//end public
