/*p.144~146
1.4 중첩 if문
	: if문의 블럭 내에 또 가른 if문을 포함시키는 것이 가능
	: 이것을 if중첩문이라고 부른다
	: 중첩의 횟수에는 거의 제한이 없다.

		if(조건식1){
		//조건식 1의 연산결과가 true일때 수행될 문장들을 적는다
				if (조건식2){
		//조건식1과 조건식 2가 모두 true일때 수행될 문장들
				}else{
				조건식1이 true, 조건식2가 false일때 수행되는 문장들
				}
				}else {
					//조건식 1이 false일때 수행되는 문장들.
		}
	: 중첩 if문에서는 괄호{}의 생략에 더욱 조심해야한다.
	






 */







//예제4-5
package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch4If중첩문_점수등급 {
	
		public static void main(String[] args) {
			
			int score = 0;
			char grade = ' ';
			char opt = '0';
			
			System.out.print("점수를 입력해주세요.>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();//화면을 통해 입력받은 내용을 tmp에 저장
			score = Integer.parseInt(tmp);	//입력받은 문자열(tmp)을 숫자로 변환
			
			System.out.printf("당신의 점수는 %d입니다.%n", score);
			
			if(score >=90) {
				grade = 'A';
				if(score >=98) {
					opt = '+';
				}else if (score < 94) {
					opt = '-';
				}
			}else if (score >=80) {
				grade = 'B';
				if (score >=88) {
					opt = '+';
				}else if (score < 84) {
					opt = '-';
					}
			}else {
				grade = 'c';
			}
			
			System.out.printf("당신의 학점은 %c%c 입니다.%n",grade, opt);
			
		}//end main
	
	}//end public
