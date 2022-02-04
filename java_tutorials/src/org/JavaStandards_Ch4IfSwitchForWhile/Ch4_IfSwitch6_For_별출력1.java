/*p.156 ~163
#2. 반복문 - for, while, do-while
	:어떤 작업이 반복적으로 수행되도록 할때 사용
	: for문, while문에 속한 문장은 조건에 따라 한번도 수행되지 않을 수 있다.
	: do-while문에 속한 문장은 무조건 최소한 한번은 수행될 것이 보장.
	: 조건식 포함
	: for문 while문은 구조와 기능이 유사(어느 경우에나 서로 변환 가능)
	: 그러나 for문은 주로 반복 횟수를 알고 있을 때 사용!

	##2.1 for문
	:반복 횟수를 알고 있을 때 적합
		for(int i = 1; i<=5; i++) {
			System.out.println("I can do it.");
		}

	###for문의 구조와 수행순서
	: 초기화, 조건식, 증감식, 블럭{} 모두 4부분으로 이루어져 있다.
	: 조건식이 참인동안 반복, 거짓이면, 반복문을 벗어남.
		for(초기화;조건식;증감식){
				//조건식이 참일 때 수행될 문장들을 적는다.
		}
	[참고] 반복하려는 문장이 단 하나일떄는 괄호{} 생략 가능

	###초기화
	: 반복문에 사용될 변수를 초기화하는 부분, 처음에 한번만 수행
	: 보통 변수 하나로 for문을 제어
	: 둘 이상의 변수가 필요할 때는 아래와 같이 ,를 구분자로 변수를 초기화
	: 단 두 변수의 타입은 같아야 한다.
		for(int i=1; i<=10; i++){....} //변수 i의 값을 1로 초기화 한다.
		for(int i=1, j=0; i<=10; i++){....} //int타입의 변수 i와 j를 선언하고 초기화
	
	###조건식
	: 조건식의 값이 참이면 반복을 계속, 거짓이면 반복을 중단 for문을 벗어남
	: for의 뜻이 ~하는동안이므로 조건식이 '참인동안'반복을 계속한다고 생각.
	
	for(int i =1; i<=10; i++){...} //'i<=0'가 참인 동안 블럭{}안의 문장들을 반복
	-조건식을 잘못 작성하면, {}내의 문장이 한번도 수행되지 않거나 영원히 반복
	
	###증감식
	: 반복문을 제어하는 변수의 값을 증가 또는 감소 시키는 식.
	: 변수의 값이 증감식에서 점진적으로 변하다가 결국 조건식이 거짓이 되어 for문을 벗어나게 된다.
	: 여러 증감식
		for(int i=1; i<=10; i++) {...}	//1부터 10까지 1씩 증가
		for(int i=10; i>=1; i--) {...}	//10부터 1까지 1씩 감소
		for(int i=1; i<=10; i+=2){...}	//1부터 10까지 2씩 증가
		for(int i=1; i<=10; i*=3){...}	//1부터 10까지 3배씩 증가
	: 증감식도 쉼표를 이용해서 두문장 이상을 하나로 연결해서 쓸수 있다.
		for(int i=1, j=10; i<=10; i++,j--) {...} //i는 1부터 10까지 1씩 증가
												 //j는 10부터 1까지 1씩 감소
	: 지금까지 살펴본 이 세가지 요소는 필요하지 않으면 생략가능 (심지어 모두 생략 가능)
		for(;;){...}	//초기화, 조건식, 증감식 모두 생략. 조건식은 참이 된다.
		- 조건식이 생략된 경우 참으로 간주, 무한반복문이 됨.
		- 대신{}안레 if문을 넣어 특정 조건 만족 시 for문을 빠져나오게 해야함
[예제 4-12] ~4-16
	###중첩 for문
	: if문 안에 또다른 if문을 넣을 수 있는 것처럼, for문안에 또다른 for문을 포함시키는 것도 가능
	: 중첩 횟수 거의 제한이 없다.
	: for문을 설명하는데, 별찍기 만큼 좋은 것은 없다.
	: 만일 5행 10열의 별*을 찍으려면 어떻게 해야할까
	가장 간단한 방법
	1) 한줄 씩 5번 출력
	System.out.println("**********");
	System.out.println("**********");
	System.out.println("**********");
	System.out.println("**********");
	System.out.println("**********");
	2) for문을 이용하면
		for(int i=1; i<=5; i++){
			System.out.println("**********"); // 10개의 별을 출력
		}

	3) System.out.println("**********");를 for문으로 바꾸면
			for(int j=1; j<=10; j++){
			System.out.print("*");
		}
			System.out.println();
	4) 두개의 for문 이 중첩되게 만들면

		for(int i=1; i<=5; i++){
			for(int j=1; j<=10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		### 삼각형 모양의 별을 출력해보자.
		*
		**
		***
		****
		*****




 */



package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch6_For_별출력1 {

	public static void main(String[] args) {
//예제 4-12
//		for(int i = 1; i<=5; i++)
//			System.out.println(i); //세로로 출력
//		
//		for(int i = 1; i<=5; i++)
//			System.out.print(i); //가로로 출력
//		
//		System.out.println();
//예제 4-13
//		int sum = 0;		//합계를 저장하기 위한 변수
//		
//		for (int i = 1; i <= 10; i++) {
//			sum +=i;		//sum = sum +i;
//			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
//			
//		}
//		결과값 : 
//			1부터  1까지의 합:  1
//			1부터  2까지의 합:  3
//			1부터  3까지의 합:  6
//			1부터  4까지의 합: 10
//			1부터  5까지의 합: 15
//			1부터  6까지의 합: 21
//			1부터  7까지의 합: 28
//			1부터  8까지의 합: 36
//			1부터  9까지의 합: 45
//			1부터 10까지의 합: 55
//예제 4-14
//		for (int i=1, j=10; i<=10; i++, j--) {
//			System.out.printf("%d \t %d%n", i, j);	
//		}
//		결과값 : 
//			1 	 10
//			2 	 9
//			3 	 8
//			4 	 7
//			5 	 6
//			6 	 5
//			7 	 4
//			8 	 3
//			9 	 2
//			10 	 1
//하나의 변수로 위와같은 결과값 얻어내기
//		for (int i=1; i<=10; i++) {
//			System.out.printf("%d \t %d%n", i, 11-i);	
//		}
//		실행결과 : i와 j의 관계를 보면, i+j =11
//			  : j=11-i	그래서 j대신 11-i 이렇게 씀.		
//예제 4-15	for문에는 변수의 수가 적은 것이 더 효율적이고 간다. (불필요한 변수의 사용을 줄이자)
//			System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
//		System.out.println("-----------------------------------------------------");
//		
//			for(int i=1; i<=10; i++)
//				System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i,i%3, i/3);
//예제 4-16 *50개찍기 (5행 10열)
//		for(int i=1; i<=5; i++){
//			for(int j=1; j<=10; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for(int j=1; j<=5; j++){
//				System.out.print("*"); 	//*****을 출력
//			}
//			System.out.println();		//줄바꿈 한다.
//다음 단계
//		
//		for(int j=1; j<=1; j++){System.out.print("*");}System.out.println();
//		for(int j=1; j<=2; j++){System.out.print("*");}System.out.println();
//		for(int j=1; j<=3; j++){System.out.print("*");}System.out.println();
//		for(int j=1; j<=4; j++){System.out.print("*");}System.out.println();
//		for(int j=1; j<=5; j++){System.out.print("*");}System.out.println();
//다음 단계(중복 없애기, 한문장의 조건식에 숫자 대신 변수 i를 넣고
//이 문장을 i의 값이 1부터 5까지 증가하는 for문 안에 넣으면 된다.
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++){
//				System.out.print("*"); 	//*****을 출력
//			}
//			System.out.println();		//줄바꿈 한다.
//		}

		
		
		
		
		
		
	}//end main 

}//end public
