package BitCamp_Code_20220207;

import java.util.Scanner;
/*
 * FileName: Example1.java
 * 
 * 숫자를 입력받아 (1~100) 90이상 '수', 80점이상 '우', 70점이상 '미', 60점이상 '양'
 * 그 이하는 '가'를 출력하기
 * (입력한 값이 0~100상이 있어야한다. 그 이상 이하는 어떻게 처리할것인가)
 * 
 * 실행예>java Example1 95
 * 
 * */
public class BitCampComputer00_실습과제01_4숙제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.print("java Test4");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(true) {
			if (num>0&&num<=100)
				break;
			System.out.println("1~100 숫자를 입력하시오.");
			num = sc.nextInt();		
		}
		//sc.close();		
		
		System.out.print("==>실행결과(출력결과...)\n입력하신 값 "+num+"점은 ");
		if (num>=90)
			System.out.println("수입니다.");
		else if (num>=80)
			System.out.println("우입니다.");			
		else if(num>=70)
			System.out.println("미입니다.");						
		else if(num>=60) 
			System.out.println("양입니다.");						
		else
			System.out.println("가입니다.");
		
//		if(num>100) {
//			System.out.println("1~100 숫자를 입력하시오.");
//		}
//		else if(num>0&&num<100) {
//			System.out.println("==>실행결과(출력결과...)\n입력하신 값"+num+"점은");
//			if(num>=90) {
//				System.out.println("수입니다.");
//			}
//		}
		
		
	}

}
