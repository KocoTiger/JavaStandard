/*p. 179~180
[예제 4-34]
 	: 이 예제는 [4-32]를 발전 시킨것임.
 	: 메뉴를 선택, 해당 연산을 반복적으로 수행할 수있게 for문을 추가
 	: while문은 메뉴를 반복해서 선택할 수 있게 해줌
 	: for문은 선택된 메뉴의 작업을 반복해서 할 수 있게 해줌.
 
 

 */


package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

	public class Ch4_IfSwitch9b_Continue2_메뉴선택2 {
	
		public static void main(String[] args) {
			int menu = 0;
			int num = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			outer:
			while(true) {
				System.out.println("(1) sqaure");
				System.out.println("(2) sqaure root");
				System.out.println("(3) log");
				System.out.print("원하는 메뉴 (1~3)를 선택하세요. (종료:0)>");

				String tmp = scanner.nextLine();//화면에 입력받은 내용을 tmp에 저장
				menu = Integer.parseInt(tmp);//입력받은 문자열(tmp)을 숫자로 변환
				
				if(menu==0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}else if(!(1 <= menu && menu <=3)){
					System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
					continue;
				}//end else if
				
				for(;;) {
					System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체종료:99>");
					tmp = scanner.nextLine(); //화면에 입력받은 내용을 tmp에 저장
					num = Integer.parseInt(tmp);//입력받은 문자열(tmp)을 숫자로 변환
					
					if(num==0)
						break;	//계산종료 for문을 벗어남
					if(num==99)
						break outer;	//전체 종료. for문과 while문을 모두 벗어난다.
					
					switch(menu) {
						case 1:
						System.out.println("result=" + num*num);
						break;
						case 2:
						System.out.println("result=" + Math.sqrt(num));
						break;
						case 3:
						System.out.println("result=" + Math.log(num));
						break;			
					}//end switch
					
				}//end for(;;)
				
				
				
//				System.out.println("선택하신 메뉴는 "+ menu + "번입니다.");
				
			}//end while

	}//end main

}
