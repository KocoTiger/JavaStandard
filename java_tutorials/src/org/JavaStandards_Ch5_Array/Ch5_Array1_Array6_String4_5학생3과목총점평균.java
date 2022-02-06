/*p.214~218
#3. 다차원 배열
	: 지금까진 배열의 1차원배열을 배움.
 	: 2차원이상의 배열, 즉 다차원 (multi-dimensional)배열도 선언해서 사용 가능.
 	: 메모리의 용량이 허용하는 한, 차원의 제한은 없다.
 	: 주로 1,2차원 배열이 사용되고 3차원 이상의 배열은 잘 사용되지 않는다.
 	: 2차원 배열만 잘 이해하고 나면 3차원 이상의 배열도 어렵지 않게 다룰 수 있다.
 	
 	##3.1 2차원 배열의 선언과 인덱스
 	: 2차원 배열을 선언하는 방법은 1차원 배열과 같다.
 	: 다만 괄[]가 하나 더 들어갈 뿐이다.
 			선언 방법						선언 예
 		타입[][]변수이름;				int[][] score;
 		타입 변수이름[][];				int score[][];
 		타입[] 변수이름[];				int[] score;
 	
 	[참고]3차원이상의 고차원 배열의 선은은 대괄호[]의 개수를 차원의 수만큼 추가해 주기만 하면 됨.
 	
 	: 2차원 배열은 주로 테이블 형태의 데이터를 담는데 사용.
 	: 만일 4행 3열의 데이터를 담기위한 배열을 생성하려면,
 		int[][] score = new int[4][3];		//4행 3열의 2차원 배열을 생성한다.
 		
 	:위 문장이 수행되면 아래의 그림처럼 4행 3열의 데이터, 모두 12개의 int값을 저장할 수 있는 공간이 마련
 			  열	   열	열		
 		행	[int][int][int]
 		행	[int][int][int]
 		행	[int][int][int]
 		행	[int][int][int]
 			
 	: 위의 그림에서는 각 요소, 즉 저장공간의 타입을 적어놓은 것이고,
 	  실제로는 배열 요소의 타입인 int의 기본값인 0이 저장된다.
 	: 배열을 생성하면, 배열의 각 요소에는 배열 요소 타입의 기본값이 자동적으로 저장
 	
 	##2차원 배열의 index
 	: 2차원 배열은 행(row), 열(column)으로 구성
 	: index도 행과 열에 각각 하나씩 존재.
 	: '행index'의 범위 : 0~행의 길이 -1
 	: '열index'의 범위 : 0~열의 길이 -1
	: 2차원 배열의 각 요소에 접근하는 방법 : '배열이름[행index][열index]'이다.		
 	: 다음과 같이 배열 score를 생성하면, score[0][0]부터 score[3][2]까지 모두 12개 (4x3=12)
 	  의 int값을 저장할 수있는 공간이 마련된다.
 	: 각 배열 요소에 접근할 수 있는 방법은 아래와 같다
 			int[][] score = new int[4][3];	//4행 3열의 2차원 배열 score생성
 	
 		  	  			0   		1			2		열 index (0~열의 길이-1)
 	행index		0[score[0][0]][score[0][1]][score[0][2]]
 0~행의 길이-1		1[score[1][0]][score[1][1]][score[1][2]]
 				2[score[2][0]][score[2][1]][score[2][2]]
 				3[score[3][0]][score[3][1]][score[3][2]]
 
 	:예를 들어 score의 1행 1열에 100을 저장하고, 이 값을 출력 하려면,
 			score[0][0] = 100;					//배열score 1행 1열에 100을 저장
 			System.out.println(score[0][0]);	//배열 score 1행 1열의 값을 출력
 
 	##3.2 2차원 배열의 초기화
 		: 2차원 배열도 괄호{}를 사용해서 생성과 초기화를 동시에 할 수 있다.
 		: 다만! 1차원 배열보다 괄호{}를 한번 더 써서 행별로 구분해 준다.
 			int[][] arr = new int[][]{ {1,2,3},{4,5,6} };
 			int[][] arr = { {1,2,3},{4,5,6} };		//new int[][]가 생략됨.

 		: 크기가 작은 배열은 위와 같이 간단히 한 줄로 써주는 것도 좋다.
 		: 가능하면 다음과 같이 행별로 주바꿈을 해주는 것이 보기도 좋고 이해하기도 좋다.
 				int[][] arr = {
 								{1,2,3},
 							  	{4,5,6}
 							  };
 
 		:만일 아래와 같은 테이블 형태의 데이터를 배열에 저장하려면.
 				국어 			영어			수학
 		1		100			100			100
 		2		20			20			20
 		3		30			30			30
 		4		40			40			40		
 		5		50			50			50
 		
 		:다음과 같이 하면 됨.
 			int[][] score = {
 						{100,100,100},
 						{20,20,20},
 						{30,30,30},
 						{40,40,40},
 						{50,50,50}	
 					};
 		[참고 그림 5-52차원 배열]score메모리는 p.216 쪽 그림 참고
 		
 		: 그림 5-5에서 알 수 있듯이 2차원 배열은 '배열의 배열'로 구성
 		  즉, 여러개의 1차원 배열을 묶어서 또 하나의 배열로 만든것.
 		: 그러면, 여기서 score.length의 값은 얼마일까?
 		: 배열 참조변수 score가 참조하고 있는 배열의 길이가 얼마인가를 세업보면 될 것.
 		: 정답은 5!
 		: 그리고 score[].length은 배열 참조변수 score[0]이 참조하고 있는 배열의 길이이므로 3
 		: 같은 이유로 score[1].length, score[2].length, score[3].length, score[4].length
 		  의 값 역시 모두 3
 		: 만일 for문을 이용해서 2차원 배열을 초기화 하면,
 		
 		int[][] score = {
 						{100,100,100},
 						{20,20,20},
 						{30,30,30},
 						{40,40,40},
 						{50,50,50}	
 					};
 					
 			for(int i=0; i<score.length; i++){
 					for(int j=0; j<score[i].length; j++){
 							score[i][j] = 10;
 					}
 			}
 		: 위의 코드는 2차원 배열 score의 모든 요소를 10으로 초기화 한다.

 [예제 5-18]		
 [예제 5-19]
 		
 		
 		
 		
 		
 
 */







package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String4_5학생3과목총점평균 {

	public static void main(String[] args) {
// [예제 5-18]			
//		int [][] score = {
//							{100,100,100},
//							{20,20,20},
//							{30,30,30},
//							{40,40,40}				
//						};
//		int sum = 0;
//		
//		for (int i=0; i<score.length; i++) {		//score.length =4
//			for(int j =0; j < score[i].length; j++) {	//score[i].length = 3
//				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
//			}
//		}
//		
//		for(int[] tmp : score) {
//			for(int i : tmp) {
//				sum += i;
//			}
//		}
//		
//		System.out.println("sum="+sum);

//		결과값:
//			score[0][0]=100
//			score[0][1]=100
//			score[0][2]=100
//			score[1][0]=20
//			score[1][1]=20
//			score[1][2]=20
//			score[2][0]=30
//			score[2][1]=30
//			score[2][2]=30
//			score[3][0]=40
//			score[3][1]=40
//			score[3][2]=40
//			sum=570	
/*
		: 2차원 배열 score의 모든 요소의 합을 구하고, 출력하는 예제
		: 하나의 이중 for문으로 처리가 가능한 작업이지만, 향상된 for문으로 2차원 배열의 모든 요소를 읽어오는 방법을
		  보여주기 위해 출력과 합계를 따로 처리
				
				for(int i : score){		//에러. 2차원 배열 score의 각 요소는 1차원 배열
						sum += i;
				}
		
		: 이렇게 간단히 되면 좋겠지만, 2차원 배열 score의 각 요소는 1차원 배열이므로
		  아해와 같이 for문을 하나더 추가해야 한다.
				
			for(int[] tmp : score) { 	//score의 각 요소(1차원 배열 주소)를 tmp에 저장
				for(int i : tmp) {		//tmp는 1차원 배열을 가리키는 참조 변수
					sum += i;
				}
			}
		
		: 향상된 for문으로 배열의 각요소에 저장된 값들을 순차적으로 읽어올 수는 있지만,
		  배열에 저장된 값을 변경할 수 없다.
		 
 */
//[예제 5-19]	
		int [][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};		
		//과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println(" 번호  국어  영어  수학  총점  평균");
		System.out.println("==============================");
		
		for(int i=0; i<score.length; i++) {	//score.length = 5
			int sum = 0;			//개인별 총점
			float avg = 0.0f;		//개인별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			
			for(int j=0; j < score[i].length; j++) { //score[i].length = 3
				sum += score [i][j];
				System.out.printf("%5d", score[i][j]);
			}//end for j
			
			avg = sum /(float)score[i].length;	//평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}//end for i
		System.out.println("================================");
		System.out.printf("총점: %3d %4d %4d%n",korTotal,engTotal,mathTotal );
		
/*
		: 5명 학생의 세 과목 점수를 더해서 각 학생의 총점과 평균을 계산
		: 과목별 총점을 계산하는 예제
		결과값 : 
		 번호  국어  영어  수학  총점  평균
		==============================
		  1  100  100  100  300 100.0
		  2   20   20   20   60  20.0
		  3   30   30   30   90  30.0
		  4   40   40   40  120  40.0
		  5   50   50   50  150  50.0
		================================
		총점: 240  240  240		

		
 */
		
		
		
		
	}//end main
}//end public
