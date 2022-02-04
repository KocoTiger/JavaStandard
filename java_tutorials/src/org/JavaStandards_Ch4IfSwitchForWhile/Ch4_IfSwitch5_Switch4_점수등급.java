/*p.153~155
[예제 4-9]
[예제 4-10]




 */



package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;
	public class Ch4_IfSwitch5_Switch4_점수등급 {
	
		public static void main(String[] args) {
			int score = 0;
			char grade = ' ';
			
			System.out.print("당신의 점수를 입력하세요. (1~100)>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			score = Integer.parseInt(tmp);
//switch문 : case가 너무 많아져 좋지 않다. 속도 향상 시, switch문이 낫겠지만
//			그렇지 않다면 if문이 더 적합			
//			switch(score) {
//				case 100: case 99: case 98: case 97: case 96:
//				case 95: case 94: case 93: case 92: case 91:
//				case 90:	
//					grade = 'A';
//					break;
//				case 89: case 88: case 87: case 86: 
//				case 85: case 84: case 83: case 82: case 81: 
//				case 80:
//					grade = 'B';
//					break;
//				case 79: case 78: case 77: case 76: 
//				case 75: case 74: case 73: case 72: case 71: 
//				case 70:	
//					grade = 'C';
//					break;
//				default:
//					grade = 'F';
//										
//			}//end switch
//			System.out.println("당신의 학점은 "+ grade + "입니다.");
//간략하게 만든 버전 (switch)
			switch(score/10) {
			case 10: case 9:
				grade = 'A';
				break;
			case 8: 
				grade = 'B';
				break;
			case 7:	
				grade = 'C';
				break;
			default:
				grade = 'F';
									
		}//end switch
		System.out.println("당신의 학점은 "+ grade + "입니다.");			
		//이처럼 개수 최소화 하는게 중요
			
	}

}
