/*p. 139~139
[예제 4-2]



*/





package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;	//scanner클래스를 사용하지 위해 추가

	public class Ch4_IfSwitch2If {
	
		public static void main(String[] args) {
			int input;
			
			System.out.print("숫자를 하나 입력하세요.");
			
			Scanner scanner = new Scanner (System.in);
			String tmp = scanner.nextLine();	//화면을 통해 입력받은 내용을 tmp에 저장
			input = Integer.parseInt(tmp);		//입력받은 문자열(tmp)을 숫자로 변환
			
			if (input==0) {
				System.out.println("입력하신 숫자는 0입니다");
			}

			if (input!=0) {
				System.out.println("입력하신 숫자는 0이 아닙니다"); //if문 안의 문장
				System.out.printf("입력하신 숫자는 %d입니다", input); //if문 밖의 문장 (항상 출력)
			}
	
			
		}//end main
	
	}//end class
