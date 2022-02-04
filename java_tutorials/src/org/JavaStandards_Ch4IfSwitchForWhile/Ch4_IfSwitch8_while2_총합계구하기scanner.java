/*p. 170 ~
[예제4-25]
  
  
 */




package org.JavaStandards_Ch4IfSwitchForWhile;

import java.util.*;

public class Ch4_IfSwitch8_while2_총합계구하기scanner {

	public static void main(String[] args) {

//[예제4-25]		
//		int num = 0;
//		int sum = 0;
//		
//		System.out.print("숫자를 입력하세요.(예:12345)>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			//num을 10으로 나눈 나머지를 sum에 더함
//			sum+= num%10;	//sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num/=10;	//num = num/10; num을 10으로 나눈 값을 다시 num에 저장
//		}
//		
//		System.out.println("각 자리수의 합:"+ sum);
/*
		##어떤 수를 10으로 나머지 연산 : 마지막 자리를 얻을 수 있다.
		##어떤 수를 10으로 나누기 연산 : 마지막 한자리가 제거.
		
		12345 % 10 -> 5
		12345 / 10 -> 1234
[참고] p.171		
		
 */
//[예제4-26]	
//		int sum = 0;
//		int i = 0;
//		
//		while ((sum += ++i) <=100) {	//i를 1씩 증가시켜서 sum에 계속 더해나간다.
//			System.out.printf("%d - %d%n", i, sum);
//			
//		}
/* 이식을 분해해보면
		while ((sum += ++i) <=100)
		
		sum += ++i	//i의 값을 1증가 시켜서 sum에 누적
		sum <= 100	//sum의 값이 100보다 작거나 같은지 확인.

 		
 */
//[예제4-27]	
		int num;
		int sum = 0;
		boolean flag = true;	//while문의 조건식으로 사용될 변수
		
		System.out.print("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		
		while (flag) {	//flag의 값이 true이므로 조건식은 참이 된다.
				System.out.print(">>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		if(num!=0) {
			sum +=num; //num이 0이 아니면,sum에 더한다.
		}else {
			flag = false;	//num이 0이면, flag의 값을 false로 변경
		}
		
		System.out.println("합계:"+sum);
		
		}//end while
	}

}
