/*p.219~222
##가변 배열
	: 2차원 이상의 다차원 배열을 생성할 때 전체 배열 차수 중, 마지막 차수의 길이를 지정하지 않고
	  추후에 각기 다른 길이의 배열을 생성함으로써 고정된 형태가 아닌 보다 유동적인
	  가변 배열을 구성할 수 있다.
	: 만일 다음과 같이 5 x 3길이의 2차원 배열 score를 생성하는 코드가 있을 때.
	
			int [][] score = new int[5][3];	//5행 3열의 2차원 배열 생성
	
	: 위 코드를 다음과 같이 표현 가능
			int[][] score = new int[5][]; 	//두번째 차원의 길이는 지정하지 않는다.
			score[0] = new int[3];
			score[1] = new int[3];
			score[2] = new int[3];
			score[3] = new int[3];
			score[4] = new int[3];
	
	: 첫번째 코드와 같이 2차원 배열을 생성하면 직사각형 테이블 형태의 고정적인 배열만 생성 할 수 있지만,
	  두번째 코드와 같이 2차원 배열을 생성하면, 다름과 같이 각 행마다 다른 길이의 배열을 생성하는
	  것이 가능하다.
	  		
	  		int[][] score = new int[5][];
	  		score[0] = new int[4];
			score[1] = new int[3];
			score[2] = new int[2];
			score[3] = new int[2];
			score[4] = new int[3];
	 : score.length의 값은 여전히 5지만, 일반적인 2차원 배열과 달리
	   score[0].length의 값은 4
	   score[1].length의 값은 3
	   으로 서로 다르다.
	 : 가변 배열 역시 중괄호{}를 이용해서 다음과 같이 생성과 초기화를 동시에 하는 것이 가능하다.
	 
	 		int[][] score = {
	 							{100,100,100,100},
	 							{20,20,20},
	 							{30,30},
	 							{40,40},
	 							{50,50,50}
	 						};
		[플래시 동영상] MultiDim.exe을 보면 가변배열의 생성과정을 자세히 볼 수 있다.

	##3.4 다차원 배열의 활용
		: 다차원 배열의 대표적인 예제 4가지
	[예제 5-20] 좌표에 x표 하기	입력한 2차원 좌표의 위치에 x를 표시
	[예제 5-21] 빙고			빙고판을 만들고 입력받은 숫자를 빙고판에서 지운다
	[예제 5-22] 행렬의 곱셈		두 행렬(matrix)을 곱한 결과를 출력
	[예제 5-23] 단어 맞추기		영어 단어를 보여주고, 뜻을 맞추는 게임
	







 */







package org.JavaStandards_Ch5_Array;

import java.util.*;

	public class Ch5_Array1_Array6_String5_좌표x {
	
		public static void main(String[] args) {
			
			final int SIZE = 10;
			int x = 0, y = 0;
			
			char[][] board = new char [SIZE][SIZE];
			byte[][] shipBoard = {
								// 1  2  3  4  5  6  7  8  9
								 { 0, 0, 0, 0, 0, 0, 1, 0, 0},	//1
								 { 1, 1, 1, 1, 0, 0, 1, 0, 0},	//2
								 { 0, 0, 0, 0, 0, 0, 1, 0, 0},	//3
								 { 0, 0, 0, 0, 0, 0, 1, 0, 0},	//4
								 { 0, 0, 0, 0, 0, 0, 0, 0, 0},	//5
								 { 1, 1, 0, 1, 0, 0, 0, 0, 0},	//6
								 { 0, 0, 0, 1, 0, 0, 0, 0, 0},	//7
								 { 0, 0, 0, 1, 0, 0, 0, 0, 0},	//8
								 { 0, 0, 0, 0, 0, 1, 1, 1, 0},	//9
								};
			//1행에 행번호를, 1열에 열번호를 저장한다.
			for(int i=1; i<SIZE; i++) {
				board[0][i] = board[i][0] = (char)(i+'0'); 
			}
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.printf("좌표를 입력하세요.(종료는 00)>");
				String input = scanner.nextLine();	//화면입력받은 내용을 input에 저장
			
			if(input.length()==2) {		//두 글자를 입력한 경우
				x = input.charAt(0) - '0';	//문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)	//x와 y가 모두 0인 경우 종료
					break;
				}//end if input
			
			if(input.length()!=2 || x <= 0 || x>=SIZE || y<=0 || y>=SIZE){
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			//shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
			  board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
			
			//배열 board의 내용을 화면에 출력한다.
			  for(int i=0; i<SIZE; i++) {
				  System.out.println(board[i]);	//board는 1차원 배열
			  }
			  
			  System.out.println();
			  
			}//end while
/*
		: 둘이 마주앉아 다양한 크기의 배를 상대방이 알지 못하게 배치한 다음.
		  번갈아 가며 좌표를 불러서 상대방의 배의 위치를 알아내는 게임
		: 2차원 char배열 board는 입력한 좌표를 표시하기 위한 것
		: 2차원 byte배열 shipBoard에는 상대방의 배의 위치를 저장한다.
		: 0은 바다, 1은 배가 떠있는 것.
		char[][] board = new char [SIZE][SIZE];
			byte[][] shipBoard = {
								// 1  2  3  4  5  6  7  8  9
								 { 0, 0, 0, 0, 0, 0, 1, 0, 0},	//1
								 { 1, 1, 1, 1, 0, 0, 1, 0, 0},	//2
								 { 0, 0, 0, 0, 0, 0, 1, 0, 0},	//3
								 { 0, 0, 0, 0, 0, 0, 1, 0, 0},	//4
								 { 0, 0, 0, 0, 0, 0, 0, 0, 0},	//5
								 { 1, 1, 0, 1, 0, 0, 0, 0, 0},	//6
								 { 0, 0, 0, 1, 0, 0, 0, 0, 0},	//7
								 { 0, 0, 0, 1, 0, 0, 0, 0, 0},	//8
								 { 0, 0, 0, 0, 0, 1, 1, 1, 0},	//9
								};	
			
		: 배열 board는 좌표를 쉽게 입력하기 위한 행번호와 열번호가 필요
		: 그래서 배열 board가 배열 shiprBoard보다 행과 열의 길이가 1씩 큰것
			//1행에 행번호를, 1열에 열번호를 저장한다.
			for(int i=1; i<SIZE; i++){
				board[0][i] = board[i][0] = (char)(i+'0'); //(char)(1+'0') ->'1'
			}											   //(char)(2+'0') ->'2'
		
		: board는 char 배열. 숫자를 문자로 변환하여 저장해야함.
		: 변수 i에 문자 '0'을 더한다.
		: 숫자 1에 문자 '0'(문자코드 48)을 더하면 문자'1'( 문자코드 49)이 됨
		: 다음은 무한 반복문으로 좌표를 반복해서 입력받는다.
		: 입력받은 좌표 x,y에 저장된 값이 1이면, board[x][y]에 'O'를 저장
		  1이 아니면 'X'를 저장
		: 배열 board와 shipBoard간에는 좌표가 가로, 세로로 각각 1씩 차이가 난다는 점을 잊지 말자.
		
		: 그리고 2차원 char배열의 각 요소는 1차원 배열
		: 아래의 왼쪽과 같이 간단히 출력 할 수 있다.
		: 원래는 오른쪽과 같이 배열의 각 요소를 하나씩 출력 해야함.
		: println메서드로 1차원 char배열의 참조변수를 출력하면, 배열의 모든 요소를 한줄로 출력
		[참고]그림 5-5 에서 알수 있듯, 2차원 배열의 각 요소는 1차원 배열의 참조 변수 역할을 한다.
	
	[왼쪽]
	  for(int i=0; i<SIZE; i++) {
		 System.out.println(board[i]);	//board는 1차원 배열
	  }	
		
			
	[오른쪽]		
	  for(int i=0; i<SIZE; i++) {
	  	for(int j=0; j<SIZE; j++){
		 System.out.print(board[i][j]);	//board는 1차원 배열
	  }			
	  System.out.println();
	 }
	
			: println메서드가 모든 1차원 배열을 이렇게 출력할 수 있는것은 아님
			: char배열인 경우만 가능
			
 */
			
			
			
	}

}
