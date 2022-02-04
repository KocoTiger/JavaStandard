/*p.150~
[예제 4-7] 
 
 
 
 
 
 
 */




package org.JavaStandards_Ch4IfSwitchForWhile;
import java.util.*;	
	public class Ch4_IfSwitch5_Switch2_가위바위보 {
	
		public static void main(String[] args) {
			int user, com;
			
			System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();	//화면을 통해 입력받은 내용을 tmp로 저장
			user = Integer.parseInt(tmp);		//입력받은 문자열 tmp를 숫자로 변환
			
			com = (int)(Math.random()*3) +1; //1,2,3중 하나가 com에 저장
			
			System.out.println("당신은 "+ user + "입니다.");
			System.out.println("컴은 "+ com + "입니다.");
			
			switch (user-com) {
				case 2: case -1:
					System.out.println("당신이 졌습니다.");
					break;
				case 1: case -2:
					System.out.println("당신이 이겼습니다.");
					break;
				case 0:
					System.out.println("비겼습니다.");
			//		break;		//마지막 문장이므로 break를 쓸 필요가 없다.
			}
			//Math.random()이값은 : 0.0포함~1.0포함하지 않은 사이의 값
			//1과 3의 정수를 구하기 위해 (범위값에 따라 *숫자 변환)
			//1) 각변에 3을 곱함	0.0 *3 <= Math.random() *3 < 1.0 *3
			//					0.0 <= Math.random() *3 < 3.0
			//2) 각변을 int형으로 변환
			//		(int)0.0 <= (int) Math.random() *3 < (int) 3.0
			//3) 각변에 1을 더함
			//		0 + 1 <= Math.random() *3 + 1 < 3 + 1
			//		1	<= Math.random() *3 + 1  < 4
			//user - com
//				com		가위(1)		바위(2)		보(3)
//			user
//			가위(1)			0		 -1			-2	
//			바위(2)			1		  0			-1	
//			보(3)			2		  1			0
			
			
	}

}
